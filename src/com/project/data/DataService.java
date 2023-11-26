package com.project.data;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.project.hospital.Hospital;
import com.project.medicalstaff.doctor.Doctor;
import com.project.medicalstaff.nurse.Nurse;
import com.project.patient.Patient;

/***
 * 
 * DataService 클래스입니다. Data에 함께 사용될 메소드들의 집합입니다.
 * @author 2조
 *
 */
public class DataService {

	/***
	 * 메소드입니다. 환자의 이름과 주민등록번호를 입력받아 비교 후, 동일한 경우 환자의 번호를 리턴합니다.
	 * @param pName 환자 이름
	 * @param pJumin 환자 주민등록번호
	 * @return 환자 번호
	 */
	public static int getPatientNumber(String pName, String pJumin) {
		int getpNumber = 0;

		for (Patient patient : Data.patientList) {
			if (patient.getpName().equals(pName) && patient.getpJumin().equals(pJumin)) {
				getpNumber = patient.getpNumber();
				break;
			}
		}
		return getpNumber;

	}// getPatientNumber

	/***
	 * 메소드입니다. 의사의 이름과 주민등록번호를 입력받아 비교 후, 동일한 경우 의사의 면허 번호를 리턴합니다.
	 * @param dName 의사 이름
	 * @param dJumin 의사 주민등록번호
	 * @return 의사 면허번호
	 */
	public static String getDoctorNumber(String dName, String dJumin) {
		String getdNumber = "";

		for (Doctor doctor : Data.doctorList) {
			if (doctor.getdName().equals(dName) && doctor.getdJumin().equals(dJumin)) {
				getdNumber = doctor.getdNumber();
				break;
			}

		}
		return getdNumber;

	}// 이름 , 주민번호가 같은 의사의 면허 번호 가져오기

	/***
	 * 메소드입니다. 의사의 이름, 주민등록번호, 담당 부서를 입력받아 비교 후, 동일한 경우 의사의 면허 번호를 리턴합니다.
	 * @param dName 의사 이름
	 * @param dJumin 의사 주민등록번호
	 * @param department 의사의 담당 부서
	 * @return 의사 면허번호
	 */
	public static String getDoctorNumber(String dName, String dJumin, String department) {
		String getdNumber = "";

		for (Doctor doctor : Data.doctorList) {
			if (doctor.getdName().equals(dName) && doctor.getdJumin().equals(dJumin)
					&& doctor.getdDepartment().equals(department)) {
				getdNumber = doctor.getdNumber();
				break;
			}

		}
		return getdNumber;

	}// 이름 , 주민번호,담당부서가 같은 의사의 면허 번호 가져오기
	
	/***
	 * 메소드입니다. 의사의 이름, 생년월일, 담당 부서를 입력받아 비교 후, 동일한 경우 의사의 면허 번호를 리턴합니다.
	 * @param dName 의사 이름
	 * @param dJumin 의사 생년월일
	 * @param department 의사의 담당 부서
	 * @return 의사 면허 번호
	 */
	public static String getDoctorNumber2(String dName, String dJumin, String department) {
		String getdNumber = "";

		for (Doctor doctor : Data.doctorList) {
			if (doctor.getdName().equals(dName) && doctor.getdJumin().substring(0,6).equals(dJumin)
					&& doctor.getdDepartment().equals(department)) {
				getdNumber = doctor.getdNumber();
				break;
			}

		}
		return getdNumber;

	}// 이름 , 주민번호,담당부서가 같은 의사의 면허 번호 가져오기

	/***
	 * 메소드입니다. 의사의 이름, 담당 부서를 입력받아 비교 후, 동일한 경우 의사의 면허 번호를 리턴합니다.
	 * @param dName 의사 이름
	 * @param department 의사의 담당 부서
	 * @return 의사 면허번호
	 */
	public static String getDoctorNumber2(String dName,String department) {
		String getdNumber = "";

		for (Doctor doctor : Data.doctorList) {
			if (doctor.getdName().equals(dName) && doctor.getdDepartment().equals(department)) {
				getdNumber = doctor.getdNumber();
				break;
			}

		}
		return getdNumber;

	}// 이름 , 주민번호,담당부서가 같은 의사의 면허 번호 가져오기
	
