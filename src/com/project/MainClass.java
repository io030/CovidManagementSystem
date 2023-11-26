package com.project;

import java.util.Scanner;

import com.project.admin.Admin;
import com.project.data.Data;
import com.project.hospital.HospitalPage;
import com.project.login.Login;
import com.project.sign.Sign;

/***
 * 
 * MainClass 클래스입니다. 메인 화면이며, 메인 메뉴 정보 (회원가입, 로그인, 병원정보, 관리자, 프로그램 종료)를 담고 있습니다.
 * @author 2조
 *
 */
public class MainClass {

	/***
	 * 프로그램 진입점입니다.
	 * @param args - 
	 */
	public static void main(String[] args) {

		Data.load();

		Scanner scan = new Scanner(System.in);

		boolean flag = true;

		main : while (flag) {
			System.out.println("  _____           _     _   __  __                                                   _      _____           _                 \r\n"
					+ "  / ____|         (_)   | | |  \\/  |                                                 | |    / ____|         | |                \r\n"
					+ " | |     _____   ___  __| | | \\  / | __ _ _ __   __ _  __ _  ___ _ __ ___   ___ _ __ | |_  | (___  _   _ ___| |_ ___ _ __ ___  \r\n"
					+ " | |    / _ \\ \\ / / |/ _` | | |\\/| |/ _` | '_ \\ / _` |/ _` |/ _ \\ '_ ` _ \\ / _ \\ '_ \\| __|  \\___ \\| | | / __| __/ _ \\ '_ ` _ \\ \r\n"
					+ " | |___| (_) \\ V /| | (_| | | |  | | (_| | | | | (_| | (_| |  __/ | | | | |  __/ | | | |_   ____) | |_| \\__ \\ ||  __/ | | | | |\r\n"
					+ "  \\_____\\___/ \\_/ |_|\\__,_| |_|  |_|\\__,_|_| |_|\\__,_|\\__, |\\___|_| |_| |_|\\___|_| |_|\\__| |_____/ \\__, |___/\\__\\___|_| |_| |_|\r\n"
					+ "                                                       __/ |                                        __/ |                      \r\n"
					+ "                                                      |___/                                        |___/        ");
			System.out.println("┏━━━━━━━━━━━━━━━━━┓┏━━━━━━━━━━━━━━━━┓");
			System.out.println("┃ [1] 회원가입    ┃┃ [2] 로그인     ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━┛┗━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━┓┏━━━━━━━━━━━━━━━━┓");
			System.out.println("┃ [3] 병원정보	  ┃┃ [4] 관리자     ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━┛┗━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃        [5] 프로그램 종료          ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) { // 회원가입
				Sign.begin();
				// Cannot make a static reference to the non-static method begin() from the type
				// Sign
			} else if (input.equals("2")) { // 로그인
				Login.begin();
			} else if (input.equals("3")) { // 병원 정보
				HospitalPage.begin();
			} else if (input.equals("4")) { // 관리자
				Admin.begin();
			} else { // 프로그램 종료
				flag = false;
			} // if

		} // while
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃ Covid-19 Management System이 무사히 종료되었습니다. ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

		Data.save();

	}// main
} // MainClass
