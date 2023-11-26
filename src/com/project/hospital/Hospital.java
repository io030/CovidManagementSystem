package com.project.hospital;

/***
 * Hospital 클래스입니다. 병원의 정보를 관리합니다.
 * @author 2조
 *
 */
public class Hospital {
	private String floor;
	private String facility1;
	private String facility2;
	private String facility3;
	private String facility4;
	private String tel;
	private String location;

	/***
	 * 병원의 층 정보를 호출합니다.
	 * @return floor
	 */
	public String getFloor() {
		return floor;
	}

	/***
	 * 병원의 층 정보를 설정합니다.
	 * @param floor 층 정보
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}

	/***
	 * 1층의 1호실의 정보를 호출합니다.
	 * @return 1호실 정보
	 */
	public String getFacility1() {
		return facility1;
	}

	/***
	 * 1층의 1호실의 정보를 설정합니다.
	 * @param facility1 1호실 정보
	 */
	public void setFacility1(String facility1) {
		this.facility1 = facility1;
	}

	/***
	 * 1층의 2호실의 정보를 호출합니다.
	 * @return 2호실 정보
	 */
	public String getFacility2() {
		return facility2;
	}

	/***
	 * 1층의 2호실의 정보를 설정합니다.
	 * @param facility2 2호실 정보
	 */
	public void setFacility2(String facility2) {
		this.facility2 = facility2;
	}

	/***
	 * 1층의 3호실의 정보를 호출합니다.
	 * @return 1층 3호실 정보
	 */
	public String getFacility3() {
		return facility3;
	}

	/***
	 * 1층의 3호실의 정보를 설정합니다.
	 * @param facility3 3호실 정보
	 */
	public void setFacility3(String facility3) {
		this.facility3 = facility3;
	}

	/***
	 * 1층의 4호실의 정보를 호출합니다.
	 * @return 1층 4호실 정보
	 */
	public String getFacility4() {
		return facility4;
	}

	/***
	 * 1층의 4호실의 정보를 설정합니다.
	 * @param facility4 4호실 정보
	 */
	public void setFacility4(String facility4) {
		this.facility4 = facility4;
	}

	/***
	 * 병원의 전화번호를 호출합니다.
	 * @return 병원 전화번호
	 */
	public String getTel() {
		return tel;
	}

	/***
	 * 병원의 전화번호를 설정합니다.
	 * @param tel 병원 전화번호
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/***
	 * 병원의 위치를 호출합니다.
	 * @return 병원 위치
	 */
	public String getLocation() {
		return location;
	}

	/***
	 * 병원의 위치를 설정합니다.
	 * @param location 병원 위치
	 */
	public void setLocation(String location) {
		this.location = location;
	}

}
