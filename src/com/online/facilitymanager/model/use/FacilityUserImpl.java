package com.online.facilitymanager.model.use;

public class FacilityUserImpl implements FacilityUser
{
	private String userID;
	private String userName;
	private long userPhone;
	private String userEmail;
	private String userRole;
	
	public FacilityUserImpl() {}
	
	/**
	 * @param userID
	 * @param userName
	 * @param userPhone
	 * @param userEmail
	 * @param userRole
	 */
	public FacilityUserImpl(String userID, String userName, long userPhone, String userEmail, String userRole) {
		this.userID = userID;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userRole = userRole;
	}

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPhone
	 */
	public long getUserPhone() {
		return userPhone;
	}

	/**
	 * @param userPhone the userPhone to set
	 */
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userRole
	 */
	public String getUserRole() {
		return userRole;
	}

	/**
	 * @param userRole the userRole to set
	 */
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
}