	/***
	 * 메소드입니다. 간호사의 이름, 주민등록번호를 입력받아 비교 후, 동일한 경우 간호사의 면허 번호를 리턴합니다.
	 * @param nName 간호사 이름
	 * @param nJumin 간호사 주민등록번호
	 * @return 간호사 면허번호
	 */
	public static String getNurseNumber(String nName, String nJumin) {

		String getnNumber = "";

		for (Nurse nurse : Data.nurseList) {
			if (nurse.getnName().equals(nName) && nurse.getnJumin().equals(nJumin)) {
				getnNumber = nurse.getnNumber();
				break;
			}

		}
		return getnNumber;

	}// 이름 , 주민번호가 같은 간호사의 면허 번호 가져오기

	/***
	 * 메소드입니다. 간호사의 이름, 주민등록번호, 담당 부서를 입력받아 비교 후, 동일한 경우 간호사의 면허 번호를 리턴합니다.
	 * @param nName 간호사 이름
	 * @param nJumin 간호사의 주민등록번호
	 * @param department 간호사의 담당 부서 
	 * @return 간호사 면허번호
	 */
	public static String getNurseNumber(String nName, String nJumin, String department) {

		String getnNumber = "";

		for (Nurse nurse : Data.nurseList) {
			if (nurse.getnName().equals(nName) && nurse.getnJumin().equals(nJumin)
					&& nurse.getnDepartment().equals(department)) {
				getnNumber = nurse.getnNumber();
				break;
			}

		}
		return getnNumber;

	}// 이름 , 주민번호가,담당부서가 같은 간호사의 면허 번호 가져오기

	/***
	 * 메소드입니다. 환자의 이름, 생년월일, 전화번호를 입력받아 비교 후, 동일한 경우 환자의 번호를 리턴합니다.
	 * @param pName 환자 이름
	 * @param birth 환자 생년월일
	 * @param phone 환자 전화번호
	 * @return 환자 번호
	 */
	public static int getPatientNumber(String pName, String birth, String phone) {
		int getpNumber = 0;

		for (Patient patient : Data.patientList) {

			if (patient.getpName().equals(pName) && patient.getpJumin().substring(0, 6).equals(birth)
					&& patient.getpTel().substring(9).equals(phone)) {
				getpNumber = patient.getpNumber();
				break;
			}
		}

		return getpNumber;

	}// getPatientNumber

	/***
	 * 메소드입니다. 환자 번호를 입력받아 병실을 이동해주며, 병실 번호를 리턴합니다.
	 * @param pnumber 환자 번호
	 * @return 병실
	 */
	public static int getWard(int pnumber) {

		int ward = 0;

		for (Patient patient : Data.patientList) {

			if (patient.getpNumber() == pnumber) {
				ward = patient.getpRoom();
				break;
			}
		}
		return ward;

	}// getPatientWard

	/***
	 * 메소드입니다. 환자의 이름, 주민등록번호를 입력받아 비교 후, 동일한 경우 회원 정보를 삭제하는 기능입니다.
	 * @param name 환자 이름
	 * @param jumin 환자 주민등록번호
	 * @return 환자 삭제 (성공 시 1, 실패 시 0)
	 */
	public static int deleteMember(String name, String jumin) {
		// 회원 삭제

		int pNumber = DataService.getPatientNumber(name, jumin);

		for (int i = 0; i < Data.patientList.size(); i++) {

			if (Data.patientList.get(i).getpName().equals(name) && Data.patientList.get(i).getpJumin().equals(jumin)) {
				Data.patientList.remove(i);
				// return 1;
			}

		}

		for (int i = 0; i < Data.patientconditionList.size(); i++) {

			if (Data.patientconditionList.get(i).getPcNumber() == pNumber) {
				Data.patientconditionList.remove(i);
				// return 1;
			}

		}

		for (int i = 0; i < Data.medicalInfoList.size(); i++) {

			if (Data.medicalInfoList.get(i).getmNumber() == pNumber) {
				Data.medicalInfoList.remove(i);
				return 1;
			}

		}

		return 0;

	} // 회원 삭제

