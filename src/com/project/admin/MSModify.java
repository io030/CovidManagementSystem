package com.project.admin;

import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.medicalstaff.doctor.Doctor;
import com.project.medicalstaff.nurse.Nurse;
/***
 * MSModify 클래스입니다. 관리자 권한으로 의사 정보를 수정합니다.
 * @author 2조
 *
 */
public class MSModify {
// 통일 
 /***
    * 메소드 입니다. 의료진 면허 번호를 입력받아 의사 정보를 수정합니다.
    * @param staffNumber 의료진 고유 번호
    */
   public static void begin(String staffNumber) {
      Doctor d = DataService.getDoctorStaff(staffNumber);
      Nurse n = DataService.getNurseStaff(staffNumber);
      // System.out.println(staffNumber);
      Scanner scan = new Scanner(System.in);
      boolean flag = true;
      while (flag) {
         if (staffNumber.contains("D")) {

            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("┃      의사 정보 수정 <관리자>      ┃");
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            System.out.println("[수정할 데이터 입력 > 값 유지(엔터)]");
            System.out.println("========================================");
            System.out.print("[이름]: ");
            String name = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[나이]: ");
            String age = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[성별]: ");
            String gender = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[키]: ");
            String height = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[몸무게]: ");
            String weight = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[전화번호]: ");
            String tel = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[주소]: ");
            String address = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[면허번호]: ");
            String number = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[담당부서]: ");
            String department = scan.nextLine();
            System.out.println("========================================");

            if (!name.equals("")) {
               d.setdName(name);
            }

            if (!age.equals("")) {
               d.setdAge(Integer.parseInt(age));
            }

            if (!gender.equals("")) {
               d.setdGender(gender);
            }

            if (!height.equals("")) { 
               d.setdHeight(Double.parseDouble(height));
            }

            if (!weight.equals("")) {
               d.setdWeight(Double.parseDouble(weight));
            }

            if (!tel.equals("")) {
               d.setdTel(tel);
            }

            if (!address.equals("")) {
               d.setdAddress(address);
            }

            if (!number.equals("")) {
               d.setdNumber(number);
            }

            if (!department.equals("")) {
               d.setdDepartment(department);
            }
            System.out.println("의사 정보를 수정했습니다.");
            System.out.println("========================================");
            Data.save();

         } // if 의사

         else if (staffNumber.contains("N")) {

            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("┃      간호사 정보 수정 <관리자>    ┃");
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            System.out.println("[수정할 데이터 입력 > 값 유지(그냥엔터)]");
            System.out.println("========================================");
            System.out.println("[이름]: ");
            String name = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[나이]: ");
            String age = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[성별]: ");
            String gender = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[키]: ");
            String height = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[몸무게]: ");
            String weight = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[전화번호]: ");
            String tel = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[주소]: ");
            String address = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[면허번호]: ");
            String number = scan.nextLine();
            System.out.println("========================================");
            System.out.print("[담당부서]: ");
            String department = scan.nextLine();
            System.out.println("========================================");

            if (!name.equals("")) {
               n.setnName(name);
            }

            if (!age.equals("")) {
               n.setnAge(Integer.parseInt(age));
            }

            if (!gender.equals("")) {
               n.setnGender(gender);
            }

            if (!height.equals("")) {
               n.setnHeight(Double.parseDouble(height));
            }

            if (!weight.equals("")) {
               n.setnWeight(Double.parseDouble(weight));
            }

            if (!tel.equals("")) {
               n.setnTel(tel);
            }

            if (!address.equals("")) {
               n.setnAddress(address);
            }

            if (!number.equals("")) {
               n.setnNumber(number);
            }

            if (!department.equals("")) {
               n.setnDepartment(department);
            }
            System.out.println("간호사 정보를 수정했습니다.");
            System.out.println("==============================================");
            Data.save();

         } // else if 간호사
         Data.pause();
         String input = scan.nextLine();
         if (input.equals("0")) {
            flag = false;
         }

      } // while
   }
}