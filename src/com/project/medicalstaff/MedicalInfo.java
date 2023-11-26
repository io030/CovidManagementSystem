package com.project.medicalstaff;

/***
 * MedicalInfo 클래스입니다. 환자의 진료 기록을 관리합니다.
 * @author 2조
 *
 */
public class MedicalInfo {
	
//	/* %s 진료 날짜 */ "2022-09-" + (date <= 9 ? "0"+ date : date),
//	/* %s 진료 기록*/medicalrecords[rnd.nextInt(medicalrecords.length)],
//	/* %s 처치 결과*/medicalTreatment[rnd.nextInt(medicalTreatment.length)] , 
//	/* %s 중증도*/ severity[rnd.nextInt(severity.length)] , 
//	/* %s 처방약 */medicine[rnd.nextInt(medicine.length)],
//	/* %s 의사명 */
//	/* %d 환자 정보*/patientNo);
	
	private String mDate;
	private String mInfo;
	private String mResult;
	private String mSevertity;
	private String mMedicine;
	private int mNumber;
	
	/***
	 * 환자의 진료 날짜를 호출합니다.
	 * @return 진료 날짜
	 */
	public String getmDate() {
		return mDate;
	}
	
	/***
	 * 환자의 진료 날짜를 설정합니다
	 * @param mDate 진료 날짜
	 */
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
	
	/***
	 *  환자의 진료 기록을 호출합니다.
	 * @return 진료 기록
	 */
	public String getmInfo() {
		return mInfo;
	}
	
	/***
	 * 환자의 진료 기록을 설정합니다.
	 * @param mInfo 진료 기록
	 */
	public void setmInfo(String mInfo) {
		this.mInfo = mInfo;
	}
	
	/***
	 * 환자의 처치결과를 호출합니다.
	 * @return 처치결과
	 */
	public String getmResult() {
		return mResult;
	}
	
	/***
	 * 환자의 처치결과를 설정합니다.
	 * @param mResult 처치결과
	 */
	public void setmResult(String mResult) {
		this.mResult = mResult;
	}
	
	/***
	 * 환자의 중증도를 호출합니다.
	 * @return 중증도
	 */
	public String getmSevertity() {
		return mSevertity;
	}
	
	/***
	 * 환자의 중증도를 설정합니다.
	 * @param mSevertity 중증도
	 */
	public void setmSevertity(String mSevertity) {
		this.mSevertity = mSevertity;
	}
	
	/***
	 * 환자의 처방약을 호출합니다.
	 * @return 처방약
	 */
	public String getmMedicine() {
		return mMedicine;
	}
	
	/***
	 * 환자의 처방약을 설정합니다.
	 * @param mMedicine 처방약
	 */
	public void setmMedicine(String mMedicine) {
		this.mMedicine = mMedicine;
	}

	/***
	 * 환자의 번호를 호출합니다.
	 * @return 환자 번호
	 */
	public int getmNumber() {
		return mNumber;
	}
	
	/***
	 * 환자의 번호를 설정합니다.
	 * @param mNumber 환자 번호
	 */
	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}
}