	/***
	 * 메소드입니다. 입원 날짜를 입력받아 환자 리스트에 추가합니다.
	 * @param date 입원 날짜
	 * @return 환자 리스트
	 */
	public static ArrayList<Patient> getPatientDate(String date) {

		ArrayList<Patient> list = new ArrayList<Patient>();

		for (Patient p2 : Data.patientList) {
			if (p2.getpDate().equals(date)) {
				list.add(p2);
			}
		}

		return list;

	} // 입원 날짜

	/***
	 * 메소드입니다. 환자의 번호를 비교하는 기능입니다.
	 * @param pNum 환자 번호
	 * @return 환자 번호(동일한 경우 환자 번호 리턴, 다를 경우 null)
	 */
	public static Patient getPatientNum1(int pNum) {

		for (Patient p : Data.patientList) {
			if (p.getpNumber() == pNum) {
				return p;
			}
		}
		return null;
	} // 고유 번호 비교

	/***
	 * 메소드입니다. 의사의 이름, 생년월일, 담당부서를 입력받아 비교 후, 동일한 경우 의사 면허번호를 리턴하는 기능입니다.
	 * @param staffName 의사 이름
	 * @param staffBirth 의사 생년월일
	 * @param staffdepartment 의사의 담당 부서
	 * @return 의사 면허번호(성공 시 의사의 면허번호, 실패 시 null)
	 */
	public static String getStaffNumber(String staffName, String staffBirth, String staffdepartment) {
		for (Doctor d : Data.doctorList) {
			if (d.getdName().equals(staffName) && d.getdJumin().substring(0, 6).equals(staffBirth)
					&& d.getdDepartment().equals(staffdepartment)) {
				return d.getdNumber();
			}

		}
		return null;
	} //

	/***
	 * 메소드입니다. 의사의 면허 번호를 입력받아 의사 리스트에서 등록된 면허 번호와 일치하는 지 비교하는 기능입니다.
	 * @param staffNumber 의사 면허 번호
	 * @return 의사 데이터(성공 시 의사 데이터, 실패 시 null)
	 */
	public static Doctor getMedicalStaff(String staffNumber) { // 2
		for (Doctor d : Data.doctorList) {
			if (d.getdNumber().equals(staffNumber)) {

				return d;

			}

		}

		return null;

	}// getMedicalStaff 의사

	/***
	 * 메소드입니다. 간호사의 면허 번호를 입력받아 간호사 리스트에서 등록된 면허 번호와 일치하는 지 비교하는 기능입니다.
	 * @param staffNumber 간호사 면허 번호
	 * @return 간호사 데이터(성공 시 간호사 데이터, 실패 시 null)
	 */
	public static Nurse getMedicalStaffn(String staffNumber) { // 2
		for (Nurse n : Data.nurseList) {
			if (n.getnNumber().equals(staffNumber)) {

				return n;

			}

		}

		return null;

	}// getMedicalStaffn 간호사

	/***
	 * 메소드입니다. 병원 데이터를 리턴하는 기능입니다.
	 * @return 병원 데이터
	 */
	public static Hospital getHospitalInfo() {
		for (Hospital hi : Data.hospitalList) {

			return hi;

		}
		return null;
	} // 병원 정보

	/***
	 * 메소드입니다. 간호사의 면허 번호를 입력받아 간호사 리스트에서 등록된 면허 번호와 일치하는 지 비교하는 기능입니다.
	 * @param staffNumber 간호사 면허 번호
	 * @return 간호사 데이터(성공 시 간호사 데이터, 실패 시 null)
	 */
	public static Nurse getNurseStaff(String staffNumber) {
		for (Nurse n : Data.nurseList) {
			if (n.getnNumber().equals(staffNumber)) { //

				return n;
			}
		}
		return null;
	}

