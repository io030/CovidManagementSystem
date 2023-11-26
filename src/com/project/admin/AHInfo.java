package com.project.admin;

import java.util.Scanner;
import com.project.data.Data;


import com.project.hospital.Hospital;

/**
 * AHInfo 클래스입니다.
 * 병원 위치와 전화번호를 보여주고, 병원 정보 메뉴의 기능을 선택합니다.
 * 
 * @author 2조
 *
 */
public class AHInfo {
	
	/**
	 * 메소드입니다.
	 * 병원 위치와 전화번호를 보여주고, 관리자가 병원 정보 메뉴에서 돌아가기, 이용시설, 수정하기 기능을 선택합니다.
	 */
	public static void begin() {
		// 통일
		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃            병원 정보              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			m1();
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [1] 이용시설              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [2] 수정하기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) { // 이용 시설
				aFacilities();
			} else if (input.equals("2")) { // 수정하기
				HIMdefaultModify.begin();
			} else if (input.equals("0")) {
				flag = false;
			} //if
		
		}//while
	
		scan.close();
		
	}//begin
	
/**
 * 메소드입니다.
 * 병원 위치, 전화번호를 출력하여 보여줍니다.
 */
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
		}//for

	}//m1

	/**
	 * 메소드입니다.
	 * 1층의 이용시설을 출력하여 보여줍니다.
	 */
	private static void aFacilities() {
		// 이용 시설 출력

		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		while (flag) {

			System.out.println("[층]\t[이용 시설]");
			System.out.println("=====================================");

			for (Hospital hi : Data.hospitalList) {
				System.out.printf("[%s]\t[%s]\t[%s]\t[%s]\t[%s]\n", hi.getFloor(), hi.getFacility1(), hi.getFacility2(),
						hi.getFacility3(), hi.getFacility4());
			}//for
			
			System.out.println("=====================================");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃    [0] 돌아가기   [1] 수정하기    ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("0")) {
				flag = false;
			} else if (input.equals("1")) {
				HIModify.begin();
			} // if

		} // while
		
		scan.close();
		
	}//aFacilities

}//AHInfo
