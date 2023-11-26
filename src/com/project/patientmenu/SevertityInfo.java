package com.project.patientmenu;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.medicalstaff.MedicalInfo;
import com.project.medicalstaff.doctor.Doctor;
import com.project.patient.Patient;

/***
 * 
 * SevertityInfo 클래스입니다. 환자의 중증도 정보를 조회합니다.
 * @author 2조
 *
 */

public class SevertityInfo { //중증도 정보 조회

	/***
	 * 메소드입니다. 환자의 번호를 입력받아 환자의 중증도를 조회합니다.
	 * @param pNumber 환자 번호
	 */
   public static void begin(int pNumber) {
      
      
      boolean flag = true;
      Scanner scan = new Scanner(System.in);
      String pname ="";
      
      while(flag) {
         
         for(Patient p1 : Data.patientList) {
            if(p1.getpNumber() == pNumber) {
               pname = p1.getpName();
            }
         }
         
         System.out.printf("    [[%s님 중증도 기록(환자용)]]   \n", pname);
         System.out.println("============================================");
         
         
         System.out.println("[날짜]\t\t[위/중증도]\t[담당의사]");
         
         for(Patient p: Data.patientList) {
				p = DataService.getPatientNum1(pNumber);
				for(Doctor d : Data.doctorList) {
					for(MedicalInfo m1 : Data.medicalInfoList) {
						if(m1.getmNumber() == pNumber) {
							if(p.getpConnectionpNumber() == d.getdConnectionNumber()) {
								System.out.printf("%s\t%s\t\t%s\n", m1.getmDate(), m1.getmSevertity(), d.getdName());
							} //if
							
						} //if
						
					} //for(m1)

				} //for(d)

				break;
				
			} //for(p)

         System.out.println();
         Data.pause();
		 String input = scan.nextLine();
			
		 if(input.equals("0")) {
				flag = false;
		 } //if
      } //while
      
   }

   
   
}