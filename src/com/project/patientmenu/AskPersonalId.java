package com.project.patientmenu;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.Data;
import com.project.patient.Patient;

/***
 * 
 * AskPersonalId 클래스입니다. 환자의 개인 정보를 조회합니다.
 * @author 2조
 *
 */

public class AskPersonalId {

	/***
	 * 메소드 입니다. 환자의 번호를 입력받아 환자 개인 정보를 조회합니다.
	 * @param pNumber 환자 번호 
	 */
   public static void begin(int pNumber) { //pNum
      boolean flag = true; 
       Patient p = new Patient();
       Scanner scan = new Scanner(System.in);
       String pname = "";
       
       for(Patient p2 : Data.patientList) {
         if(p2.getpNumber() == pNumber) {
            pname = p2.getpName();
         }
      }
       
      while (flag) {
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("┃          개인 정보 조회            ┃");
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            System.out.println();
            
            System.out.printf("[[%s님의 정보 목록]]", pname);
            
            for(Patient p1 : Data.patientList) {
               if(p1.getpNumber() == pNumber) {
                  System.out.println();
                  System.out.printf("이름: %s\n", p1.getpName());
                 System.out.printf("[나 이]: %d\n", p1.getpAge());
                 System.out.printf("[주민등록번호]: %s\n", p1.getpJumin());
                 System.out.printf("[성 별]: %s\n", p1.getpGender());
                 System.out.printf("[키]: %.1f\n", p1.getpHeight());
                 System.out.printf("[몸 무 게]: %.1f\n", p1.getpWeight());
                 System.out.printf("[전화 번호]: %s\n", p1.getpTel());
                 System.out.printf("[백신 접종 유무]: %s\n", p1.getpVaccine());
                 System.out.printf("[기저 질환 이력]: %s\n", p1.getpDisease());
                 System.out.printf("[주 소]: %s\n", p1.getpAddress());
                 System.out.printf("[코로나 재감염 여부]: %s\n", p1.getpReinfection());
                 System.out.printf("[병 실]: %d\n", p1.getpRoom());
                 
                 pNumber = p1.getpNumber(); //환자 고유번호
               }
               
               
               
            }
            System.out.println();
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("┃  [0] 돌아가기    [1] 수정하기     ┃");
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
             System.out.println();
             System.out.print("번호를 입력하세요: ");
             String input = scan.nextLine();
            
             if(input.equals("0")) {
                flag = false; // 돌아가기
             } else if(input.equals("1")) {
                ModifyPersonalId.begin(pNumber); //개인정보 수정
             } //if
         
      } //while
   }//begin
}