	/***
	 * 메소드입니다. 의사의 면허 번호를 입력받아 의사 데이터에서 등록된 면허 번호와 일치하는 지 비교하는 기능입니다.
	 * @param staffNumber 의사 면허 번호
	 * @return 의사 데이터(성공 시 의사 데이터, 실패 시 null)
	 */
	public static Doctor getDoctorStaff(String staffNumber) {
		for (Doctor d : Data.doctorList) {
			if (d.getdNumber().equals(staffNumber)) {

				return d;
			}
		}
		return null;
	}

	/***
	 * 메소드입니다. 환자 신규 데이터 생성시 추가 환자 번호를 부여하는 기능입니다.
	 * @return 환자 번호 최대값 +1
	 */
	public static int createPnum() {

		int max = 0;

		for (Patient p : Data.patientList) {

			if (p.getpNumber() > max) {
				max = p.getpNumber();
			}

		}

		return max + 1;

	} // 최대 환자 번호 생성

	/***
	 * 메소드입니다. 환자 데이터에서 환자를 입력받아 환자 데이터에서 해당 index의 환자를 삭제하는 기능입니다. 
	 * @param patient 환자 객체
	 */
	public static void leaveRemove(Patient patient) {
		// patientlist에 저장되어있는 해당 객체의 index값
		int index = Data.patientList.indexOf(patient);

		// 해당 index의 요소 삭제
		Data.patientList.remove(index);
		Data.medicalInfoList.remove(index);
		Data.patientconditionList.remove(index);

		// 삭제된 ArrayList 저장
		Data.save();
	}
	
	/***
	 * 메소드입니다. 데이터 유효성 기능입니다.
	 * @param Name 이름
	 * @param Birth 생년월일
	 * @param Tel 전화번호
	 * @return 데이터 유효성 참, 거짓
	 */
	public static boolean isValid(String Name, String Birth, String Tel) {

		String regexName = ""; // 정규식 문자열
		Pattern patternName = null; // 정규식 객체
		Matcher matcherName = null; // 검사 결과 객체
		
		String regexBirth = ""; 
		Pattern patternBirth = null; 
		Matcher matcherBirth = null;
		
		String regexTel = ""; 
		Pattern patternTel = null; 
		Matcher matcherTel = null; 
		
		// 1. 이름 > 필수, 한글 2~5자 이내
		regexName = "^[(가-힣)]{2,5}$";
		patternName = Pattern.compile(regexName);
		matcherName = patternName.matcher(Name);
		// 2.생년월일 > 필수, 숫자 6자
		regexBirth = "^[0-9]{2}(0[1-9]||1[0-2])(0[1-9]||[1-2][0-9]||3[0-1])$";
		patternBirth = Pattern.compile(regexBirth);
		matcherBirth = patternBirth.matcher(Birth);
		// 3.전화번호 뒷자리 > 필수, 숫자 4자
		regexTel = "^[0-9]{4}$";
		patternTel = Pattern.compile(regexTel);
		matcherTel = patternTel.matcher(Tel);
		
		if (!matcherName.find() || !matcherBirth.find() || !matcherTel.find()) {
			if (!matcherName.find()) {
				System.out.println("이름은 한글로 2~5자 이내로 입력하세요.(필수)");
			}
			
			if(!matcherBirth.find()) {
				System.out.println("생년월일은 6자리 숫자로 양식에 맞게 입력하세요.(필수)");

			}

			if ( !matcherTel.find()) {
				System.out.println("전화번호 뒷자리는 4자리 숫자로 입력하세요.(필수)");
			}
			
			return false;
		}

		return true;
		
	}//isValid_pName,pBirth,pTel
	
