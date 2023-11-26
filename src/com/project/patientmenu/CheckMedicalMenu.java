package com.project.patientmenu;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.medicalstaff.doctor.Doctor;
import com.project.medicalstaff.nurse.Nurse;
import com.project.patient.Patient;

/***
 * 
 * CheckMedicalMenu 클래스입니다. 담당 간호사 및 의사를 조회힙니다.
 * @author 2조
 *
 */

public class CheckMedicalMenu {
// 통일
	/***
	 * 메소드 입니다. 환자의 번호를 입력받아 담당간호사와 의사를 조회합니다.
	 * @param pNumber 환자 번호
	 */
   public static void begin(int pNumber) {
         //pNumber 환자 번호
      // 담당간호사 및 의사 확인
      
      boolean flag = true;
      Scanner scan = new Scanner(System.in);
      
      String pname = "";
      String pjumin = "";
      
         for (Patient p1 : Data.patientList) {
        	 
            if (p1.getpNumber() == pNumber) {
               for(Doctor d1 : Data.doctorList) {
                  for(Nurse n1 : Data.nurseList) {
               
                  if(d1.getdConnectionNumber()==p1.getpConnectionpNumber() && d1.getdConnectionNumber()==n1.getnConnectionNumber()) {
                	 
            
         
            System.out.printf("    [[%s님 진료 기록(환자용)]]   \n", p1.getpName());
            System.out.println("[의사]\t [담당부서]\t [간호사]\t [담당부서]");
            System.out.println("===================================================");
            System.out.printf("%s\t %6s\t %s\t\t %s\n"
                                       , d1.getdName()
                                       , d1.getdDepartment()
                                       , n1.getnName()
                                       ,n1.getnDepartment());
            
            System.out.println("===================================================");

         }
      }
   }
}
} // for
         while(flag) {
         Data.pause();
         String input = scan.nextLine();
         if (input.equals("0")) {
            flag = false;
            
            
         
         } // if
      } // while
   
   }// begin

}