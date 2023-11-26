package com.project.medicalstaff;

import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;

import com.project.medicalstaff.nurse.Nurse;

/**
 * MedicalStaffModifyn 클래스입니다.
 * 로그인한 간호사 본인의 정보를 수정합니다.
 * 
 * @author 2조
 *
 */
public class MedicalStaffModifyn {
//통일
   // public static void medicalStaffModify(String staffName,String staffBirth,
   // String staffdepartment) {
	
	/**
	 * 메소드입니다.
	 * 로그인한 의료진의 면허번호를 받아 간호사 면허번호인 경우, 로그인한 간호사 본인의 정보를 수정합니다.
	 * 수정사항 - 의사 이름, 담당 부서, 전화번호, 성별, 나이
	 * 
	 * @param snumber 의료진 고유번호
	 */
   public static void medicalStaffModifyn(String snumber) { // snumber == 로그인한 간호사 면허 번호
      boolean flag = true;

      Scanner scan = new Scanner(System.in);

      while (flag) {

         System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
         System.out.println("┃         간호사 정보 수정          ┃");
         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

         // 의료진 정보 번호붙여 출력

         // String staffNumber = DataService.getStaffNumber(staffName, staffBirth,
         // staffdepartment);
         // Doctor doctor = DataService.getMedicalStaff(staffNumber);

         Nurse nurse = DataService.getMedicalStaffn(snumber);

         if (snumber.contains("N")) {

            System.out.println();
            System.out.println("1. 간호사 이름: " + nurse.getnName());
            System.out.println("2. 담당부서: " + nurse.getnDepartment());
            System.out.println("3. 전화전호: " + nurse.getnTel());
            System.out.println("4. 성별: " + nurse.getnAge());
            System.out.println("5. 나이: " + nurse.getnGender());

            System.out.println("[수정할 데이터 입력 > 값 유지(엔터)]");
            System.out.println("=========================================");;

            System.out.print("[간호사 이름]: ");
            String name = scan.nextLine();
            System.out.println("=========================================");

            if (!name.equals("")) {
               nurse.setnName(name);
            }

            System.out.print("[담당부서]: ");
            String department = scan.nextLine();
            System.out.println("=========================================");

            if (!department.equals("")) {
               nurse.setnTel(department);
            }

            System.out.print("[전화전호]: ");
            String tel = scan.nextLine();
            System.out.println("=========================================");

            if (!tel.equals("")) {
               nurse.setnTel(tel);
            }

            System.out.print("[성별]: ");
            String gender = scan.nextLine();
            System.out.println("=========================================");

            if (!gender.equals("")) {
               nurse.setnTel(gender);
            }

            System.out.print("[나이]: ");
            String age = scan.nextLine();
            System.out.println("=========================================");

            if (!age.equals("")) {
               nurse.setnTel(age);
            }
            Data.save();
            System.out.println("간호사 정보를 수정했습니다");
            System.out.println("=========================================");
            Data.pause();
            String input = scan.nextLine();
            if (input.equals("0")) {
               flag = false;
            }

         } else {
            System.out.println("입력하신 번호와 일치하는 정보가 없습니다.");
            System.out.println("=========================================");
         } // if_contain "N"

      } // while

      scan.close();
      
   }//medicalStaffInfoModifyn

}// MedicalStaffInfoModifyn