	/***
	 * 메소드입니다. 데이터 유효성 기능입니다.
	 * @param medicalRecords 진료기록
	 * @param treatment 처치결과
	 * @param severity 중증도
	 * @param prescription 약 종류
	 * @param medicine 처방 약
	 * @return 데이터 유효성 참, 거짓
	 */
	public static boolean isValid(String medicalRecords, String treatment, String severity, String prescription, String medicine) {

		String regexRecords = ""; // 정규식 문자열
		Pattern patternRecords = null; // 정규식 객체
		Matcher matcherRecords = null; // 검사 결과 객체
		
		String regexTreatment = ""; 
		Pattern patternTreatment = null; 
		Matcher matcherTreatment = null;
		
		String regexSeverity = ""; 
		Pattern patternSeverity = null; 
		Matcher matcherSeverity = null; 
	
		String regexPrescription = ""; 
		Pattern patternPrescription = null; 
		Matcher matcherPrescription = null; 
		
		String regexMedicine = ""; 
		Pattern patternMedicine = null; 
		Matcher matcherMedicine = null; 
		
		// 1. 진료 내용 > 필수, 한글(공백 포함) 50자 이내
		regexRecords = "^[가-힣\\s]{2,50}$";
		patternRecords = Pattern.compile(regexRecords);
		matcherRecords = patternRecords.matcher(medicalRecords);
		
		// 2. 처치 > 필수, 한글(공백 포함) 50자 이내
		regexTreatment = "^[가-힣\\s]{2,50}$";
		patternTreatment = Pattern.compile(regexTreatment);
		matcherTreatment = patternTreatment.matcher(treatment);
		
		// 3.중증도 > 한글, 필수, "무증상||경증||중증||위중" 
		regexSeverity = "[무증상||경증||중증||위중]";
		patternSeverity= Pattern.compile(regexSeverity);
		matcherSeverity = patternSeverity.matcher(severity);
		
		//4. 약 종류 > 숫자 1자				
		regexPrescription = "^[1-7]{0,1}$";
		patternPrescription= Pattern.compile(regexPrescription);
		matcherPrescription = patternPrescription.matcher(prescription);
		
		//5. 처방약 > 한글(공백 포함) 20자 이내				
		regexMedicine = "^[가-힣\\s]{2,20}$";
		patternMedicine= Pattern.compile(regexMedicine);
		matcherMedicine = patternMedicine.matcher(medicine);
		
		if (!matcherRecords.find() || !matcherTreatment.find() || !matcherSeverity.find() || !matcherPrescription.find() || !matcherMedicine.find()) {
			if (!matcherRecords.find()) {
				System.out.println("진료 내용은 한글(공백포함)로 2 ~ 50자 이내로 입력하세요.(필수)");
			}
			
			if(!matcherTreatment.find()) {
				System.out.println("처치는 한글(공백포함)로 2 ~ 50자 이내로 입력하세요.(필수)");

			}
			
			if(!matcherSeverity.find()) {
				System.out.println("중증도는 한글로 무증상 or 경증 or 중증 or 위중으로 입력하세요.(필수)");
				
			}

			if (!matcherPrescription.find()) {
				System.out.println("처방약의 종류는 숫자 1~8로 입력하거나 처방하지 않을 경우 엔터를 누르세요.");
			}					

			if (!matcherMedicine.find()) {
				System.out.println("처방약은 2 ~ 20자 이내로 입력하세요.");
			}					
			
			return false;
		}

		return true;
		
	}//isValid_medicalRecords, treatment, severity, prescription, medicine


