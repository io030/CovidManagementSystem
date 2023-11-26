package com.project.patientcondition;
/**
 * PatientCondition 클래스입니다. 환자의 상태를 호출합니다.
 * @author 2조
 *
 */
public class PatientCondition {
	// 환자 상태 더미 정보 생성
	// 측정날짜 ,측정시간 , 환자 체온 , 환자 최저혈압(이완기 혈압) , 환자 최고혈압(수축기 혈압) , 환자 맥박 , 환자의 산소포화도 , 기타 사항
	// 환자 번호 , 병실 ,환자 번호
	//%s,%d,%.1f,%d,%d,%d,%d,%s,%d,%d
	
	private String pcDate;
	private int pcTime;
	private double pcTemperature;
	private int pcDiastolic ;
	private int pcSystolic ;
	private int pcPulse;
	private int pcOxygen;
	private String pcEtc;
	private int pcNumber;
	private int pcRoom;

	/**
	 * 환자의 측정날짜를 호출합니다.
	 * @return 측정 날짜
	 */
	public String getPcDate() {
		return pcDate;
	}
	/**
	 * 환자의 측정날짜를 설정합니다.
	 * @param pcDate 측정 날짜
	 */
	public void setPcDate(String pcDate) {
		this.pcDate = pcDate;
	}
	/**
	 * 환자의 측정 시간을 호출합니다.
	 * @return 측정 시간
	 */
	public int getPcTime() {
		return pcTime;
	}
	/**
	 * 환자의 측정 시간을 설정합니다.
	 * @param pcTime 측정 시간
	 */
	public void setPcTime(int pcTime) {
		this.pcTime = pcTime;
	}
	/**
	 * 환자의 체온을 호출합니다.
	 * @return 환자 체온
	 */
	public double getPcTemperature() {
		return pcTemperature;
	}
	/**
	 * 환자의 체온을 설정합니다.
	 * @param pcTemperature 환자 체온
	 */
	public void setPcTemperature(double pcTemperature) {
		this.pcTemperature = pcTemperature;
	}
	/**
	 * 환자의 최저혈압을 호출합니다.
	 * @return 환자 최저혈압
	 */
	public int getPcDiastolic() {
		return pcDiastolic;
	}
	/**
	 * 환자의 최저혈압을 설정합니다.
	 * @param pcDiastolic 환자 최저혈압
	 */
	public void setPcDiastolic(int pcDiastolic) {
		this.pcDiastolic = pcDiastolic;
	}
	/**
	 * 환자의 최고혈압을 호출합니다.
	 * @return 환자 최고혈압
	 */
	public int getPcSystolic() {
		return pcSystolic;
	}
	/**
	 * 환자의 최고혈압을 설정합니다.
	 * @param pcSystolic 환자 최고혈압
	 */
	public void setPcSystolic(int pcSystolic) {
		this.pcSystolic = pcSystolic;
	}
	/**
	 * 환자의 맥박을 호출합니다.
	 * @return 환자 맥박
	 */
	public int getPcPulse() {
		return pcPulse;
	}
	/**
	 * 환자의 맥박을 설정합니다.
	 * @param pcPulse 환자 맥박
	 */
	public void setPcPulse(int pcPulse) {
		this.pcPulse = pcPulse;
	}
	/**
	 * 환자의 산소포화도를 호출합니다.
	 * @return 환자 산소포화도
	 */
	public int getPcOxygen() {
		return pcOxygen;
	}
	/**
	 * 환자의 산소포화도를 설정합니다.
	 * @param pcOxygen 환자 산소포화도
	 */
	public void setPcOxygen(int pcOxygen) {
		this.pcOxygen = pcOxygen;
	}
	/**
	 * 환자의 기타사항을 호출합니다.
	 * @return 기타사항
	 */
	public String getPcEtc() {
		return pcEtc;
	}
	/**
	 * 환자의 기타사항을 설정합니다.
	 * @param pcEtc 기타사항
	 */
	public void setPcEtc(String pcEtc) {
		this.pcEtc = pcEtc;
	}
	/**
	 * 환자의 번호를 호출합니다
	 * @return 환자번호
	 */
	public int getPcNumber() {
		return pcNumber;
	}
	/**
	 * 환자의 번호를 설정합니다.
	 * @param pcNumber 환자번호
	 */
	public void setPcNumber(int pcNumber) {
		this.pcNumber = pcNumber;
	}
	/**
	 * 환자의 병실을 호출합니다.
	 * @return 환자병실
	 */
	public int getPcRoom() {
		return pcRoom;
	}
	/**
	 * 환자의 병실을 설정합니다.
	 * @param pcRoom 환자병실
	 */
	public void setPcRoom(int pcRoom) {
		this.pcRoom = pcRoom;
	}
	
}// PatientCondition
