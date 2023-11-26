package com.project.medicalstaff;

import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.medicalstaff.doctor.Doctor;
import com.project.medicalstaff.nurse.Nurse;

/**
 * MedicalStaffInfo 클래스입니다. 의료진 정보 조회입니다.
 * @author 2조
 *
 */
public class MedicalStaffInfo {
	
	/**
	 * 메소드입니다. 의료진 번호를 입력받아 의료진 정보를 조회합니다.
	 * @param snumber 의료진 면허 번호
	 */
	public static void medicalStaffInfo(String snumber) {

		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         의료진 정보 조회          ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [1] 의사 조회             ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [2] 간호사 조회           ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();
			if (input.equals("1")) {
				sd(snumber);
			} else if (input.equals("2")) {
				sn(snumber);
			} else if (input.equals("0")) {
				flag = false;
			}
		}

	}// medicalStaffInfo

	private static void sd(String snumber) {
		// 조회한 의사와 로그인한 의사가 같은 면허번호인가?
		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		while (flag) {

			System.out.print("조회할 의사의 이름: ");
			String staffName = scan.nextLine();
			System.out.println("=====================================");
			//System.out.print("생년월일: "); // 970403
			//String staffBirth = scan.nextLine();
			//System.out.println("=====================================");

			System.out.print("담당 부서: ");
			String staffdepartment = scan.nextLine();
			System.out.println("=====================================");

			String dN = DataService.getDoctorNumber2(staffName,staffdepartment);

			for (Doctor d : Data.doctorList) {
				if (d.getdName().equals(staffName) && d.getdDepartment().equals(staffdepartment)) {
					System.out.printf("이름: %s\n", d.getdName());
					System.out.printf("나이: %d\n", d.getdAge());
					System.out.printf("생년월일: %s\n", d.getdJumin().substring(0,6));
					System.out.printf("면허번호: %s\n", d.getdNumber());
					System.out.printf("성별: %s\n", d.getdGender());
					System.out.printf("전화번호: %s\n", d.getdTel());
					System.out.printf("주소: %s\n", d.getdAddress());
					System.out.printf("담당부서: %s\n", d.getdDepartment());
				}
			} // for

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃    [0] 돌아가기     [1] 수정하기    ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String sel = scan.nextLine();

			if (sel.equals("1")) {
				if (dN.equals(snumber)) {
					// 수정하기
					// MedicalStaffModify.medicalStaffModify(staffName, staffBirth,
					// staffdepartment);
					MedicalStaffModify.medicalStaffModify(snumber);
				} else {
					System.out.println("자신의 개인정보만 수정할 수 있습니다.");

					System.out.println("=====================================");

				}

			} else if (sel.equals("0")) {

				Data.pause();
				String input = scan.nextLine();
				if (input.equals("0")) {
					flag = false;
				}

			} else {

				System.out.println("번호를 잘못 입력하였습니다.");
				System.out.println("=====================================");
			}

		}

	} // sd

	private static void sn(String snumber) {
		// 조회한 간호사와 로그인한 간호사가 같은 면허번호인가?
		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		while (flag) {

			System.out.print("조회할 간호사의 이름: ");
			String staffName = scan.nextLine();
			System.out.println("=====================================");
			//System.out.print("주민등록번호: ");
			//String staffBirth = scan.nextLine();
			// scan.nextLine();
			//System.out.println("=====================================");
			System.out.print("담당 부서: ");
			String staffdepartment = scan.nextLine();
			System.out.println("=====================================");
			// 정보조회 기능구현
			// 의료진 정보가 조회되고
			// String staffNumber = StaffInfo.getStaffNumber(staffName, staffBirth,
			// staffdepartment);
			// getlMedicalSatffInfo(staffNumber);

			String nN = DataService.getDoctorNumber2(staffName,staffdepartment);

			for (Nurse n : Data.nurseList) {
				if (n.getnName().equals(staffName) && n.getnDepartment().equals(staffdepartment)) {
					System.out.printf("이름: %s\n", n.getnName());
					System.out.printf("나이: %d\n", n.getnAge());
					System.out.printf("생년월일: %s\n", n.getnJumin().substring(0,6));
					System.out.printf("면허번호: %s\n", n.getnNumber());
					System.out.printf("성별: %s\n", n.getnGender());
					System.out.printf("전화번호: %s\n", n.getnTel());
					System.out.printf("주소: %s\n", n.getnAddress());
					System.out.printf("담당부서: %s\n", n.getnDepartment());
				}
			} // for

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃    [0] 돌아가기   [1] 수정하기    ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("실행할 업무의 번호 입력: ");
			String sel = scan.nextLine();

			if (sel.equals("1")) {
				if (nN.equals(snumber)) {
					// 수정하기
					// MedicalStaffModify.medicalStaffModify(staffName, staffBirth,
					// staffdepartment);
					MedicalStaffModifyn.medicalStaffModifyn(snumber);
				} else {
					System.out.println("자신의 개인정보만 수정할 수 있습니다.");
				}

			} else if (sel.equals("0")) {
				Data.pause();
				String input = scan.nextLine();
				if (input.equals("0")) {
					flag = false;
				}

			} else {

				System.out.println("번호를 잘못 입력하였습니다.");

			}

		} 
	} // sn 
	
}