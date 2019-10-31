package in.gov.master.user.model;


import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnTransformer;

import in.gov.master.constants.ReraConstants;
import in.gov.master.model.DistrictModel;
import in.gov.master.model.OfficeModel;
import in.gov.master.model.ZoneModel;

@Entity(name = "UserModel")
@Table(name = "TM_USER")
public class UserModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 467623201L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private long userId;
	
	@Column(name = "LOGIN_ID")
	@ColumnTransformer(read = "AES_DECRYPT(LOGIN_ID, UNHEX('" + ReraConstants.KEY_ENC_DNC + "'))", write = "AES_ENCRYPT(?, UNHEX('" + ReraConstants.KEY_ENC_DNC + "'))")
	private String loginId;
	
	@Column(name = "PASSWORD")
	@ColumnTransformer(read = "AES_DECRYPT(PASSWORD, UNHEX('" + ReraConstants.KEY_ENC_DNC + "'))", write = "AES_ENCRYPT(?, UNHEX('" + ReraConstants.KEY_ENC_DNC + "'))")
	private String password;
	
	@Column(name = "EMAILID")
	private String emailId;
	
	@Column(name = "LAST_PAYMENT_STATUS")
	private String lastPaymentStatus;
	
	@Column(name = "MOBILE_NO", length = 10)
	private String mobileNo;
	
	@Column(name = "DESIGNATION")
	private String designation;
	
	@Column(name = "USER_TYPE")
	private String userType;
	
	@Column(name = "AUTHORITY_TYPE")
	private String authorityType;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_STATUS")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "DISTRICT_ID")
	private DistrictModel district;
	
	@ManyToOne
	@JoinColumn(name = "ZONE_ID")
	private ZoneModel zone;
	
	@ManyToOne
	@JoinColumn(name = "OFFICE_ID")
	private OfficeModel tpoOffice;
	
	@Column(name="CREATED_ON")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdOn;
	
	
	public DistrictModel getDistrict() {
		return district;
	}

	public void setDistrict(DistrictModel district) {
		this.district = district;
	}

	public ZoneModel getZone() {
		return zone;
	}

	public void setZone(ZoneModel zone) {
		this.zone = zone;
	}

	public String getAuthorityType() {
		return authorityType;
	}

	public void setAuthorityType(String authorityType) {
		this.authorityType = authorityType;
	}

	public Calendar getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getLoginId() {
		return loginId;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserType() {
		return userType;
	}
	
	public String getLastPaymentStatus() {
		return lastPaymentStatus;
	}

	public void setLastPaymentStatus(String lastPaymentStatus) {
		this.lastPaymentStatus = lastPaymentStatus;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public OfficeModel getTpoOffice() {
		return tpoOffice;
	}

	public void setTpoOffice(OfficeModel tpoOffice) {
		this.tpoOffice = tpoOffice;
	}
	
}
