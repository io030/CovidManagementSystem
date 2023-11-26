package com.project.medicalstaff.doctor;

import java.util.Scanner;

import com.project.data.Data;
import com.project.medicalstaff.MedicalInfo;
import com.project.patient.Patient;

/**
 * EMRView 클래스입니다. 환자 의무 기록 조회입니다.
 * @author 2조
 *
 */
public class EMRView {

	/**
	 * 메소드입니다. 의료진 번호를 입력받아 EMR을 조회합니다.
	 * @param snumber EMR조회
	 */
   public static void emrView(String snumber) {

      // EMR 조회

      Scanner scan = new Scanner(System.in);
      boolean flag = true;
      String doctorName ="";
//         System.out.println("환자 생년월일 입력: ");
//         String birth = scan.nextLine();
//         
//         System.out.println("전화번호 뒷자리 입력: ");
//         String phone = scan.nextLine();
   
      System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
      System.out.println("┃      환자의무기록작성조회(EMR)     ┃");
      System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
      System.out.println("0을 누르면 뒤로가기");
      System.out.println("검색을 시작하려면 enter를 눌러주세요!");
      
      for(Patient p2 : Data.patientList ) {
         
      }
      
      
      
      
      System.out.print("환자 번호 입력: ");
      int patientNumber = scan.nextInt();

      for (MedicalInfo mi : Data.medicalInfoList) {
         if (mi.getmNumber() == patientNumber) {

            for (Patient p : Data.patientList) {
               if (p.getpNumber() == patientNumber) {

                  for (Doctor d : Data.doctorList) {
                     if (d.getdNumber().equals(snumber)
                           && d.getdConnectionNumber() == p.getpConnectionpNumber()) {
                        result(mi ,d);
                        break;
                        }
                     }

                  }
               }
            }
         }
      
      System.out.println("========================================================================================================");
      System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
      System.out.println("┃   [0] 돌아가기   [1] 작성하기      ┃");
      System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
      System.out.print("돌아가기 or 작성하기: ");
      while(flag) {
      String input = scan.nextLine();
      if(input.equals("0")) {
         flag= false;
      }
      
      if(input.equals("1")) {
         EMRWrite.emrWrite(patientNumber,snumber); 
      }
      
   }

      
   }
//	
  
   private static void result(MedicalInfo mi, Doctor d) {
      System.out.println();
      System.out.println("날짜\t\t진료내용\t\t처치\t\t중증도\t\t 처방약\t\t       담당의사");
      System.out.println("========================================================================================================");
      System.out.printf("%10s\t%4s\t\t%6s\t%2s\t\t %10s\t%3s\n"
            , mi.getmDate()
            , mi.getmInfo()
            , mi.getmResult()
            , mi.getmSevertity()
            , mi.getmMedicine()
            , d.getdName());
      
         
      }//result

   }//main