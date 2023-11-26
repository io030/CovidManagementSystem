package com.project.admin;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.hospital.Hospital;
/***
 * HIMdefaultModify 클래스 입니다. 관리자 권한으로 병원의 정보를 수정합니다
 * @author 2조
 *
 */
public class HIMdefaultModify {
//통일
	/***
	 * 메소드 입니다. 병원의 정보를 수정하는 기능입니다.
	 */
	public static void begin() {

		Scanner s1 = new Scanner(System.in);

		boolean flag = true;

		// 위치 전번
		while (flag) {
			System.out.println(" [수정할 데이터 입력> 값 유지시 엔터를 치세요]");
			System.out.println("==============================================");

			Hospital hi = DataService.getHospitalInfo();

			System.out.print("[위치]: ");
			String locate = s1.nextLine();
			System.out.println("==============================================");
			System.out.print("[전화번호]: ");
			String tel = s1.nextLine();
			System.out.println("==============================================");

			if (!locate.equals("")) {
				hi.setLocation(locate);
			}

			if (!tel.equals("")) {
				hi.setTel(tel);
			}

			System.out.println("병원정보를 수정했습니다");
			Data.save();
			System.out.println("==============================================");
			Data.pause();
			String input = s1.nextLine();
			if (input.equals("0")) {
				flag = false;
			}
		}
	}

}
