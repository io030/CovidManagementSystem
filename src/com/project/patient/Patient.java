package com.project.patient;

/***
 * 
 * Patient 클래스입니다. 환자의 데이터를 관리합니다.
 * @author 2조
 *
 */
public class Patient {
// %s,%s,%s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s,%s,%d,%d
// 개인정보이용동의여부,입원날짜 환자이름,환자나이,환자 주민등록번호,환자 성별,환자 키,환자 몸무게,환자 전화번호
// 환자 백신 접종,유무환자기저질환,환자 주소,환자 코로나 재감염 여부,환자번호, 병실
	private String agreement;
	private String pDate;
	private String pName;
	private int pAge;
	private String pJumin;
	private String pGender;
	private double pHeight;
	private double pWeight;
	private String pTel;
	private String pVaccine;
	private String pDisease;
	private String pAddress;
	private String pReinfection;
	private int pNumber;
	private int pRoom;
	private int pConnectionNumber;
	
	/***
	 * 개인정보이용동의여부를 호출합니다.
	 * @return 개인정보이용동의여부
	 */
	public String getAgreement() {
		return agreement;
	}
	
	/***
	 * 개인정보이용동의여부를 설정합니다
	 * @param agreement 개인정보동의여부
	 */
	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}
	
	/***
	 * 입원 날짜를 호출합니다.
	 * @return 입원 날짜
	 */
	public String getpDate() {
		return pDate;
	}
	/***
	 * 입원 날짜를 설정합니다.
	 * @param pDate 입원 날짜
	 */
	public void setpDate(String pDate) {
		this.pDate = pDate;
	}
	/***
	 * 환자의 이름을 호출합니다.
	 * @return 환자 이름
	 */
	public String getpName() {
		return pName;
	}
	
	/***
	 * 환자의 이름을 설정합니다.
	 * @param pName 환자의 이름
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	/***
	 * 환자의 나이를 호출합니다.
	 * @return 환자의 나이
	 */
	public int getpAge() {
		return pAge;
	}
	/***
	 * 환자의 나이를 설정합니다.
	 * @param pAge 환자의 나이
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	
	/***
	 * 환자의 주민등록번호를 호출합니다.
	 * @return 환자의 주민등록번호
	 */
	public String getpJumin() {
		return pJumin;
	}
	/***
	 * 환자의 주민등록 번호를 설정합니다.
	 * @param pJumin 환자의 주민등록 번호
	 */
	public void setpJumin(String pJumin) {
		this.pJumin = pJumin;
	}
	
	/***
	 * 환자의 성별을 호출합니다.
	 * @return 환자의 성별
	 */
	public String getpGender() {
		return pGender;
	}
	/***
	 * 환자의 성별을 설정합니다.
	 * @param pGender 환자의 성별
	 */
	public void setpGender(String pGender) {
		this.pGender = pGender;
	}
	
	/***
	 * 환자의 키를 호출합니다.
	 * @return 환자의 키
	 */
	public double getpHeight() {
		return pHeight;
	}
	/***
	 * 환자의 키를 설정합니다.
	 * @param pHeight 환자의 키
	 */
	public void setpHeight(double pHeight) {
		this.pHeight = pHeight;
	}
	
	/***
	 * 환자의 몸무게를 호출합니다.
	 * @return 환자의 몸무게
	 */
	public double getpWeight() {
		return pWeight;
	}
	
	/***
	 * 환자의 몸무게를 설정합니다.
	 * @param pWeight 환자의 몸무게
	 */
	public void setpWeight(double pWeight) {
		this.pWeight = pWeight;
	}
	
	/***
	 * 환자의 전화번호를 호출합니다.
	 * @return 환자의 전화번호
	 */
	public String getpTel() {
		return pTel;
	}
	/***
	 * 환자의 전화번호를 설정합니다.
	 * @param pTel 환자의 전화번호
	 */
	public void setpTel(String pTel) {
		this.pTel = pTel;
	}
	
	/***
	 * 환자의 백신접종유무를 호출합니다.
	 * @return 환자의 백신접종유무
	 */
	public String getpVaccine() {
		return pVaccine;
	}
	/***
	 * 환자의 백신접종유무를 설정합니다.
	 * @param pVaccine 환자의 백신접종유무
	 */
	public void setpVaccine(String pVaccine) {
		this.pVaccine = pVaccine;
	}
	
	/***
	 * 환자의 기저질환을 호출합니다.
	 * @return 환자의 기저질환
	 */
	public String getpDisease() {
		return pDisease;
	}
	/***
	 * 환자의 기저질환을 설정합니다.
	 * @param pDisease 환자의 기저질환
	 */
	public void setpDisease(String pDisease) {
		this.pDisease = pDisease;
	}
	
	/***
	 * 환자의 주소를 호출합니다.
	 * @return 환자의 주소
	 */
	public String getpAddress() {
		return pAddress;
	}
	/***
	 * 환자의 주소를 설정합니다.
	 * @param pAddress 환자의 주소
	 */
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	
	/***
	 * 환자의 코로나 재감염여부를 호출합니다.
	 * @return 환자의 코로나 재감염여부
	 */
	public String getpReinfection() {
		return pReinfection;
	}
	/***
	 * 환자의 코로나 재감염여부를 설정합니다.
	 * @param pReinfection 환자의 코로나 재감염여부
	 */
	public void setpReinfection(String pReinfection) {
		this.pReinfection = pReinfection;
	}
	/***
	 * 환자의 고유번호를 호출합니다.
	 * @return 환자의 고유번호
	 */
	public int getpNumber() {
		return pNumber;
	}
	/***
	 * 환자의 고유번호를 설정합니다.
	 * @param pNumber 환자의 고유 번호
	 */
	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}
	/***
	 * 환자의 방 번호를 호출합니다.
	 * @return 환자의 방 번호
	 */
	public int getpRoom() {
		return pRoom;
	}
	/***
	 * 환자의 방 번호를 설정합니다.
	 * @param pRoom 환자의 방 번호
	 */
	public void setpRoom(int pRoom) {
		this.pRoom = pRoom;
	}
	/***
	 * 의료진과의 연결 번호를 호출합니다.
	 * @return 의료진 연결 번호
	 */
	public int getpConnectionpNumber() {
		return pConnectionNumber;
	}
	/***
	 * 의료진과의 연결 번호를 설정합니다.
	 * @param pConnectionpNumber 의료진 연결 번호
	 */
	public void setpConnectionpNumber(int pConnectionpNumber) {
		this.pConnectionNumber = pConnectionpNumber;
	}

	
}// Patient
