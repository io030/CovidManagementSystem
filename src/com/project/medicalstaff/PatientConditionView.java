package com.project.medicalstaff;

import java.util.Scanner;

import com.project.data.Data;
import com.project.medicalstaff.doctor.EMRView;
import com.project.patient.Patient;
import com.project.patientcondition.PatientCondition;

/**
 * PatientConditionView 클래스입니다. 환자 상태 조회입니다.
 * @author 2조
 *
 */
public class PatientConditionView {

	/***
	 * 메소드입니다. 환자의 이름과 생년월일, 전화번호 뒷자리를 입력받아 환자의 상태를 조회하는 기능입니다.
	 */
   public static void patientConditionView() {
      //통일
      // 환자 상태 조회

      boolean flag = true;
      Scanner scan = new Scanner(System.in);

      while (flag) {

         System.out.print("[환자 이름 입력]: ");
         String name = scan.nextLine();
         System.out.println("=====================================================================================================");

         System.out.print("[생년월일]: ");
         String birth = scan.nextLine();
         System.out.println("=====================================================================================================");

         System.out.print("[전화번호 뒷자리]: ");
         String phone = scan.nextLine();
         System.out.println("=====================================================================================================");
         

         for (Patient p : Data.patientList) {
            if (p.getpName().equals(name) && p.getpJumin().substring(0,6).equals(birth) && p.getpTel().subSequence(9, 13).equals(phone)) {
               for(PatientCondition pc : Data.patientconditionList) {
                  if(pc.getPcNumber()==p.getpNumber()) {
         System.out.printf("    [[%s님의 정보입니다]]   \n", p.getpName());
         
//         System.out.println("날짜\t\t체온\t\t수축기혈압\t이완기혈압\t맥박\t산소포화도\t기타사항");
//         System.out.println("=====================================================================================================");
//         System.out.printf("%-10s\t%-4s\t\t%-3s\t\t%-3s\t\t%-3s\t%-3s\t\t%-10s\n",s1,s2,s3,s4,s5,s6,s7);
         
         System.out.println("날짜\t\t체온\t\t수축기혈압\t이완기혈압\t맥박\t산소포화도\t기타사항");
         System.out.println("=====================================================================================================");

               System.out.printf("%-10s\t%-4s\t\t%-3s\t\t%-3s\t\t%-3s\t%-3s\t\t%-10s\n", pc.getPcDate(), pc.getPcTemperature(),
                     pc.getPcSystolic(), pc.getPcDiastolic(), pc.getPcPulse(), pc.getPcOxygen(), pc.getPcEtc());
               System.out.println("=====================================================================================================");
               

            }
            }
            }
         } 
       // for
   Data.pause();
      String input = scan.nextLine();
        
      if (input.equals("0")) {

         flag = false; // 돌아가기
      }
   }// while
   } 
   
   
}