package com.project.sign;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.medicalstaff.doctor.Doctor;
import com.project.medicalstaff.nurse.Nurse;

/***
 * MSSign클래스입니다. 의료진으로 회원가입을 진행합니다.
 * @author 2조
 *
 */
public class MSSign {
	/***
	    * 메소드 입니다. 의료진 회원가입을 진행합니다.
	    */
   public static void begin() {
      
      Scanner scan = new Scanner(System.in);
      
      boolean flag = true;
      
      while(flag) {
    	  
         System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
         System.out.println("┃         [1]   간호사 회원가입      ┃   ");
         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
         System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓    ");
         System.out.println("┃         [2]    의사 회원가입       ┃     ");
         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛     ");
         
         
         String input = scan.nextLine();
         
         if(input.equals("1")) {
            msnSign();
         } else if(input.equals("2")) {
            msdSign();
         } else if(input.equals("0")) {
            flag = false;
         }
      
      } //while
   }
   
   private static void msnSign() {
      Scanner scan = new Scanner(System.in);

      boolean flag = true;

      while (flag) {
         
         System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
         System.out.println("┃          의료진 회원가입           ┃");
         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
         System.out.println("<입력 사항>을 차례대로 입력해주세요 ");
         System.out.println("============================================================================================");
         System.out.print("[이 름(2~5글자)]:");
         String name = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[나 이(25~50)]:");
         String age = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[주민등록번호('-'를 제외하고 입력)]:");
         String jumin = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[성 별(남자/여자)]:");
         String gender = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[키(소수점 첫쨰자리까지 입력)]:");
          String height = scan.nextLine();
          System.out.println("============================================================================================");
            
          System.out.print("[몸 무 게(소수점 첫쨰자리까지 입력)]:");
          String weight = scan.nextLine();
          System.out.println("============================================================================================");
         
         System.out.print("[전화번호('-'를 제외하고 입력)]:");
         String tel = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[주 소(번지필수 포함)]:");
         String address = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[담당부서(소아청소년과/감염내과)]:");
         String department = scan.nextLine();
         System.out.println("============================================================================================");
         
         Nurse n = new Nurse();
         
         //전화번호('-'를 제외하고 입력)
            jumin = jumin.substring(0,6) + "-" + jumin.substring(6,13);
          //주민번호 "-" 삽입
            tel = tel.substring(0,3) + "-" + tel.substring(3,7) + "-" + tel.substring(7,11);
         
         String nNumber = "N"+DataService.createNnum();
         int Connection = DataService.createConnection();
         
         if(isValid(name, age, jumin, gender, height, weight, tel, address, department)) {
            
            int nAge = Integer.parseInt(age);
            double nHeight = Double.parseDouble(height);
            double nWeight = Double.parseDouble(weight);
            
            n.setnName(name);
            n.setnAge(nAge);
            n.setnJumin(jumin);
            n.setnGender(gender);
            n.setnHeight(nHeight);
            n.setnWeight(nWeight);
            n.setnTel(tel);
            n.setnAddress(address);
            n.setnDepartment(department);
            n.setnNumber(nNumber);
            n.setnConnectionNumber(Connection);
            
            Data.nurseList.add(n);
         
            System.out.println("회원가입이 완료되었습니다.");
         } else {
            System.out.println("회원가입이 실패하였습니다.");
         }
         
         Data.pause();
         String input = scan.nextLine();
         if (input.equals("0")) {
            flag = false;
         } //if
         
         Data.save();   
      }
   }
      
