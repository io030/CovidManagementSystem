package com.project.medicalstaff;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.login.DNSelect;
import com.project.medicalstaff.doctor.Doctor;
import com.project.patient.Patient;
/***
 * MedicalStaffDLogin클래스입니다. 의사 로그인 화면입니다.
 * @author 2조
 *
 */
public class MedicalStaffDLogin {
	// 통일
	/***
	 * 메소드입니다. 의사 로그인 기능입니다.
	 */
	public static void medicalStaffDLogin() { // MedicalStaffPage.medicalStaffPage();
		boolean flag = true;

		Scanner ip = new Scanner(System.in);

		System.out.println();

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃             의사 로그인           ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("이름과 주민등록번호를 입력해 주세요");
			System.out.println("===================================");
			System.out.print("이름: ");
			String inputName = ip.nextLine();
			System.out.println("===================================");
			System.out.print("주민등록번호: ");
			String inputJumin = ip.nextLine();
			System.out.println("===================================");

			try {

				Scanner ipScan = new Scanner(new FileReader(".\\dat\\doctor.txt"));

				int doctorLogin = doctorCheck(ipScan, inputName, inputJumin);

				if (doctorLogin == 1) {

					// 로그인 확인 후 메뉴 출력
					MedicalStaffPage.medicalStaffPage(DataService.getDoctorNumber(inputName, inputJumin));

				} else if (doctorLogin == 2) {

					// 틀릴 경우
					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("┃         잘못된 정보입니다         ┃");
					System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("┃    [0] 돌아가기   [1] 다시하기    ┃");
					System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
					System.out.print("번호를 입력하세요: ");
					String input = ip.nextLine();

					if (input.equals("1")) {
						medicalStaffDLogin();
					} else if (input.equals("0")) {
						flag = false;

					}
				}

			} catch (Exception e) {
				System.out.println("MedicalStaffDLogin.medicalStaffDLogin");
				e.printStackTrace();
			}

		} // while

	}// begin
	/***
	 * 
	 * @param ipScan ???
	 * @param inputName 입력한 이름
	 * @param inputJumin 입력한 주민번호
	 * @return 1,2
	 */
	private static Integer doctorCheck(Scanner ipScan, String inputName, String inputJumin) {

		// 의사 한명씩을 String으로 저장한 리스트
		ArrayList<String> iplist = new ArrayList<String>();

		while (ipScan.hasNextLine()) {
			iplist.add(ipScan.nextLine());
		}

		// 의사 한명을 , 별로 쪼개서 Doctor 객체로 저장할 리스트
		ArrayList<Doctor> doctorArrayList = new ArrayList<Doctor>();

		// 모든 정보를 한줄씩 받아 저장하도록 반복하는 반복문
		for (String list : iplist) {

			// doctor.txt 에서 한줄로 받아온 직원 정보를 ,로 쪼갬
			String[] doctorListSplit = list.split(",");

			// 쪼갠 의사 한명의 정보를 각각의 setter에 넣을 객체생성
			Doctor doctor = new Doctor();
			// [0] == name , [2] == jumin
			doctor.setdName(doctorListSplit[0]);
			doctor.setdJumin(doctorListSplit[2]);

			// doctor 객체를 리스트에 저장
			doctorArrayList.add(doctor);

		}

		boolean dIdCheck = false;
		boolean dPwCheck = false;

		for (Doctor d : doctorArrayList) {

			if (d.getdName().equals(inputName)) {
				dIdCheck = true;
			}

			if (d.getdJumin().equals(inputJumin)) {
				dPwCheck = true;
			}

		}

		if (dIdCheck && dPwCheck) {
			return 1;
		} else {
			return 2;
		}

	}

}