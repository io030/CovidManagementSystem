package com.project.patientmenu;

import java.util.Calendar;
import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.medicalstaff.MedicalInfo;
import com.project.patientcondition.PatientCondition;

/**
 * PatientInfo 클래스입니다. 
 * 환자 상태를 입력합니다.
 * 
 * @author 2조
 * 
 */
public class PatientInfo {

	/**
	 * 메소드입니다.
	 * 환자의 고유번호를 받아 환자의 상태를 입력합니다.
	 * 동일한 일자에 3번의 상태 기록이 있으면 하루 측정 횟수를 모두 만족시키므로 작성할 수 없습니다.
	 * 측정 날짜와 측정 시간은 Calendar를 사용하여 당일 날짜와 작성 시각(24시간 기준)을 자동 생성합니다.
	 * 상태 기록사항 - 체온, 이완기 혈압, 수축기 혈압, 맥박, 산소포화도
	 * 
	 * @param pNumber 환자 고유번호
	 */
	public static void begin(int pNumber) {

		boolean flag = true;
		boolean duplication = false;
		int ward = DataService.getWard(pNumber);

		Scanner scan = new Scanner(System.in);

		Calendar now = Calendar.getInstance();
		String date = String.format("%tF", now);
		int time = now.get(Calendar.HOUR_OF_DAY);

		while (flag) {

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃          환자 상태 입력           ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			for (MedicalInfo medicalInfo : Data.medicalInfoList) {
				if (medicalInfo.getmDate().equals(date) && medicalInfo.getmNumber() == pNumber) {
					duplication = true;
					break;
				}
			}

			if (duplication) {
				System.out.println("오늘 하루의 측정 기록을 모두 기록하였습니다. ");
				System.out.println("===================================================================");

			} else {
				System.out.printf("측정 날짜: " + date);
				System.out.println();
				System.out.println("===================================================================");
				// String date = scan.nextLine();

				System.out.print("측정 시간: " + time);
				System.out.println();
				System.out.println("===================================================================");
				// int time = scan.nextInt();
				// scan.nextLine();

				System.out.println("체온 입력시, 체온계에 나온 소수점 첫째자리 수까지 모두 입력하세요. ");
				System.out.print("[체온]: ");
				String temperature = scan.nextLine();
				System.out.println("===================================================================");

				System.out.println("혈압 측정결과 중 작은 수를 입력하세요.");
				System.out.print("[최저 혈압] (이완기 혈압): ");
				String diastolic = scan.nextLine();
				System.out.println("===================================================================");

				System.out.println("혈압 측정결과 중 큰 수(3자리)를 입력하세요.");
				System.out.print("[최고 혈압] (수축기 혈압): ");
				String systolic = scan.nextLine();
				System.out.println("===================================================================");

				System.out.println("심박수 측정기의 결과를 입력하세요.");
				System.out.print("[맥박]: ");
				String pulse = scan.nextLine();
				System.out.println("===================================================================");

				System.out.println("산소 포화도 측정기의 결과를 입력하세요.");
				System.out.print("[산소 포화도]: ");
				String oxygen = scan.nextLine();
				System.out.println("===================================================================");

				System.out.println("의료진에게 전달할 사항을 임력하세요.");
				System.out.println("만약, 입력할 사항이 없으면 엔터를 입력하세요.");
				System.out.print("[기타 사항]: ");
				String etc = scan.nextLine();

				if (etc.equals("")) {
					etc = "없음";
				}
				System.out.println("===================================================================");

				if (DataService.isValid(temperature, diastolic, systolic, pulse, oxygen, etc)) {
					System.out.println("입력 완료");
					System.out.println("===================================================================");

					System.out.println("[측정 날짜]: " + date);
					System.out.println("[측정 시간]: " + time);
					System.out.println("[체온]: " + temperature);
					System.out.println("[최저 혈압](이완기 혈압): " + diastolic);
					System.out.println("[최고 혈압](수축기 혈압): " + systolic);
					System.out.println("[맥박]: " + pulse);
					System.out.println("[산소포화도]: " + oxygen);
					System.out.println("[기타사항]: " + etc);
					System.out.println("===================================================================");

					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("┃    [0] 돌아가기   [1] 저장하기    ┃");
					System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
					System.out.print("저장: ");
					String save = scan.nextLine();
					System.out.println("===================================================================");

					if (save.equals("1")) {

						PatientCondition condition = new PatientCondition();

						condition.setPcDate(date);
						condition.setPcTime(time);
						condition.setPcTemperature(Double.parseDouble(temperature));
						condition.setPcDiastolic(Integer.parseInt(diastolic));
						condition.setPcSystolic(Integer.parseInt(systolic));
						condition.setPcPulse(Integer.parseInt(pulse));
						condition.setPcOxygen(Integer.parseInt(oxygen));
						condition.setPcEtc(etc);
						condition.setPcRoom(ward);
						condition.setPcNumber(pNumber);

						Data.patientconditionList.add(condition);
						Data.save();

						System.out.println("입력이 완료되었습니다.");
						System.out.println("===================================================================");

					} else if (save.equals("0")) {
						System.out.println("취소되었습니다.");
						System.out.println("===================================================================");

					} else {
						System.out.println("번호를 잘못 입력하였습니다.");
					} // save_if

				} else {
					System.out.println("입력 실패");
					System.out.println("===================================================================");
				} // isValid

			} // duplication_if

			Data.pause();
			String input = scan.nextLine();
			if (input.equals("0")) {
				flag = false;
			}

		} // while

		scan.close();
		
	}// begin

}// PatientInfo