   /***
    * 메소드입니다. 입력한 의료진 회원가입 정보 유효성 검사를 합니다
    * @param name 입력한 의료진 이름
    * @param age 입력한 의료진 나이
    * @param jumin 입력한 의료진 주민번호
    * @param gender 입력한 의료진 성별
    * @param height 입력한 의료진 키
    * @param weight 입력한 의료진 몸무게
    * @param tel 입력한 의료진 전화번호
    * @param address 입력한 의료진 주소
    * @param department 입력한 의료진 부서
    * @return true,false
    */
   private static boolean isValid(String name, String age, String jumin, String gender, String height, String weight,
         String tel, String address, String department) {
      
      Nurse n = new Nurse();
      
      String regex = "";
      Pattern  pattern = null;
      Matcher matcher = null;
      
      //간호사 이름 유효성
      regex = "^[가-힣]{2,5}$";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(name);
      
      if(!matcher.find()) {
         System.out.println("이름은 한글, 2~5자 이내로 다시 입력해주세요.");
         return false;
      }
      
      // 간호사 나이 유효성
      regex = "^[0-9]{2,3}$";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(age);
      
      if(!matcher.find() || (Integer.parseInt(age) < 25) || (Integer.parseInt(age) > 50)) {
         
         System.out.println("나이는 숫자(25~50세) 이내로 다시 입력해주세요.");
         return false;
      }
      
      //간호사 주민번호 유효성
      regex = "[0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(jumin);
      
      if(!matcher.find()) {
         
         System.out.println("주민번호가 잘못 입력되었습니다. 다시 입력해주세요.");
         return false;
      } 
      
      //간호사 성별 유효성
      regex = "(남자|여자)";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(gender);
      
      if(!matcher.find()) {
         System.out.println("성별을 잘못 입력했습니다. 다시 입력해주세요.");
         
         return false;
      }
      
      //간호사 키 유효성
      regex = "1[0-9][0-9].[0-9]";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(height);
      
      if(!matcher.find()) {
         System.out.println("키를 잘못입력하셨습니다. 자신의 키를 다시 입력해주세요.");
         
         return false;
      }
      
      //간호사 몸무게 유효성
      regex = "[2-9][0-9].[0-9]";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(weight);
      
      if(!matcher.find()) {
         System.out.println("몸무게를 잘못입력하셨습니다. 자신의 몸무게를 다시 입력해주세요.");
         
         return false;
      }
      
      //간호사 전화번호 유효성
      regex = "01[017]-[0-9]{3,4}-[0-9]{4}";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(tel);
      
      if(!matcher.find()) {
         System.out.println("전화번호를 잘못입력하셨습니다. 자신의 전화번호를 양식에 맞게 다시 입력해주세요.");
         
         return false;
      }
      
      //주소
      regex = "[번지]$";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(address);
            
      if(!matcher.find()) {
         System.out.println("주소 번지까지 입력해주세요.");
               
         return false;
      }
      
      regex ="(감염내과|소아청소년과)";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(department);
      
      if(!matcher.find()) {
         System.out.println("잘못된 부서입니다. 다시 입력해주세요.");
         
         return false;
      }
      
      
      return true;
      
   }
   
   
   /***
    * 메소드입니다. 의료진의 회원가입기능입니다.
    */
   public static void msdSign() {
      
      Scanner scan = new Scanner(System.in);

      boolean flag = true;

      while (flag) {
         System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
         System.out.println("┃               의료진 회원가입      ┃");
         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
         System.out.println("<입력 사항>을 차례대로 입력해주세요 ");
         System.out.println("======================================");
         System.out.print("[이 름(2~5글자)]: ");
         String name = scan.nextLine();
         System.out.println("======================================");
         
         System.out.print("[나 이(35~65세)]: ");
         String age = scan.nextLine();
         System.out.println("======================================");
         
         System.out.print("[주민등록번호('-'를 제외하고 입력)]: ");
         String jumin = scan.nextLine();
         System.out.println("======================================");
         
         System.out.print("[성 별(남자/여자)]: ");
         String gender = scan.nextLine();
         System.out.println("======================================");
         
         System.out.print("[키(소수점 한 자리까지 입력)]: ");
          String height = scan.nextLine();
          System.out.println("======================================");
            
          System.out.print("[몸 무 게(소수점 한 자리까지 입력)]: ");
          String weight = scan.nextLine();
          System.out.println("======================================");
         
         System.out.print("[전화번호('-'를 제외하고 입력)]: ");
         String tel = scan.nextLine();
         System.out.println("======================================");
         
         System.out.print("[주 소]: ");
         String address = scan.nextLine();
         System.out.println("======================================");
         
         System.out.print("[담당부서(소아청소년과/감염내과]: ");
         String department = scan.nextLine();
         System.out.println("======================================");
         
         Doctor d = new Doctor();
         
         //전화번호('-'를 제외하고 입력)
          jumin = jumin.substring(0,6) + "-" + jumin.substring(6,13);
          //주민번호 "-" 삽입
          tel = tel.substring(0,3) + "-" + tel.substring(3,7) + "-" + tel.substring(7,11);
         
          String dNumber = "D20"+DataService.createDnum();
          int dConnectionNumber = DataService.doctorNum();
         
          if(isdValid(name, age, jumin, gender, height, weight, tel, address, department)) {
            
            int dAge = Integer.parseInt(age);
            double dHeight = Double.parseDouble(height);
            double dWeight = Double.parseDouble(weight);
            
            d.setdName(name);
            d.setdAge(dAge);
            d.setdJumin(jumin);
            d.setdGender(gender);
            d.setdHeight(dHeight);
            d.setdWeight(dWeight);
            d.setdTel(tel);
            d.setdAddress(address);
            d.setdNumber(dNumber);
            d.setdDepartment(department);
            d.setdConnectionNumber(dConnectionNumber);

            Data.doctorList.add(d);
         
            System.out.println("회원가입이 완료되었습니다.");
         } else {
            System.out.println("회원가입이 실패하였습니다.");
         }
         
         Data.pause();
         String input = scan.nextLine();
         if (input.equals("0")) {
            flag = false;
         } //if
         
         Data.save();   
      }
   }
   /***
    * 
    * @param name
    * @param age
    * @param jumin
    * @param gender
    * @param height
    * @param weight
    * @param tel
    * @param address
    * @param department
    * @return
    */
   private static boolean isdValid(String name, String age, String jumin, String gender, String height, String weight,
         String tel, String address, String department) {
      
      Doctor d = new Doctor();
      
      String regex = "";
      Pattern  pattern = null;
      Matcher matcher = null;
      
      //의사 이름 유효성
      regex = "^[가-힣]{2,5}$";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(name);
      
      if(!matcher.find()) {
         System.out.println("이름은 한글, 2~4자 이내로 다시 입력해주세요.");
         return false;
      }
      
      //의사 나이 유효성
      regex = "^[0-9]{2,3}$";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(age);
      
      if(!matcher.find() || (Integer.parseInt(age) < 35) || (Integer.parseInt(age) > 65)) {
         
         System.out.println("나이는 숫자(35~65세) 이내로 다시 입력해주세요.");
         return false;
      }
      
      //의사 주민번호 유효성
      regex = "[0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(jumin);
      
      if(!matcher.find()) {
         
         System.out.println("주민번호가 잘못 입력되었습니다. 다시 입력해주세요.");
         return false;
      } 
      
      //간호사 성별 유효성
      regex = "(남자|여자)";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(gender);
      
      if(!matcher.find()) {
         System.out.println("성별을 잘못 입력했습니다. 다시 입력해주세요.");
         
         return false;
      }
      
      //간호사 키 유효성
      regex = "1[0-9][0-9].[0-9]";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(height);
      
      if(!matcher.find()) {
         System.out.println("키를 잘못입력하셨습니다. 자신의 키를 다시 입력해주세요.");
         
         return false;
      }
      
      //간호사 몸무게 유효성
      regex = "[2-9][0-9].[0-9]";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(weight);
      
      if(!matcher.find()) {
         System.out.println("몸무게를 잘못입력하셨습니다. 자신의 몸무게를 다시 입력해주세요.");
         
         return false;
      }
      
      //간호사 전화번호 유효성
      regex = "01[017]-[0-9]{3,4}-[0-9]{4}";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(tel);
      
      if(!matcher.find()) {
         System.out.println("전화번호를 잘못입력하셨습니다. 자신의 전화번호를 양식에 맞게 다시 입력해주세요.");
         
         return false;
      }
      
      //주소
      regex = "[번지]$";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(address);
            
      if(!matcher.find()) {
         System.out.println("주소 번지까지 입력해주세요.");
               
         return false;
      }
      
      regex ="(감염내과|소아청소년과)";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(department);
      
      if(!matcher.find()) {
         System.out.println("잘못된 부서입니다. 다시 입력해주세요.");
         
         return false;
      }
      
      
      return true;
      
      
   }
}