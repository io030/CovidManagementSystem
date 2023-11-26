package com.project.admin;

import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.medicalstaff.doctor.Doctor;
import com.project.medicalstaff.nurse.Nurse;

/**
 * AMSInfo 클래스입니다. 관리자의 의료진 정보 조회입니다.
 * @author 2조
 *
 */
public class AMSInfo {

	/***
	 * 메소드입니다. 의료진의 정보를 조회하는 기능입니다.
	 */
	public static void begin() {

		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		String staffNumber = "";
		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         의료진 정보 조회          ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.println("조회할 의료진의 [이름] , [생년월일] , [전화번호 뒷 4자리] 를 차례대로 입력하세요");
			System.out.println("================================================================================");

			System.out.print("[이름]: ");
			String name = scan.nextLine();
			System.out.println("================================================================================");
			System.out.print("[주민번호]: ");
			String jumin = scan.nextLine();
			System.out.println("================================================================================");
			System.out.print("[전화번호]: ");
			String tel = scan.nextLine();
			System.out.println("================================================================================");

			for (Doctor d : Data.doctorList) {
				if (d.getdName().equals(name) && d.getdJumin().substring(0,6).equals(jumin) && d.getdTel().substring(9,13).equals(tel)) {

					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("┃          의사 정보 조회           ┃");
					System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
					;
					System.out.printf("[이름]: %s\n", d.getdName());
					System.out.printf("[나이]: %d\n", d.getdAge());
					System.out.printf("[주민등록 번호]: %s\n", d.getdJumin());
					System.out.printf("[성별]: %s\n", d.getdGender());
					System.out.printf("[키]: %.1f\n", d.getdHeight());
					System.out.printf("[몸무게]: %.1f\n", d.getdWeight());
					System.out.printf("[전화번호]: %s\n", d.getdTel());
					System.out.printf("[주소]: %s\n", d.getdAddress());
					System.out.printf("[면허번호]: %s\n", d.getdNumber());
					System.out.printf("[담당부서]: %s\n", d.getdDepartment());
//				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
//				System.out.println("┃      [1]    수정하기              ┃");
//				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
//				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
//				System.out.println("┃      [0]    돌아가기              ┃");
//				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
					staffNumber = d.getdNumber();
				} // if

			} // for

//		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
//		System.out.println("┃         [1] 수정하기              ┃");
//		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
//		Data.pause();

			for (Nurse n : Data.nurseList) {
				if (name.equals(n.getnName()) && jumin.equals(n.getnJumin()) && tel.equals(n.getnTel())) {

					System.out.println(staffNumber);

					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("| 의료진(간호사) 정보<관리자 권한>    ┃");
					System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
					System.out.printf("[이름]: %s\n", n.getnName());
					System.out.printf("[나이]: %d\n", n.getnAge());
					System.out.printf("[주민등록 번호]: %s\n", n.getnJumin());
					System.out.printf("[성별]: %s\n", n.getnGender());
					System.out.printf("[키]: %.1f\n", n.getnHeight());
					System.out.printf("[몸무게]: %.1f\n", n.getnWeight());
					System.out.printf("[전화번호]: %s\n", n.getnTel());
					System.out.printf("[주소]: %s\n", n.getnAddress());
					System.out.printf("[면허번호]: %s\n", n.getnNumber());
					System.out.printf("[담당부서]: %s\n", n.getnDepartment());
					staffNumber = n.getnNumber();
				} // if
			} // for

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃    [0] 돌아가기   [1] 수정하기    ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) {

				MSModify.begin(staffNumber);

			} else if (input.equals("0")) {
				flag = false;

			}

		} // while


		// Data.pause();
	}

}