package com.project.patientmenu;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.medicalstaff.MedicalStaffModify;
import com.project.patient.Patient;
/***
 * ModifyPersonalId클래스입니다. 환자의 개인정보를 수정합니다.
 * @author 2조
 *
 */
public class ModifyPersonalId {
	/***
	 * 메소드 입니다. 환자 고유 번호를 입력받아 의사 정보를 수정합니다.
	 * @param pNumber 환자 고유 번호
	 */
   public static void begin(int pNumber) {
      boolean flag = true;
      //통일
      // 개인정보 수정
      while (flag) {
         System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
         System.out.println("┃          개인 정보 수정           ┃");
         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

         Scanner s1 = new Scanner(System.in);

         // 예,2022-09-24,손진경,27,960302-1185471,남자,
         // 179.2,60.1,010-2208-6932,아니요,심부전,성남시 야탑동 6번지,예,1,1

         System.out.println(" [수정할 데이터 입력 > 값 유지시 엔터를 치세요]");
         System.out.println("===================================================");

         Patient p = DataService.getPatientNum1(pNumber);

         System.out.print("[이름]: ");
         String name = s1.nextLine();
         System.out.println("===================================================");
         System.out.print("[성별](남자/여자): ");
         String gender = s1.nextLine();
         System.out.println("===================================================");
         System.out.print("[전화번호('-'제외 입력)]: ");
         String tel = s1.nextLine();
         System.out.println("===================================================");
         System.out.print("[나이]: ");
         String age = s1.nextLine();
         System.out.println("===================================================");
         System.out.print("[키(소수점 첫째자리까지 입력)]: ");
         String height = s1.nextLine();
         System.out.println("===================================================");
         System.out.print("[몸무게(소수점 첫째자리까지 입력)]: ");
         String weight = s1.nextLine();
         System.out.println("-------------------------------------");
         System.out.print("[백신 접종 유무](4개월 이내의 접종이력(예/아니오): ");
         String vaccine = s1.nextLine();
         System.out.println("===================================================");
         System.out.print("[기저질환]: ");
         String disease = s1.nextLine();
         System.out.println("===================================================");
         System.out.print("[주소 (번지필수 포함)]: ");
         String address = s1.nextLine();
         System.out.println("===================================================");
         System.out.print("[코로나 재감염 여부(예/아니오)]: ");
         String reinfection = s1.nextLine();
         System.out.println("===================================================");

         if (DataService.isValid(name, gender, tel, age, height, weight, vaccine, disease, address, reinfection)) { 
            System.out.println("입력완료");
            System.out.println("===================================================");
            
            
               
         if (!name.equals("")) {
            p.setpName(name);
         }

         if (!age.equals("")) {
            p.setpAge(Integer.parseInt(age));
         }

         if (!gender.equals("")) {
            p.setpGender(gender);
         }

         if (!height.equals("")) {
            p.setpHeight(Double.parseDouble(height));
         }

         if (!weight.equals("")) {
            p.setpHeight(Double.parseDouble(weight));
         }

         if (!tel.equals("")) {
            //전화번호('-'를 제외하고 입력)
              tel = tel.substring(0,3) + "-" + tel.substring(3,7) + "-" + tel.substring(7,11);
            p.setpTel(tel);
         }

         if (!vaccine.equals("")) {
            p.setpVaccine(vaccine);
         }

         if (!disease.equals("")) {
            p.setpDisease(disease);
         }

         if (!address.equals("")) {
            p.setpAddress(address);
         }

         if (!reinfection.equals("")) {
            p.setpReinfection(reinfection);
         }
         Data.save();
         System.out.println("환자정보를 수정했습니다");
         System.out.println("=================================================");
         
         } else {
            System.out.println("입력 실패");
            System.out.println("===================================================");
         }
         
         Data.pause();
         String input = s1.nextLine();
         if (input.equals("0")) {
            flag = false;
         }
         
         
      } // while

   } // begin

}