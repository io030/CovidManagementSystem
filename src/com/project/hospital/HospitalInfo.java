package com.project.hospital;

import java.util.Scanner;

import com.project.data.Data;
import com.project.medicalstaff.doctor.Doctor;

/**
 * HospitalInfo 클래스입니다. 병원정보 조회 입니다.
 * @author 2조
 *
 */
public class HospitalInfo {

	/***
	 * 메소드입니다. 병원 정보 중 의사 정보목록과 이용시설을 가져오는 기능입니다.
	 */
	public static void begin() {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃             병원 정보             ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			m1();
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃        [1] 의사 정보 목록         ┃");
			System.out.println("┃                                   ┃");
			System.out.println("┃        [2] 이용 시설              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃        [0] 돌아가기               ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.print("번호를 입력하세요: ");

			String input = scan.nextLine();

			if (input.equals("1")) { // 의사 정보 목록
				doctorInfo();
			} else if (input.equals("2")) { // 이용 시설
				facilities();
			} else if (input.equals("0")) {
				flag = false;
			}
		}

	}

	/***
	 * 메소드입니다. 1층의 이용 시설에 대한 정보를 조회하는 기능입니다.
	 */
	public static void facilities() {
		// 이용 시설 출력
		System.out.println("[층]\t[이용 시설]");
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
		for (Hospital hi : Data.hospitalList) {

			System.out.printf("[%s]\t[%s]\t[%s]\t[%s]\t[%s]\n", hi.getFloor(), hi.getFacility1(), hi.getFacility2(),
					hi.getFacility3(), hi.getFacility4());
		}
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃        [0]    돌아가기             ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println("번호를 입력하세요:");
		String input = scan.nextLine();
		if (input.equals("0")) {
			flag = false;
		}
		}
	}

/***
 * 메소드입니다. 의사의 이름과 담당 부서를 조회하는 기능입니다.
 */
	public static void doctorInfo() {
		// 의사 정보 목록 출력 ( 이름 , 담당부서)
		System.out.println("[이름]\t\t\t[담당부서]");
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
		for (Doctor d : Data.doctorList) {

			System.out.printf("[%s]\t\t[%s]\n", d.getdName(), d.getdDepartment());

		}
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃         [0]    돌아가기            ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println("번호를 입력하세요:");
		String input = scan.nextLine();
		if (input.equals("0")) {
			flag = false;
		}
		}
	}

	private static void m1() {

		for (Hospital hi1 : Data.hospitalList) {

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃               위치                ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println(hi1.getLocation());
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃             전화번호              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println(hi1.getTel());

		}

	} // m1

}
