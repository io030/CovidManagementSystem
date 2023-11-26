package com.project.hospital;

import java.util.Scanner;
import com.project.data.DataService;
import com.project.patient.Patient;

/**
 * AvailableRoom 클래스입니다. 현재 이용 가능한 병실의 수를 조회합니다.
 * @author 2조
 *
 */
public class AvailableRoom {

/***
 * 메소드입니다. 병원의 전체 병실과 이용가능한 병실을 조회합니다.
 */
	public static void begin() {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		Patient p = new Patient();
		
		while (flag) {
			int availableRoom = DataService.createPnum()-1;
			
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃       전체병실: %s          ┃\n",500 +" 병실");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃       이용가능한 병실: %s           ┃\n",(500 - availableRoom) + "병실");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("0")) {
				flag = false;
			}
		}

	}

}