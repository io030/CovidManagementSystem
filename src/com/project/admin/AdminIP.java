package com.project.admin;

/***
 * 
 * AdminIP 클래스입니다. 관리자의 아이디와 패스워드를 관리합니다.
 * @author 2조
 *
 */
public class AdminIP {

	private String adminId;
	private String adminPw;

	/***
	 * 관리자의 아이디를 호출합니다.
	 * @return 관리자 id
	 */
	public String getAdminId() {
		return adminId;
	}

	/***
	 * 관리자의 아이디를 설정합니다.
	 * @param adminId 관리자 id
	 */
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	/***
	 * 관리자의 패스워드를 호출합니다.
	 * @return 관리자 pw
	 */
	public String getAdminPw() {
		return adminPw;
	}

	/***
	 * 관리자의 패스워드를 설정합니다.
	 * @param adminPw 관리자 pw
	 */
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
}