	/***
	 * 메소드입니다. 데이터 유효성 기능입니다.
	 * @param temperature 체온
	 * @param diastolic 최저 혈압(이완기 혈압)
	 * @param systolic 최고 혈압 (수축기 혈압)
	 * @param pulse 맥박
	 * @param oxygen 산소포화도
	 * @param etc 기타사항
	 * @return 데이터 유효성 참, 거짓
	 */
	public static boolean isValid(String temperature, String diastolic, String systolic, String pulse,String oxygen, String etc) {
		
		String regexTemperature = ""; // 정규식 문자열
		Pattern patternTemperature = null; // 정규식 객체
		Matcher matcherTemperature = null; // 검사 결과 객체
		
		String regexDiastolic = ""; 
		Pattern patternDiastolic = null; 
		Matcher matcherDiastolic = null;
		
		String regexSystolic = ""; 
		Pattern patternSystolic = null; 
		Matcher matcherSystolic = null; 
	
		String regexPulse = ""; 
		Pattern patternPulse = null; 
		Matcher matcherPulse = null; 
		
		String regexOxygen = ""; 
		Pattern patternOxygen = null; 
		Matcher matcherOxygen = null; 
		
		String regexEtc = ""; 
		Pattern patternEtc = null; 
		Matcher matcherEtc = null; 
		
		// 1. 체온 > 필수, 숫자+소수점(.) 4자 
		regexTemperature = "[0-9]{2}\\.[0-9]";
		patternTemperature = Pattern.compile(regexTemperature);
		matcherTemperature = patternTemperature.matcher(temperature);
		
		// 2. 최저 혈압(이완기 혈압) > 필수, 숫자 2자 
		regexDiastolic = "^[0-9]{2}$";
		patternDiastolic = Pattern.compile(regexDiastolic);
		matcherDiastolic = patternDiastolic.matcher(diastolic);
		
		// 3. 최고 혈압(수축기 혈압) > 필수, 숫자 3자
		regexSystolic = "^[0-9]{3}$";
		patternSystolic= Pattern.compile(regexSystolic);
		matcherSystolic = patternSystolic.matcher(systolic);
		
		// 4. 맥박 > 필수, 숫자 2 ~ 3자				
		regexPulse = "^[0-9]{2,3}$";
		patternPulse= Pattern.compile(regexPulse);
		matcherPulse = patternPulse.matcher(pulse);
		
		// 5.산소포화도 > 필수,  숫자 2 ~ 3자				
		regexOxygen ="^[0-9]{2,3}$";
		patternOxygen= Pattern.compile(regexOxygen);
		matcherOxygen = patternOxygen.matcher(oxygen);
		
		// 6. 기타 사항 > 한글 30자 이내
		regexEtc = "^[가-힣\\s]{0,30}$";
		patternEtc = Pattern.compile(regexEtc);
		matcherEtc = patternEtc.matcher(etc);
		
		if (!matcherTemperature.find() || !matcherDiastolic.find() || !matcherSystolic.find() || !matcherPulse.find() || !matcherOxygen.find() || !matcherEtc.find()) {
			if (!matcherTemperature.find()) {
				System.out.println("체온은 숫자 2자 + 소수점(.) + 숫자 1자로 입력하세요.(필수)");
			}
			
			if(!matcherDiastolic.find()) {
				System.out.println("최저 혈압(이완기 혈압)은 숫자 2자로 입력하세요.(필수)");

			}
			
			if(!matcherSystolic.find()) {
				System.out.println("최고 혈압(수축기 혈압)은 숫자 3자로 입력하세요.(필수)");
				
			}

			if (!matcherPulse.find()) {
				System.out.println("맥박은 숫자 2 ~ 3자 이내로 입력하세요	(필수)");
			}					

			if (!matcherOxygen.find()) {
				System.out.println("산소포화도는 숫자 2 ~ 3자이내로 입력하세요.(필수)");
			}		
			
			if (!matcherEtc.find()) {
				System.out.println("기타 사항은 한글 30자 이내 입력하세요.");
			}					
			
			return false;
		}

		return true;

	}//isValid_temperature, diastolic, systolic, pulse, oxygen, etc
	
	/***
	 * 메소드입니다. 간호사 신규 데이터 생성시 추가 간호사 면허번호를 부여하는 기능입니다.
	 * @return 면허번호 + 1
	 */
	public static int createNnum() {
		int max = 0;
		
		
		for(Nurse n : Data.nurseList) {
			String[] temp = n.getnNumber().split("N");
			String tempN = temp[0];
			String tempNumber = temp[1];
			
			
			int nurseNumber = Integer.parseInt(tempNumber);

			if (nurseNumber > max) {
				max = nurseNumber;
			}

			// String nurseNewNum = "N"+nurseNumber;
		}

		return max + 1;
		// return max +1;
	}

