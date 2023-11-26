package com.project.dummy;

import java.io.FileWriter;
import java.util.Calendar;
import java.util.Random;

/***
 * Dummy 클래스입니다. 환자, 간호사, 의사, 환자 상태, 진료 기록, 약 정보를 더미 데이터로 생성합니다.
 * @author 2조
 *
 */
public class Dummy {

	/***
	 *  main 메소드입니다. 더미 데이터를 생성하고 실패시 오류 정보를 출력합니다.
	 * @param args - 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			patientDummy();
			doctorDummy();
			nurseDummy();
			patientConditionDummy();
			medicalinfo();
			medicine();
		} catch (Exception e) {

			System.out.println("Dummy.main");
			e.printStackTrace();

		} // catch
	} // main

	private static void medicine() throws Exception {

		Random rnd = new Random();

		FileWriter writer = new FileWriter(".\\dat\\medicine.txt");

		String[] medicineType = { "해열제", "비스테로이드성 소염진통제", "진해거담제 및 기침감기약", "비염 및 콧물약", "위장운동조절제", "제산제", "근이완제" };

		String[] antipyretic = { "삼남아세트아미노펜정", "엔시드이알서방정", "아이소펜정", "룩펜정" }; // 해열제
		String[] nonsteroidalAntiinflammatoryDrug = { "르포닌정", "펠루비정", "펜타우드정", "안국록소프로펜나트륨정" }; // 비스테로이드성 소염진통제
		String[] antitussive = { "코대원정", "비알코 시럽", "움카민플러스 시럽", "일양바이오아세틸시스테인캡슐" }; // 진해거담제 및 기침감기약
		String[] rhinitis = { "피디원정", "메솔론정", "베포리진정", "슈페린정" }; // 비염 및 콧물약
		String[] prokineticDrug = { "가모드정", "포리부틴드라이 시럽", "맥페란정", "모사프로딘정" }; // 위장운동조절제
		String[] antacid = { "알긴나지액", "알마겔정", "알피레바미피드정", "마그엠정" }; // 제산제
		String[] muscleRelaxant = { "우리들에페리손정", "대웅바이오에페리손정", "리락스정", "머렉스정" }; // 근이완제

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				String data = String.format("%s,%s", /* %s 처방약 종류 */ medicineType[i], /* %s 처방약 */ i == 1
						? antipyretic[j]
						: i == 2 ? nonsteroidalAntiinflammatoryDrug[j]
								: i == 3 ? antitussive[j]
										: i == 4 ? rhinitis[j]
												: i == 5 ? prokineticDrug[j] : i == 6 ? antacid[j] : muscleRelaxant[j]);
				System.out.println(data);
				writer.write(data + "\r\n");

			} // j
		} // i

		writer.close();

	} // medicine

	private static void medicalinfo() throws Exception {
		// 날짜 - 진료 내용 - 처치 결과 - 중증도 - 처방약
		// %s,%s,%s,%s,%s,%d
		// 날짜 - 설사를 한다 - 처치( 해열제 처방하기 ) - 알레르기약
		Random rnd = new Random();
		int patientNo = 1;
		FileWriter writer = new FileWriter(".\\dat\\medicalinfo.txt");
		String[] medicalrecords = { "발열", "오한", "두통", "소화불량", "인후통", "코 막힘", "미각상실", "가래", "몸살", "식욕부진" };
		String[] medicalTreatment = { "해열제 처방", "진통제 처방 ", "제산제 처방", "소염 효소제 처방", "진해 거담제 처방", "근이완제 처방" };
		String[] severity = { "중증", "위증" };
		String[] medicine = { "록스로펜정", "삼남아세트아미노펜정", "메솔론정", "비알코시럽", "가모드정", "알긴나지액", "펠루비정" }; // 약 정식명칭 일단 더미라서 각
																									// 종류별로 1개씩
		String[] name1 = { "김", "이", "박", "정", "최", "손", "유" };
		String[] name2 = { "신", "석", "효", "정", "진", "현", "재", "형", "민", "돈", "수", "나", "연", "찬", "균", "동", "경", "하",
				"영", "현" };
		for (int i = 1; i <= 350; i++) {

			int date = rnd.nextInt(27) + 1;
			String data = String.format("%s,%s,%s,%s,%s,%d",
					/* %s 측정 날짜 */ "2022-09-" + (date <= 9 ? "0" + date : date),
					/* %s 진료 기록 */medicalrecords[rnd.nextInt(medicalrecords.length)],
					/* %s 처치 결과 */medicalTreatment[rnd.nextInt(medicalTreatment.length)],
					/* %s 중증도 */ severity[rnd.nextInt(severity.length)],
					/* %s 처방약 */medicine[rnd.nextInt(medicine.length)], 

					/* %d 환자 정보 */patientNo);
			patientNo++;
			System.out.println(data);
			writer.write(data + "\r\n");
		} // i
		writer.close();

	}

	private static void patientConditionDummy() throws Exception {
		// 환자 상태 더미 정보 생성
		// 측정시간 , 환자 체온 , 환자 최저혈압(이완기 혈압) , 환자 최고혈압(수축기 혈압) , 환자 맥박 , 환자의 산소포화도 , 기타 사항
		// 환자 번호 , 병실
		Random rnd = new Random();
		int patientNo = 1;
		FileWriter writer = new FileWriter(".\\dat\\patientcondition.txt");
		String[] etc = { "머리가 아프다", "숨 쉬기 힘들다", "목이 아프다", "설사를 한다", "오한이 느껴진다", "소화가 안된다", "코가 막힌다" };
		for (int i = 1; i <= 350; i++) {

			int date = rnd.nextInt(27) + 1;
			String data = String.format("%s,%d,%.1f,%d,%d,%d,%d,%s,%d,%d",
					/* %s 측정 날짜 */ "2022-09-" + (date <= 9 ? "0" + date : date),
					/* %d 측정 시간 24시간제 숫자만 입력 */rnd.nextInt(14) + 9, // 9 ~ 22시
					/* %.1f 환자 체온 */ (double) (Math.random() * 5.5) + 35.5, // 35.5 ~ 40
					/* %d 환자 최저혈압 */rnd.nextInt(31) + 70, // 70 ~ 100
					/* %d 환자 최고혈압 */rnd.nextInt(41) + 110, // 110 ~ 150
					/* %d 환자 맥박 */ rnd.nextInt(56) + 55, // 55 ~ 110
					/* %d 환자의 산소포화도 */rnd.nextInt(16) + 80, // 80 ~ 95
					/* %s 기타 사항 */ etc[rnd.nextInt(etc.length)], /* %d 환자 번호 */ patientNo, /* %d 환자 병실 */ i);
			System.out.println(data);
			writer.write(data + "\r\n");
			patientNo++;

		} // i
		writer.close();
	}// patientConditionDummy

	private static void nurseDummy() throws Exception {
		// 간호사 더미 정보 생성
		// 의료진 이름,의료진 나이,의료진 주민등록번호,의료진 성별,의료진 키 , 의료진 몸무게 ,의료진 전화번호,의료진 주소,간호사면허번호
		// 의료진 담당부서 (소아 청소년과, 감염 내과)

		Random rnd = new Random();

		String jumin = "";
		String gender = "";

		String[] name1 = { "김", "이", "박", "정", "최", "손", "유" };
		String[] name2 = { "신", "석", "효", "정", "진", "현", "재", "형", "민", "돈", "수", "나", "연", "찬", "균", "동", "경", "하",
				"영", "현" };
		
		String[] address1 = { "서울시 대치동", "서울시 역삼동", "서울시 세곡동", "서울시 도곡동", "서울시 개포동", "성남시 구미동", "성남시 금곡동", "성남시 야탑동",
				"성남시 서현동", "성남시 수내동", "서울시 대치동", };
		String[] department = { "소아청소년과", "감염내과" };
		FileWriter writer = new FileWriter(".\\dat\\nurse.txt");

		for (int i = 1; i <= 70; i++) {

			int age = rnd.nextInt(26) + 25; // 25 ~ 50
			int connectionNum = rnd.nextInt(30) + 1;

			jumin = getJumin(age);
			gender = (jumin.charAt(7) == '1' || jumin.charAt(7) == '3' || jumin.charAt(7) == '9') ? "남자" : "여자";

			String data = String.format("%s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s,%d",
					/* %s 의료진 이름 */name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)]
							+ name2[rnd.nextInt(name2.length)],
					/* %d 의료진 나이 */age, /* %s 의료진 주민등록번호 */jumin, /* %s 의료진 성별 */gender,
					/* %.1f 의료진 키 */(gender.equals("여자")) ? (double) (Math.random() * 21) + 155
							: (double) (Math.random() * 21) + 170, // 155 ~ 175 , 170 ~ 190
					/* %.1f 의료진 몸무게 */(gender.equals("여자")) ? (double) (Math.random() * 26) + 50
							: (double) (Math.random() * 26) + 60, // 50 ~ 75, 60 ~ 85
					/* %s 의료진 전화번호 */"010" + "-" + Integer.toString(rnd.nextInt(9000) + 1000) + "-"
							+ Integer.toString(rnd.nextInt(9000) + 1000),
					/* %s 의료진 주소 */String.format("%s %d번지", address1[rnd.nextInt(address1.length)],
							rnd.nextInt(50) + 1),
					/* %s 의료진 면허 번호 */ (i <= 9) ? ("N" + "2" + "0" + "0" + i)
							: (i >= 100) ? ("N" + "2" + i) : ("N" + "2" + "0" + i),
					/* %s 담당 부서 */department[rnd.nextInt(department.length)], /* %d 연결 번호 */connectionNum);
			System.out.println(data);
			writer.write(data + "\r\n");

		} // i
		writer.close();

	}// nurseDummy

	private static void doctorDummy() throws Exception {
		// 의사 더미 정보 생성
		// 의료진 이름,의료진 나이,의료진 주민등록번호,의료진 성별,의료진 키 , 의료진 몸무게 ,의료진 전화번호,의료진 주소,의사면허번호
		// 의료진 담당부서 (소아 청소년과, 감염 내과)
		Random rnd = new Random();

		String jumin = "";
		String gender = "";

		String[] name1 = { "김", "이", "박", "정", "최", "손", "유" };
		String[] name2 = { "신", "석", "효", "정", "진", "현", "재", "형", "민", "돈", "수", "나", "연", "찬", "균", "동", "경", "하",
				"영", "현" };
		String[] answer = { "예", "아니요" };
		String[] address1 = { "서울시 대치동", "서울시 역삼동", "서울시 세곡동", "서울시 도곡동", "서울시 개포동", "성남시 구미동", "성남시 금곡동", "성남시 야탑동",
				"성남시 서현동", "성남시 수내동", "서울시 대치동", };
		String[] department = { "소아청소년과", "감염내과" };

		FileWriter writer = new FileWriter(".\\dat\\doctor.txt");
		int connectionNo = 1;
		for (int i = 1; i <= 30; i++) {
			int age = rnd.nextInt(31) + 35; // 35 ~ 65

			jumin = getJumin(age);

			gender = (jumin.charAt(7) == '1' || jumin.charAt(7) == '3' || jumin.charAt(7) == '9') ? "남자" : "여자";

			String data = String.format("%s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s,%d",
					/* %s 의료진 이름 */name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)]
							+ name2[rnd.nextInt(name2.length)],
					/* %d 의료진 나이 */age, /* %s 의료진 주민등록번호 */jumin, /* %s 의료진 성별 */gender,
					/* %.1f 의료진 키 */(gender.equals("여자")) ? (double) (Math.random() * 21) + 155
							: (double) (Math.random() * 21) + 170, // 155 ~ 175 , 170 ~ 190
					/* %.1f 의료진 몸무게 */(gender.equals("여자")) ? (double) (Math.random() * 26) + 50
							: (double) (Math.random() * 26) + 60, // 50 ~ 75, 60 ~ 85
					/* %s 의료진 전화번호 */"010" + "-" + Integer.toString(rnd.nextInt(9000) + 1000) + "-"
							+ Integer.toString(rnd.nextInt(9000) + 1000),
					/* %s 의료진 주소 */String.format("%s %d번지", address1[rnd.nextInt(address1.length)],
							rnd.nextInt(50) + 1),
					/* %s 의료진 면허 번호 */ (i <= 9) ? ("D" + "2" + "0" + "0" + i)
							: (i >= 100) ? ("D" + "2" + i) : ("D" + "2" + "0" + i),

					/* %s 담당 부서 */department[rnd.nextInt(department.length)], /* %d 연결 번호 */connectionNo);
			System.out.println(data);
			writer.write(data + "\r\n");
			connectionNo++;
		} // i
		writer.close();
	}// doctorDummy

	private static void patientDummy() throws Exception {
		// 환자 더미 정보 생성
		// 개인정보이용동의여부, 환자이름,환자나이,환자 주민등록번호,환자 성별,환자 키,환자 몸무게,환자 전화번호
		// 환자 백신 접종,유무,환자기저질환,환자 주소,환자 코로나 재감염 여부,환자번호, 병실
		Random rnd = new Random();

		String[] name1 = { "김", "이", "박", "정", "최", "손", "유" };
		String[] name2 = { "신", "석", "효", "정", "진", "현", "재", "형", "민", "돈", "수", "나", "연", "찬", "균", "동", "경", "하",
				"영", "현" };

		String[] answer = { "예", "아니요" };
		String[] disease = { "천식", "당뇨", "치매", "간질", "고혈압", "심부전", "만성심부전", "없음" };
		String[] address1 = { "서울시 대치동", "서울시 역삼동", "서울시 세곡동", "서울시 도곡동", "서울시 개포동", "성남시 구미동", "성남시 금곡동", "성남시 야탑동",
				"성남시 서현동", "성남시 수내동", "서울시 대치동", };

		int patientNo = 1;
		String jumin = "";
		String gender = "";

		FileWriter writer = new FileWriter(".\\dat\\patient.txt");

		for (int i = 1; i <= 350; i++) { // 500 병실
			int age = rnd.nextInt(94) + 7; // 7 ~ 100 //
			int date = rnd.nextInt(27) + 1;
			int connectionNum = rnd.nextInt(30) + 1;
			jumin = getJumin(age);
			gender = (jumin.charAt(7) == '1' || jumin.charAt(7) == '3' || jumin.charAt(7) == '9') ? "남자" : "여자";

			String data = String.format("%s,%s,%s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s,%s,%d,%d,%d", /* %s 개인정보이용동의여부 */"예",
					/* %s 입원 날짜 */"2022-09-" + (date <= 9 ? "0" + date : date),
					/* %s 환자 이름 */name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)]
							+ name2[rnd.nextInt(name2.length)],
					/* %d 환자 나이 */age, /* %s 환자 주민등록번호 */jumin, /* %s 환자 성별 */gender,
					/* %.1f 환자 키 */(age < 13 && gender.equals("여자")) ? (double) (Math.random() * 61) + 100
							: (double) (Math.random() * 60) + 161, // 100 ~ 160 , 161 ~ 220
					/* %.1f 환자 몸무게 */(age < 13 && gender.equals("여자")) ? (double) (Math.random() * 26) + 25
							: (double) (Math.random() * 90) + 61, // 25 ~ 60 , 55 ~ 85
					/* %s 환자 전화번호 */"010" + "-" + Integer.toString(rnd.nextInt(9000) + 1000) + "-"
							+ Integer.toString(rnd.nextInt(9000) + 1000),
					/* %s 환자 백신 접종 유무 */answer[rnd.nextInt(answer.length)],
					/* %s 기저질환 */disease[rnd.nextInt(disease.length)],
					/* %s 환자주소 */String.format("%s %d번지", address1[rnd.nextInt(address1.length)], rnd.nextInt(50) + 1),
					/* %s 환자 코로나 재감염 여부 */answer[rnd.nextInt(answer.length)], /* %d 환자번호 */patientNo, /* %d 병실 */i,
					/* %d 연결 번호 */connectionNum);
			System.out.println(data);
			writer.write(data + "\r\n");
			patientNo++;
			// %d %s %d %s %s %.1f %.1f %s %s %s %s %s %d %d
		} // i
		writer.close();
	} // patientDummy

	private static String getJumin(int age) {

		Random rnd = new Random();

		Calendar c = Calendar.getInstance();
		int thisYear = c.get(Calendar.YEAR);

		String jumin = "";
		int year = thisYear - age + 1;
		int month = rnd.nextInt(12) + 1;
		int date = 1;
		int gender = 0;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			date = rnd.nextInt(31) + 1;

		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			date = rnd.nextInt(30) + 1;

		} else if (month == 2) {

			if ((year % 4) == 0 && year % 100 != 0 || year % 400 == 0) {
				date = 29;

			} else {
				date = 28;
			}
		}

		if (year < 1900) {
			int[] genderNo = { 0, 9 };
			gender = genderNo[rnd.nextInt(2)];

		} else if (year < 2000) {
			gender = rnd.nextInt(2) + 1;

		} else {
			gender = rnd.nextInt(2) + 3;
		}

		jumin = String.format("%s%02d%02d-%d%d", String.valueOf(year).substring(2), month, date, gender,
				rnd.nextInt(900000) + 100000);

		return jumin;
	}

}// Dummy