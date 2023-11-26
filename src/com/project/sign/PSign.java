package com.project.sign;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.patient.Patient;

/**
 * PSign클래스입니다. 환자로 회원가입을 진행합니다.
 * @author 2조
 *
 */
public class PSign {
	
	/**
	 * 메소드입니다.
	 * 환자 회원가입 기능입니다.
	 * 입력사항을 입력하면 유효성 검사를 하여 입력 성공할 경우, 회원가입이 완료됩니다.
	 * 입력사항 - 이름, 나이, 주민등록번호, 성별, 키, 몸무게, 전화번호, 백신 접종 유무, 기저질환, 주소, 코로나 재감염 여부.
	 */
   public static void begin() {
      
      Scanner scan = new Scanner(System.in);
      Random rnd = new Random();

      boolean flag = true;

       while(flag) {
         System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
         System.out.println("┃          환자 회원가입             ┃");
         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
         System.out.println("<입력 사항>을 차례대로 입력해주세요 ");
         System.out.println("============================================================================================");
         System.out.print("[이 름(2~5글자)]: ");
         String name = scan.nextLine();
         System.out.println("============================================================================================");

         
         System.out.print("[나 이(1~150)]: ");
         String age = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[주민등록번호('-'를 제외하고 입력)]: ");
         String jumin = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[성 별(남자/여자)]: ");
         String gender = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[키(소수점 첫째자리까지 입력)]: ");
         String height = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[몸 무 게(소수점 첫째자리까지 입력)]: ");
         String weight = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[전화 번호('-'를 제외하고 입력)]: ");
         String tel = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[백신 접종 유무(4개월 이내의 접종이력이 있을시 예, 해당 사항에 포함되지 않을 경우 아니오)]: ");
         String vaccine = scan.nextLine();
         System.out.println("============================================================================================");

         
         System.out.print("[기저 질환]: ");
         String disease = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[주 소(번지필수 포함)]: ");
         String address = scan.nextLine();
         System.out.println("============================================================================================");
         
         System.out.print("[코로나 재감염여부(예/아니오)]: ");
         String reinfection = scan.nextLine();
         System.out.println("============================================================================================");
         
         Patient p = new Patient();
         
         //날짜 정보
         Calendar today = Calendar.getInstance();
         SimpleDateFormat todaySDF = new SimpleDateFormat("yyyy-MM-dd");
         String todayString = todaySDF.format(today.getTime());
         
         //전화번호('-'를 제외하고 입력)
         jumin = jumin.substring(0,6) + "-" + jumin.substring(6,13);
          //주민번호 "-" 삽입
         tel = tel.substring(0,3) + "-" + tel.substring(3,7) + "-" + tel.substring(7,11);
         
         int pNumber = DataService.createPnum();
         
         if(isValid(name, age, jumin, gender, height, weight, tel, vaccine, disease, address, reinfection)) {
            int pAge =  Integer.parseInt(age);
            double pHeight = Double.parseDouble(height);
            double pWeight = Double.parseDouble(weight);
            
            p.setAgreement("예");
             p.setpDate(todayString);
            p.setpName(name);
             p.setpAge(pAge);
             
             p.setpJumin(jumin);
             p.setpGender(gender);
             p.setpHeight(pHeight);
             p.setpWeight(pWeight);
             
             p.setpTel(tel);
             
             p.setpVaccine(vaccine);
             p.setpDisease(disease);
             p.setpAddress(address);
             p.setpReinfection(reinfection);
             p.setpNumber(pNumber);
             p.setpRoom(0);
             p.setpConnectionpNumber(rnd.nextInt(30) + 1);
             
             Data.patientList.add(p);
             
             System.out.println("회원가입이 완료되었습니다.");
             
             
         } else {
            // 기존 잘못 입력하여 null로 작성된 patient.txt에 null값들 삭제   > 즉, 애초에 저장을 안시키며, null로 저장되더라도 실행 시 삭제
            System.out.println("실패");
         }//if_isvalid
         
         System.out.println();
         Data.pause();
        String input = scan.nextLine();
            
        if(input.equals("0")) {
           flag = false;
        } //if
        Data.save();
       } //while
       
       scan.close();
       
  }//begin

   /**
    * 메소드입니다. 입력한 환자 회원가입 정보 유효성 검사를 합니다
    * @param name 입력한 환자 이름
    * @param age 입력한 환자 나이
    * @param jumin 입력한 환자  주민번호
    * @param gender 입력한 환자 성별
    * @param height 입력한 환자 키
    * @param weight 입력한 환자 몸무게
    * @param tel 입력한 환자 전화번호
    * @param address 입력한 환자 주소
    * @param department 입력한 환자 부서
    * @return true,false
    */
   private static boolean isValid(String name, String age, String jumin, String gender, String height, String weight,
         String tel, String vaccine, String disease, String address, String reinfection) {
      
      String regex = "";
      Pattern  pattern = null;
      Matcher matcher = null;
      
      //이름 유효성
      regex = "^[가-힣]{2,5}$";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(name);
      
      if(!matcher.find()) {
         System.out.println("이름은 한글, 2~5자 이내로 다시 입력해주세요.");
         return false;
      }
      
      // 나이 유효성
      regex = "^[0-9]{2,3}$";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(age);
      
      if(!matcher.find() || (Integer.parseInt(age) < 1) || (Integer.parseInt(age) > 150)) {
         
         System.out.println("나이는 숫자(1~150세) 이내로 다시 입력해주세요.");
         return false;
      }
      
      //주민번호 유효성
      regex = "[0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(jumin);
      
      if(!matcher.find()) {
         
         System.out.println("주민번호가 잘못 입력되었습니다. 다시 입력해주세요.");
         return false;
      }
      
      //성별 유효성
      regex = "(남자|여자)";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(gender);
      
      if(!matcher.find()) {
         System.out.println("성별을 잘못 입력했습니다. 다시 입력해주세요.");
         
         return false;
      }
      
      // 키 유효성
      regex = "1[0-9][0-9].[0-9]";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(height);
      
      if(!matcher.find()) {
         System.out.println("키를 잘못입력하셨습니다. 자신의 키를 다시 입력해주세요.");
         
         return false;
      }
      
      //몸무게 유효성
      regex = "[2-9][0-9].[0-9]";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(height);
      
      if(!matcher.find()) {
         System.out.println("몸무게를 잘못입력하셨습니다. 자신의 몸무게를 다시 입력해주세요.");
         
         return false;
      }
      
      //전화번호 유효성
      regex = "01[017]-[0-9]{3,4}-[0-9]{4}";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(tel);
      
      if(!matcher.find()) {
         System.out.println("전화번호를 잘못입력하셨습니다. 자신의 전화번호를 양식에 맞게 다시 입력해주세요.");
         
         return false;
      }
      
      //백신 
      regex = "(예|아니오)";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(vaccine);
      
      if(!matcher.find()) {
         System.out.println("백신 여부를 다시 입력해주세요.");
         
         return false;
      }
      
      //기저질환
      regex = "(천식|당뇨|치매|간질|고혈압|심부전|만성심부전|없음)";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(disease);
      
      if(!matcher.find()) {
         System.out.println("자신의 기저질환을 다시 입력해주세요.");
         
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
      
      regex = "(예|아니오)";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(reinfection);
      
      if(!matcher.find()) {
         System.out.println("재감염여부를 다시 입력해주세요.");
         
         return false;
      }

      return true;
       
   } //isValid

}//PSign