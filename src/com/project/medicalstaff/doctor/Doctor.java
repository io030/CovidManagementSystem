package com.project.medicalstaff.doctor;

/***
 * 
 * Doctor 클래스입니다. 의사의 정보를 관리합니다.
 * @author 2조
 *
 */
public class Doctor {
	// 의료진 이름,의료진 나이,의료진 주민등록번호,의료진 성별,의료진 키 , 의료진 몸무게,의료진 전화번호,의료진 주소,의사면허번호
	// 의료진 담당부서 (소아 청소년과, 감염 내과)
	//%s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s
	private String dName; 
	private int dAge;
	private String dJumin;
	private String dGender;
	private double dHeight;
	private double dWeight;
	private String dTel;
	private String dAddress;
	private String dNumber; 
	private String dDepartment;
	private int dConnectionNumber;
	
	/***
	 * 의사의 이름을 호출합니다.
	 * @return 의사 이름
	 */
	public String getdName() {
		return dName;
	}
	
	/***
	 * 의사 이름을 설정합니다.
	 * @param dName 의사 이름
	 */
	public void setdName(String dName) {
		this.dName = dName;
	}
	
	/***
	 * 의사의 나이를 호출합니다.
	 * @return 의사 나이
	 */
	public int getdAge() {
		return dAge;
	}
	
	/***
	 * 의사의 나이를 설정합니다.
	 * @param dAge 의사 나이
	 */
	public void setdAge(int dAge) {
		this.dAge = dAge;
	}
	
	/***
	 * 의사의 주민등록번호를 호출합니다.
	 * @return 의사의 주민등록번호
	 */
	public String getdJumin() {
		return dJumin;
	}
	
	/***
	 * 의사의 주민등록번호를 설정합니다.
	 * @param dJumin 의사 주민등록번호
	 */
	public void setdJumin(String dJumin) {
		this.dJumin = dJumin;
	}
	
	/***
	 * 의사의 성별을 호출합니다.
	 * @return 의사의 성별
	 */
	public String getdGender() {
		return dGender;
	}
	
	/***
	 * 의사의 성별을 설정합니다.
	 * @param dGender 의사의 성별
	 */
	public void setdGender(String dGender) {
		this.dGender = dGender;
	}
	
	/***
	 * 의사의 키를 호출합니다.
	 * @return 의사의 키
	 */
	public double getdHeight() {
		return dHeight;
	}
	
	/***
	 * 의사의 키를 설정합니다.
	 * @param dHeight 의사의 키
	 */
	public void setdHeight(double dHeight) {
		this.dHeight = dHeight;
	}
	
	/***
	 * 의사의 몸무게를 호출합니다.
	 * @return 의사의 몸무게
	 */
	public double getdWeight() {
		return dWeight;
	}
	
	/***
	 * 의사의 몸무게를 설정합니다.
	 * @param dWeight 의사의 몸무게
	 */
	public void setdWeight(double dWeight) {
		this.dWeight = dWeight;
	}
	
	/***
	 * 의사의 전화번호를 호출합니다.
	 * @return 의사의 전화번호
	 */
	public String getdTel() {
		return dTel;
	}
	
	/***
	 * 의사의 전화번호를 설정합니다.
	 * @param dTel 의사의 전화번호
	 */
	public void setdTel(String dTel) {
		this.dTel = dTel;
	}
	
	/***
	 * 의사의 주소를 호출합니다.
	 * @return 의사의 주소
	 */
	public String getdAddress() {
		return dAddress;
	}
	
	/***
	 * 의사의 주소를 설정합니다. 
	 * @param dAddress 의사의 주소
	 */
	public void setdAddress(String dAddress) {
		this.dAddress = dAddress;
	}
	
	/***
	 * 의사의 면허 번호를 호출합니다.
	 * @return 의사 면허번호
	 */
	public String getdNumber() {
		return dNumber;
	}
	
	/***
	 * 의사의 면허 번호를 설정합니다.
	 * @param dNumber 의사 면허번호
	 */
	public void setdNumber(String dNumber) {
		this.dNumber = dNumber;
	}
	
	/***
	 * 의사의 담당 부서를 호출합니다.
	 * @return 의사의 담당 부서
	 */
	public String getdDepartment() {
		return dDepartment;
	}
	/***
	 * 의사의 담당 부서를 설정합니다.
	 * @param dDepartment 의사의 담당 부서
	 */
	public void setdDepartment(String dDepartment) {
		this.dDepartment = dDepartment;
	}
	
	/***
	 * 
	 * 의사의 담당 환자 및 간호사를 이을 번호를 호출합니다.
	 * @return 의사 번호
	 */
	public int getdConnectionNumber() {
		return dConnectionNumber;
	}
	
	/***
	 * 의사의 담당 환자 및 간호사를 이을 번호를 설정합니다.
	 * @param dConnectionNumber 의사 번호
	 */
	public void setdConnectionNumber(int dConnectionNumber) {
		this.dConnectionNumber = dConnectionNumber;
	}
}// Doctor
