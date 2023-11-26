package com.project.medicalstaff.doctor;

import java.util.Calendar;
import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.medicalstaff.MedicalInfo;
import com.project.medicalstaff.Medicine;

/**
 * EMRWrite 클래스입니다.
 * EMR을 작성합니다.
 * 
 * @author 2조
 * 
 */
public class EMRWrite {
	
	/**
	 * 
	 * 메소드입니다. 
	 * 환자 고유번호와 담당 의사의 면호번호를 받아 EMR을 작성합니다.
	 * 동일한 일자에 EMR이 이미 존재할 경우, EMR을 작성하지 않습니다. 
	 * 진료 날짜는  Calendar를 사용하여 당일 날짜를 자동 생성합니다. 
	 * 입력받은 담당 의사 번호를 가진 의사의 이름을 자동 생성합니다.
	 * EMR 기록사항 - 진료내용, 처치, 중증도, 처방약
	 * 
	 * @param pNumber 환자 고유번호
	 * @param dNumber 담당 의사 고유번호
	 */
	public static void emrWrite(int pNumber,String dNumber) {
		// EMR 작성

		boolean flag = true;
		boolean duplication = false;
		String doctor = "";
		
		for(Doctor d : Data.doctorList) {
			if (d.getdNumber().equals(dNumber)) {
				doctor = d.getdName();
			}
		}
		
		Scanner scan = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		String date = String.format("%tF", now);
		
		
		while (flag) {
			
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃              EMR 기록              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println();
			System.out.println();

			for (MedicalInfo medicalInfo : Data.medicalInfoList) {
				if (medicalInfo.getmDate().equals(date) && medicalInfo.getmNumber() == pNumber) {
					duplication = true ;
					break;
				}
			}
			
			if (duplication) {
				System.out.println("진료기록이 존재합니다.");
				
			} else {

				System.out.print("진료 날짜: " + date);
				System.out.println();
				System.out.println("==============================================");

				System.out.print("진료 내용(환자의 증상): ");
				String medicalRecords = scan.nextLine();
				System.out.println("==============================================");

				System.out.print("처치: ");
				String treatment = scan.nextLine();
				System.out.println("==============================================");

				System.out.println("환자 상태에 따라 중증도를 입력하세요.");
				System.out.print("중증도: ");
				String severity = scan.nextLine();
				System.out.println("==============================================");

				System.out.println("처방하려는 약의 종류가 아래에 존재하면 번호를 입력하세요.");
				System.out.println("처방할 약이 없으면 엔터를 입력하세요.");
				System.out.println();
				System.out.println("1. 해열제");
				System.out.println("2. 비스테로이드성 소염진통제");
				System.out.println("3. 진해거담제 및 기침감기약");
				System.out.println("4. 비염 및 콧물약");
				System.out.println("5. 위장운동조절제");
				System.out.println("6. 제산제");
				System.out.println("7. 근이완제");
				System.out.print("처방: ");
				String prescription = scan.nextLine();
				System.out.println("==============================================");
				String medicine = "";

				if (prescription.equals("1")) {
					System.out.println("처방할 약을 입력하세요.");
					System.out.println();
					
					for (Medicine medicines : Data.medicineList) {
						if (medicines.getMedicineType().equals("해열제")) {
							System.out.println(medicines.getMedicine());
						}
					}
					
					System.out.println();
					System.out.print("입력: ");
					medicine = scan.nextLine();

				} else if (prescription.equals("2")) {
					System.out.println("처방할 약을 입력하세요.");
					System.out.println();
					
					for (Medicine medicines : Data.medicineList) {
						if (medicines.getMedicineType().equals("비스테로이드성 소염진통제")) {
							System.out.println(medicines.getMedicine());
						}
					}
					
					System.out.println();
					System.out.print("입력: ");
					medicine = scan.nextLine();

				} else if (prescription.equals("3")) {
					System.out.println("처방할 약을 입력하세요.");
					System.out.println();
					
					for (Medicine medicines : Data.medicineList) {
						if (medicines.getMedicineType().equals("진해거담제 및 기침감기약")) {
							System.out.println(medicines.getMedicine());
						}
					}
					
					System.out.println();
					System.out.print("입력: ");
					medicine = scan.nextLine();

				} else if (prescription.equals("4")) {
					System.out.println("처방할 약을 입력하세요.");
					System.out.println();

					for (Medicine medicines : Data.medicineList) {
						if (medicines.getMedicineType().equals("비염 및 콧물약")) {
							System.out.println(medicines.getMedicine());
						}
					}
					
					System.out.println();
					System.out.print("입력: ");
					medicine = scan.nextLine();

				} else if (prescription.equals("5")) {
					System.out.println("처방할 약을 입력하세요.");
					System.out.println();
					
					for (Medicine medicines : Data.medicineList) {
						if (medicines.getMedicineType().equals("위장운동조절제")) {
							System.out.println(medicines.getMedicine());
						}
					}
					
					System.out.println();
					System.out.print("입력: ");
					medicine = scan.nextLine();

				} else if (prescription.equals("6")) {
					System.out.println("처방할 약을 입력하세요.");
					System.out.println();
					
					for (Medicine medicines : Data.medicineList) {
						if (medicines.getMedicineType().equals("제산제")) {
							System.out.println(medicines.getMedicine());
						}
					}
					
					System.out.println();
					System.out.print("입력: ");
					medicine = scan.nextLine();

				} else if (prescription.equals("7")) {
					System.out.println("처방할 약을 입력하세요.");
					System.out.println();

					for (Medicine medicines : Data.medicineList) {
						if (medicines.getMedicineType().equals("근이완제")) {
							System.out.println(medicines.getMedicine());
						}
					}
					
					System.out.println();
					System.out.print("입력: ");
					medicine = scan.nextLine();
						
				} else if (prescription.equals("")) {
					medicine = "처방약 없음";
					System.out.println(medicine);
				}
				
				System.out.println("==============================================");
				
				System.out.println("담당의사: " + doctor);
				
				System.out.println("==============================================");

				if (DataService.isValid(medicalRecords, treatment, severity, prescription, medicine)) {
					System.out.println("입력 완료");
					System.out.println("==============================================");

					System.out.println("진료날짜: " + date);
					System.out.println("진료내용: " + medicalRecords);
					System.out.println("처치: " + treatment);
					System.out.println("중증도: " + severity);
					System.out.println("처방약: " + medicine);
					System.out.println("담당의사: " + doctor);
					System.out.println("==============================================");

					System.out.println("EMR에 작성할 내용이 맞으면 1을 입력하세요.");
					System.out.println("취소하려면 0을 입력하세요");
					System.out.println();
					System.out.print("EMR 기록 저장: ");
					String save = scan.nextLine();
					System.out.println("==============================================");

					if (save.equals("1")) {
						// 새로운 객체 입력
						MedicalInfo medicalInfo = new MedicalInfo();

						medicalInfo.setmDate(date);
						medicalInfo.setmInfo(medicalRecords);
						medicalInfo.setmResult(treatment);
						medicalInfo.setmSevertity(severity);
						medicalInfo.setmMedicine(medicine);
						medicalInfo.setmNumber(pNumber);

						// medicalInfoList에 추가
						Data.medicalInfoList.add(medicalInfo);

						// 추가된 medicalInfoList 저장
						Data.save();

						System.out.println("작성 완료되었습니다.");
						System.out.println("==============================================");

					} else if (save.equals("0")) {
						System.out.println("취소되었습니다.");
						System.out.println("==============================================");

					} else {
						System.out.println("번호를 잘못 입력하였습니다.");
						System.out.println("==============================================");
					}//save_if
					
				} else {
					System.out.println("입력 실패");
					System.out.println("==============================================");
				}//isValid
				
			} // duplication_if

			Data.pause();
			flag = false;
			
		} // while
	
		scan.close();
		
	}// emrWrite
	
}//EMRWrite