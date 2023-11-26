package com.project.medicalstaff.doctor;

import java.util.Scanner;

import com.project.data.Data;
import com.project.medicalstaff.nurse.Nurse;
import com.project.patient.Patient;

/**
 * PatientModify클래스입니다. 환자가 담당의사를 변경합니다.
 * @author 2조
 *
 */
public class PatientModify {
//통일
	// 담당 환자 수정
	
	/**
	 * 메소드입니다.
	 * 환자의 이름과 생년월일, 전화번호 뒷자리를 입력하면 로그인한 의사의 담당 환자가 맞는 경우 담당 의료진이 조회됩니다.  
	 * 이때, 변경할 의사의 이름 입력하면 의사 목록에 있는 의사이면 담당 의료진 변경됩니다.
	 */
	public static void begin() {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃        환자 담당 의사 변경        ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			int istaffNumber = 0;
			String sstaffNumber = "";
			System.out.print("[환자 이름 입력]: ");
			String name = scan.nextLine();
			System.out.println("=====================================");

			System.out.print("[생년월일]: ");
			String birth = scan.nextLine();
			System.out.println("=====================================");

			System.out.print("[전화번호 뒷자리]: ");
			String phone = scan.nextLine();
			System.out.println("=====================================");

			for (Patient p : Data.patientList) {
				if (p.getpName().equals(name) && p.getpJumin().substring(0, 6).equals(birth) && p.getpTel().substring(9, 13).equals(phone)) {
					for (Doctor d : Data.doctorList) {
						if (p.getpConnectionpNumber() == d.getdConnectionNumber()) {
							sstaffNumber = d.getdNumber();
							
							
							System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.printf("┃      %s님의 담당 의료진       ┃\n",p.getpName());
							System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
							System.out.printf("     < %s님의 담당 의료진 >\n", p.getpName());
							System.out.println("=====================================");
							System.out.printf("담당 의사:  %s\n", d.getdName());
							System.out.println("=====================================");
							System.out.print("담당 간호사: ");
							for (Nurse n : Data.nurseList) {
								if (p.getpConnectionpNumber() == n.getnConnectionNumber()) {
									System.out.printf("%s\t", n.getnName());
								}
		
							} // for Nurse
							System.out.println();
							System.out.println("=====================================");
						}
					} // for Doctor
				} 
			} // for Patient

			System.out.println("[담당 의사 변경]");
			System.out.print("[변경할 의사이름 입력]: ");
			String changeDname = scan.nextLine();
			System.out.println("=====================================");

			for (Doctor d : Data.doctorList) {
				if (d.getdName().equals(changeDname))			
					istaffNumber = d.getdConnectionNumber(); // 의사 맨 끝에 있는 연결 번호를 istaffNumber에 넣는다
				for (Patient p : Data.patientList) {
					if (p.getpName().equals(name) && p.getpTel().substring(9,13).equals(phone)) { // 입력한 환자 이름이랑 전번이 같은 환자의 연결 번호에 넣는다
						p.setpConnectionpNumber(istaffNumber);
					}
				}
			} // for
			System.out.println("담당의사가 바뀌셨습니다.");
			System.out.println("=====================================");
			Data.save();
			Data.pause();
			String input = scan.nextLine();
			if (input.equals("0")) {
				flag = false;
			}

		} // while

		scan.close();
		
	}//begin

}//PatientModify
