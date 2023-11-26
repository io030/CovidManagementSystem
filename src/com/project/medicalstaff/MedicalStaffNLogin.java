package com.project.medicalstaff;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.DataService;
import com.project.login.DNSelect;
import com.project.medicalstaff.nurse.Nurse;
/***
 * MedicalStaffNLogin클래스입니다. 간호사 로그인 화면입니다.
 * @author 2조
 *
 */
public class MedicalStaffNLogin {
	// 통일
	/***
	 * 메소드입니다. 간호사 로그인을 하는 기능입니다.
	 * 
	 */
	public static void medicalStaffNLogin() { // MedicalStaffPage.medicalStaffPage();
		boolean flag = true;

		Scanner ip = new Scanner(System.in);

		System.out.println();

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃           간호사 로그인           ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.println("이름과 주민등록번호를 입력해 주세요.");
			System.out.println("====================================== ");
			System.out.print("이름: ");
			String inputName = ip.nextLine();
			System.out.println("====================================== ");
			System.out.print("주민등록번호: ");
			String inputJumin = ip.nextLine();
			System.out.println("====================================== ");
			
			try {

				Scanner ipScan = new Scanner(new FileReader(".\\dat\\nurse.txt"));

				int nurseLogin = nurseCheck(ipScan, inputName, inputJumin);

				if (nurseLogin == 1) {

					// 로그인 확인 후 메뉴 출력
					MedicalStaffPage.medicalStaffPage(DataService.getNurseNumber(inputName, inputJumin));

				} else if (nurseLogin == 2) {

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
						medicalStaffNLogin();
					} else if (input.equals("0")) {
						flag = false;

					}
				}

			} catch (Exception e) {
				System.out.println("MedicalStaffNLogin.medicalStaffNLogin");
				e.printStackTrace();
			}

		} // while

	}// begin
	
	private static Integer nurseCheck(Scanner ipScan, String inputName, String inputJumin) {

		// 간호사 한명씩을 String으로 저장한 간호사리스트
		ArrayList<String> iplist = new ArrayList<String>();

		while (ipScan.hasNextLine()) {
			iplist.add(ipScan.nextLine());
		}

		// 간호사 한명을 , 별로 쪼개서 nurse 객체로 저장할 리스트
		ArrayList<Nurse> nurseArrayList = new ArrayList<Nurse>();

		// 모든 정보를 한줄씩 받아 저장하도록 반복하는 반복문
		for (String list : iplist) {

			// nurse.txt 에서 한줄로 받아온 직원 정보를 ,로 쪼갬
			String[] nurseListSplit = list.split(",");

			// 쪼갠 간호사 한명의 정보를 각각의 setter에 넣을 객체생성
			Nurse nurse = new Nurse();
			// [0] == name , [2] == jumin
			nurse.setnName(nurseListSplit[0]);
			nurse.setnJumin(nurseListSplit[2]);

			// nurse객체를 리스트에 저장
			nurseArrayList.add(nurse);

		}

		boolean nIdCheck = false;
		boolean nPwCheck = false;

		for (Nurse n : nurseArrayList) {

			if (n.getnName().equals(inputName)) {
				nIdCheck = true;
			}

			if (n.getnJumin().equals(inputJumin)) {
				nPwCheck = true;
			}

		}

		if (nIdCheck && nPwCheck) {
			return 1;
		} else {
			return 2;
		}

	}

}