	/***
	 * 메소드입니다. 환자데이터에서 환자 객체를 삭제하는 기능입니다.
	 * @param pNumber 환자 번호
	 */
	public static void deleteMember(Patient pNumber) {

		for (int i = 0; i < Data.patientList.size(); i++) {

			Data.patientList.remove(i);
			// return 1;
		}

	}

	// 간호사 - 의사 커넥션 넘버
	/***
	 * 메소드입니다. 1에서 30까지의 숫자를 난수 값으로 저장하는 기능입니다.
	 * @return 1에서 30 사이의 난수
	 */
	public static int createConnection() {
		Random rnd = new Random();
		return rnd.nextInt(30) + 1;
	}

	// 의사 고유 번호 (D2001..)
	/***
	 * 메소드입니다. 의사 신규 데이터 생성시 추가 의사 면허번호를 부여하는 기능입니다.
	 * @return 의사 면허번호 +1
	 */
	public static int createDnum() {
		int max = 0;

		for (Doctor d : Data.doctorList) {
			String[] temp = d.getdNumber().split("D20");
			String tempD = temp[0];
			String tempNumber = temp[1];

			int doctorNumber = Integer.parseInt(tempNumber);

			if (doctorNumber > max) {
				max = doctorNumber;
			}
		}

		return max + 1;

	}

	// 의사 번호 1~30
	/***
	 * 메소드입니다. 의사의 면허 번호를 신규 추가시 저장하는 기능입니다.
	 * @return 최대 면허 번호값 + 1
	 */
	public static int doctorNum() {
		int max = 0;

		for (Doctor d : Data.doctorList) {
			if (max < d.getdConnectionNumber()) {
				max = d.getdConnectionNumber();
			}
		}

		return max + 1;
	}
	
