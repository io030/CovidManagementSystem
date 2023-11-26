package com.project.admin;

import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.hospital.Hospital;
/***
 * HIModify클래스입니다. 관리자 권한으로 이용시설 정보를 수정하는 기능입니다.
 * @author 2조
 *
 */
public class HIModify {
	/***
	 * 메소드 입니다. 이용시설의 정보를 수정하는 기능입니다. 
	 */

	public static void begin() {
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		
		Hospital hi = DataService.getHospitalInfo();
		
		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃        이용시설 정보 수정         ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("========================================");
			System.out.println("[수정할 데이터 입력 > 값 유지(엔터)]");
			System.out.println("========================================");
			System.out.print("[1-1호실]:");
			String rn1 = scan.nextLine();
			System.out.println("========================================");
			System.out.print("[1-2호실]:");
			String rn2 = scan.nextLine();
			System.out.println("========================================");
			System.out.print("[1-3호실]:");
			String rn3 = scan.nextLine();
			System.out.println("========================================");
			System.out.print("[1-4호실]:");
			String rn4 = scan.nextLine();
			System.out.println("========================================");

			if (!rn1.equals("")) {
				hi.setFacility1(rn1);
			}
			if (!rn2.equals("")) {
				hi.setFacility2(rn2);
			}
			if (!rn3.equals("")) {
				hi.setFacility3(rn3);
			}
			if (!rn4.equals("")) {
				hi.setFacility4(rn4);
			}

			System.out.println("이용 시설 정보를 수정했습니다.");
			Data.save();
			System.out.println("========================================");
			Data.pause();
			String input = scan.nextLine();
			if (input.equals("0")) {
				flag = false;
			}
		}
	}
}
