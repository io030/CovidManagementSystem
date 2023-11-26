package com.project.patientmenu;

import java.util.Scanner;

import com.project.MainClass;
import com.project.data.Data;
import com.project.data.DataService;

/***
 * 
 * QuitPersonalId 클래스입니다. 회원 탈퇴하는 기능입니다.
 * @author 2조
 *
 */
public class QuitPersonalId {
	
	/***
	 * 메소드입니다. 환자의 번호를 입력받아 환자의 이름과 주민등록번호를 입력하여 환자와 정보가 일치 시 회원 탈퇴가 가능합니다.
	 * @param pNumber 환자 번호
	 */
	public static void begin(int pNumber) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		int result = 2;

		while (flag) {

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃             회원 탈퇴             ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("[이름을 입력해주세요]: ");
			String name = scan.next();
			System.out.println("=====================================");
			System.out.print("[주민번호를 입력해주세요]: ");
			String jumin = scan.next();
			System.out.println("=====================================");

			int num = DataService.getPatientNumber(name, jumin); // 입력한 정보의 환자 번호

			if (num == pNumber) {

				result = DataService.deleteMember(name, jumin);

				if (result == 1) {

					Data.save();
					System.out.println("정상적으로 탈퇴되었습니다!");
					System.out.println("=====================================");
					flag = false;
				

				} else {

				System.out.println("문제가 발생했습니다.");
			}
			}
		}
	}
}