	/***
	 * 메소드입니다. 데이터 유효성 기능입니다.
	 * @param name 이름
	 * @param gender 성별
	 * @param tel 전화번호
	 * @param age 나이
	 * @param height 키
	 * @param weight 몸무게
	 * @param vaccine 백신 접종 유무
	 * @param disease 기저질환
	 * @param address 주소
	 * @param reinfection 코로나 재감염 여부
	 * @return (참, 거짓)
	 */
	public static boolean isValid(String name, String gender, String tel, String age, String height, String weight,
	         String vaccine, String disease, String address, String reinfection) {
	      
	      String regexName = ""; // 정규식 문자열
	      Pattern patternName = null; // 정규식 객체
	      Matcher matcherName = null; // 검사 결과 객체
	      
	      String regexGender = ""; 
	      Pattern patternGender = null; 
	      Matcher matcherGender = null;
	      
	      String regexTel = ""; 
	      Pattern patternTel = null; 
	      Matcher matcherTel = null; 
	   
	      String regexAge = ""; 
	      Pattern patternAge = null; 
	      Matcher matcherAge = null; 
	      
	      String regexHeight = ""; 
	      Pattern patternHeight = null; 
	      Matcher matcherHeight= null; 
	      
	      String regexWeight = ""; 
	      Pattern patternWeight = null; 
	      Matcher matcherWeight = null; 
	      
	      String regexVaccine = ""; 
	      Pattern patternVaccine = null; 
	      Matcher matcherVaccine = null;
	      
	      String regexDisease = ""; 
	      Pattern patternDisease = null; 
	      Matcher matcherDisease = null; 
	      
	      String regexAddress = ""; 
	      Pattern patternAddress = null; 
	      Matcher matcherAddress = null; 
	      
	      String regexReinfection = ""; 
	      Pattern patternReinfection = null; 
	      Matcher matcherReinfection = null; 
	      
	   
	      // 1. 이름 >  한글 2~ 5자 입력
	      regexName = "([가-힣]{2,5}) || ([가-힣]{0})";
	      patternName = Pattern.compile(regexName);
	      matcherName = patternName.matcher(name);
	      
	      // 2. 성별 > 남자 or 여자
	      regexGender = "([남자|여자]) || ([가=힣]{0})";
	      patternGender = Pattern.compile(regexGender);
	      matcherGender = patternGender.matcher(gender);
	      
	      // 3. 전화번호 > 01000000000로 입력
	      regexTel = "(01[017][0-9]{8}) || [0-9]{0}";
	      patternTel = Pattern.compile(regexTel);
	      matcherTel = patternTel.matcher(tel);
	      
	      // 4. 나이 > 1 ~ 150 이내
	      regexAge = "([1-9]{0,1}) || ([1-9][0-9]{1,2})";
	      patternAge= Pattern.compile(regexAge);
	      matcherAge = patternAge.matcher(age);
	      
	      // 5. 키 > 숫자+소수점(.) 4~5자 이내            
	      regexHeight ="([0-9]{3}\\.[0-9]) || ([0-9]{0})";
	      patternHeight= Pattern.compile(regexHeight);
	      matcherHeight = patternHeight.matcher(height);
	      
	      // 6. 몸무게 > 숫자+소수점(.) 4~5자 이내
	      regexWeight = "([0-9]{2,3}\\.[0-9]) || ([0-9]{0})";
	      patternWeight = Pattern.compile(regexWeight);
	      matcherWeight = patternWeight.matcher(weight);
	      
	      // 7. 백신 접종 유무 > 예 or 아니오
	      regexVaccine = "^([예|아니오]) || ([가=힣]{0})";
	      patternVaccine = Pattern.compile(regexVaccine);
	      matcherVaccine = patternVaccine.matcher(vaccine);
	      
	      // 8. 기저 질환 > 한글 10자 이내
	      regexDisease = "^[가-힣\\s]{0,10}$";
	      patternDisease = Pattern.compile(regexDisease);
	      matcherDisease = patternDisease.matcher(disease);
	      
	      // 9. 주소 > 번지로 끝나게 입력
	      regexAddress = "([번지]$) || [가-힣]{0}";
	      patternAddress = Pattern.compile(regexAddress);
	      matcherAddress = patternAddress.matcher(address);
	      
	      // 10. 재감염 여부 > 한글 30자 이내
	      regexReinfection = "([예|아니오]) || ([가=힣]{0})";
	      patternReinfection = Pattern.compile(regexReinfection);
	      matcherReinfection = patternReinfection.matcher(reinfection);
	      
	      if (!matcherName.find() || !matcherGender.find() || !matcherTel.find() || !matcherAge.find() || !matcherHeight.find() || !matcherWeight.find() || !matcherVaccine.find() || !matcherDisease.find() || !matcherAddress.find() || !matcherReinfection.find()) {
	         if (!matcherName.find()) {
	            System.out.println("이름은 한글 2~ 5자 or 엔터를 입력하세요.");
	         }
	         
	         if(!matcherGender.find()) {
	            System.out.println("성별은 남자 or 여자 or 엔터를 입력하세요.");

	         }
	         
	         if(!matcherTel.find()) {
	            System.out.println("전화번호는 01OOOOOOOOO or 엔터를 입력하세요.");
	            
	         }

	         if (!matcherAge.find()) {
	            System.out.println("나이는 1 ~ 150세 이내 or 엔터를 입력하세요.");
	         }               

	         if (!matcherHeight.find()) {
	            System.out.println("키는 숫자+소수점(.) 4~5자 or 엔터를 입력하세요.");
	         }      
	         
	         if (!matcherWeight.find()) {
	            System.out.println("몸무게는 숫자+소수점(.) 4~5자 or 엔터를 입력하세요.");
	         }               
	         
	         if (!matcherVaccine.find()) {
	            System.out.println("백신은 예 or 아니오 or 엔터를 입력하세요.");
	         }               
	         
	         if (!matcherDisease.find()) {
	            System.out.println("질병은 한글 10자이내 or 엔터를 입력하세요.");
	         }               
	         
	         if (!matcherAddress.find()) {
	            System.out.println("주소는 번지 or 엔터를 입력하세요.");
	         }               
	         
	         if (!matcherReinfection.find()) {
	            System.out.println("재갑염여부는 예 or 아니오 or 엔터를 입력하세요.");
	         }               
	         
	         return false;
	      }

	      return true;
	   }//환자 개인정보 수정

}