package com.project.medicalstaff.nurse;

/***
 * 
 * Nurse 클래스입니다. 간호사의 데이터를 관리합니다.
 * @author 2조
 *
 */

public class Nurse {
	// 의료진 이름,의료진 나이,의료진 주민등록번호,의료진 성별,의료진 키 , 의료진 몸무게 ,의료진 전화번호,의료진 주소,간호사면허번호
	//의료진 담당부서 (소아 청소년과, 감염 내과)
	//%s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s,%d
	
	private String nName; 
	private int nAge;
	private String nJumin;  
	private String nGender;
	private double nHeight;
	private double nWeight;
	private String nTel;
	private String nAddress;
	private String nNumber; 
	private String nDepartment;
	private int nConnectionNumber;
	
	/***
	 * 간호사의 이름을 호출합니다.
	 * @return 간호사 이름
	 */
	public String getnName() {
		return nName;
	}
	
	/***
	 * 간호사의 이름을 설정합니다.
	 * @param nName 간호사 이름
	 */
	public void setnName(String nName) {
		this.nName = nName;
	}
	
	/***
	 * 간호사의 나이를 호출합니다.
	 * @return 간호사 나이
	 */
	public int getnAge() {
		return nAge;
	}
	
	/***
	 * 간호사의 나이를 설정합니다.
	 * @param nAge 간호사 나이
	 */
	public void setnAge(int nAge) {
		this.nAge = nAge;
	}
	
	/***
	 * 간호사의 주민등록번호를 호출합니다.
	 * @return 간호사의 주민등록번호
	 */
	public String getnJumin() {
		return nJumin;
	}
	
	/***
	 * 간호사의 주민등록번호를 설정합니다.
	 * @param nJumin 간호사의 주민등록번호
	 */
	public void setnJumin(String nJumin) {
		this.nJumin = nJumin;
	}
	
	/***
	 * 간호사의 성별을 호출합니다.
	 * @return 간호사의 성별
	 */
	public String getnGender() {
		return nGender;
	}
	
	/***
	 * 간호사의 성별을 설정합니다. 
	 * @param nGender 간호사 성별
	 */
	public void setnGender(String nGender) {
		this.nGender = nGender;
	}
	
	/***
	 * 간호사의 키를 호출합니다.
	 * @return 간호사 키
	 */
	public double getnHeight() {
		return nHeight;
	}
	
	/***
	 *  간호사의 키를 설정합니다.
	 * @param nHeight 간호사 키
	 */
	public void setnHeight(double nHeight) {
		this.nHeight = nHeight;
	}
	
	/***
	 * 간호사의 몸무게를 호출합니다.
	 * @return 간호사 몸무게
	 */
	public double getnWeight() {
		return nWeight;
	}
	
	/***
	 * 간호사의 몸무게를 설정합니다.
	 * @param nWeight 간호사 몸무게
	 */
	public void setnWeight(double nWeight) {
		this.nWeight = nWeight;
	}
	
	/***
	 * 간호사의 전화번호를 호출합니다.
	 * @return 간호사의 전화번호
	 */
	public String getnTel() {
		return nTel;
	}
	
	/***
	 * 간호사의 전화번호를 설정합니다.
	 * @param nTel 간호사의 전화번호
	 */
	public void setnTel(String nTel) {
		this.nTel = nTel;
	}
	
	/***
	 * 간호사의 주소를 호출합니다.
	 * @return 간호사 주소
	 */
	public String getnAddress() {
		return nAddress;
	}
	
	/***
	 * 간호사의 주소를 설정합니다.
	 * @param nAddress 간호사 주소
	 */
	public void setnAddress(String nAddress) {
		this.nAddress = nAddress;
	}
	
	/***
	 * 간호사의 면허 번호를 호출합니다.
	 * @return 간호사의 면허번호
	 */
	public String getnNumber() {
		return nNumber;
	}
	
	/***
	 * 간호사의 면허 번호를 설정합니다.
	 * @param nNumber 간호사의 면허번호
	 */
	public void setnNumber(String nNumber) {
		this.nNumber = nNumber;
	}
	
	/***
	 * 간호사의 면허 번호를 호출합니다.
	 * @return 간호사의 면허 번호
	 */
	public String getnDepartment() {
		return nDepartment;
	}
	
	/***
	 * 간호사의 담당 부서를 설정합니다.
	 * @param nDepartment 간호사의 담당 부서
	 */
	public void setnDepartment(String nDepartment) {
		this.nDepartment = nDepartment;
	}
	
	/***
	 * 담당 의사의 번호를 호출합니다.
	 * @return 담당 의사 번호
	 */
	public int getnConnectionNumber() {
		return nConnectionNumber;
	}
	
	/***
	 * 담당 의사의 번호를 설정합니다.
	 * @param nConnectionNumber 담당 의사 번호
	 */
	public void setnConnectionNumber(int nConnectionNumber) {
		this.nConnectionNumber = nConnectionNumber;
	}
}// Nurse
