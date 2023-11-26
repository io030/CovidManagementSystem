package com.project.login;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.patient.Patient;

/***
 * 
 * PatientLogin 클래스입니다. 유효성 검사를 통한 환자 로그인 기능입니다.
 * @author 2조
 *
 */
public class PatientLogin {

	/***
	 * 메소드 입니다. 환자의 이름과 주민등록번호가 일치하면 환자 페이지로 이동하며, 정보가 불일치 할 경우 "잘못된 정보입니다."을 출력합니다.
	 */
	public static void begin() {
		boolean flag = true;
		
		Scanner ip = new Scanner(System.in);

		System.out.println();

		pLogin : while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃            환자 로그인            ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			
			System.out.println("이름과 주민등록번호를 입력해 주세요");
			System.out.println  ("====================================");
			System.out.print("이름: ");
			String inputName = ip.nextLine();
			System.out.println  ("====================================");
			System.out.print("주민등록번호: ");
			String inputJumin = ip.nextLine();
			System.out.println  ("====================================");

			try {
				
				Scanner ipScan = new Scanner(new FileReader(".\\dat\\patient.txt"));
				
		         int patientLogin = patientCheck(ipScan, inputName, inputJumin);
		         
		         if(patientLogin == 1) {
		        	 
		        	 //로그인 확인 후 메뉴 출력

		        	 PatientPage.begin( DataService.getPatientNumber(inputName, inputJumin));
		        	 
		         } else if(patientLogin == 2) {
		        	 
		        	 // 틀릴 경우
		     		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		    		System.out.println("┃          잘못된 정보입니다        ┃");
		    		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

		    		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		    		System.out.println("┃    [0] 돌아가기   [1] 다시하기    ┃");
		    		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
					System.out.print("번호를 입력하세요: ");
					String input = ip.nextLine();
					
					if(input.equals("1")) {
						begin();
					} else if(input.equals("0")) {
						//flag = false;
						break pLogin;

					} 
		         }
		        	 
		         
			} catch (Exception e) {
				System.out.println("PatientLogin.begin");
				e.printStackTrace();
			}
		

		} // while
		

	}// begin
	private static Integer patientCheck (Scanner ipScan, String inputName, String inputJumin ) {
		
		//환자 한명씩을 String으로 저장한 직원리스트
		ArrayList<String> iplist = new ArrayList<String>();
		
		while(ipScan.hasNextLine()) {
			iplist.add(ipScan.nextLine());
		}
		
		//환자 한명을 , 별로 쪼개서 patient 객체로 저장할 리스트
		
		ArrayList<Patient> patientArrayList = new ArrayList<Patient>();

		
		//모든 정보를 한줄씩 받아 저장하도록 반복하는 반복문
		for(String list : iplist) {
			
			//patient.txt 에서 한줄로 받아온 직원 정보를 ,로 쪼갬
			String[] patientListSplit = list.split(",");
			
			//쪼갠 환자 한명의 정보를 각각의 setter에 넣을 객체생성
			Patient patient = new Patient();
			
			// [2] == name , [4] == jumin
			
			patient.setpName(patientListSplit[2]);
			patient.setpJumin(patientListSplit[4]);

			//쪼갠거를 patient 객체리스트에 저장
			patientArrayList.add(patient);
			
		}
		

		
		
		
		
		boolean pIdCheck = false;
		boolean pWCheck = false;
		
		for(Patient p : patientArrayList) {
			
			if(p.getpName().equals(inputName)) {
				pIdCheck = true;
			}
			
			if(p.getpJumin().equals(inputJumin)) {
				pWCheck = true;
			}
			
		}
		
		if(pIdCheck && pWCheck) {
			return 1;
			
		} else {
			return 2;
		} 

	}

}
	

