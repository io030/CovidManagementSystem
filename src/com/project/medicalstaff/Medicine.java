package com.project.medicalstaff;

/***
 * Medicine 클래스입니다. 환자에게 처방하는 약의 종류를 관리합니다.
 * @author 2조
 *
 */
public class Medicine {
	
		// 처방약 종류
		// 처방약
	
		//%s,%s
		private String medicineType;
		private String medicine;
		
		/***
		 * 처방 약의 종류를 호출합니다.
		 * @return 처방 약 종류
		 */
		public String getMedicineType() {
			return medicineType;
		}
		
		/***
		 * 처방 약의 종류를 설정합니다.
		 * @param medicineType 처방 약 종류
		 */
		public void setMedicineType(String medicineType) {
			this.medicineType = medicineType;
		}
		
		/***
		 * 처방 약을 호출합니다.
		 * @return 처방 약
		 */
		public String getMedicine() {
			return medicine;
		}
		
		/***
		 * 처방 약을 설정합니다.
		 * @param medicine 처방 약
		 */
		public void setMedicine(String medicine) {
			this.medicine = medicine;
		}
		
}