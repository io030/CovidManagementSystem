package com.project.login;

import java.util.Scanner;

import com.project.data.Data;
import com.project.medicalstaff.MedicalStaffDLogin;
import com.project.medicalstaff.MedicalStaffNLogin;
/***
 * DNSelect 클래스입니다. 의사 로그인, 간호사 로그인을 선택 할 수 있습니다.
 * @author 2조
 *
 */
public class DNSelect {
	//통일
	/***
	 * 메소드입니다. 의사로그인과 간호사로그인을 선택하는 기능입니다.
	 */
	public static void begin() {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃           의료진 로그인           ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [1] 의사 로그인           ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [2] 간호사 로그인         ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) {
				MedicalStaffDLogin.medicalStaffDLogin();
			} else if (input.equals("2")) {
				MedicalStaffNLogin.medicalStaffNLogin();
			} else if (input.equals("0")) {

				flag = false;
			}

		}
	}

}
