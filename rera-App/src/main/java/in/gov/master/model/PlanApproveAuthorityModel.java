package in.gov.master.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import in.gov.master.user.model.UserModel;

@Entity(name = "PlanApproveAuthorityModel")
@Table(name = "TM_PLAN_APPROVE_AUTHORITY")
public class PlanApproveAuthorityModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1463124430214749418L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PLAN_APPR_AUTH_ID")
	private Long planApprAuthId;

	@Column(name = "PLAN_APPRAUTH_CODE", length = 10)
	private String planApprAuthCode;
	
	@Column(name = "PLAN_APPRAUTH_NAME", length = 50)
	private String planApprAuthName;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch =FetchType.LAZY)
	private List<DistrictModel> districtModelList;
	
	@Column(name = "CREATED_ON")
	private Calendar createdOn;
	
	@ManyToOne
	@JoinColumn(name = "CREATED_BY")
	private UserModel createdBy;

	@Column(name = "UPDATED_ON")
	private Calendar updatedOn;
	
	@ManyToOne
	@JoinColumn(name = "UPDATED_BY")
	private UserModel updatedBy;
	
	public Long getPlanApprAuthId() {
		return planApprAuthId;
	}

	public void setPlanApprAuthId(Long planApprAuthId) {
		this.planApprAuthId = planApprAuthId;
	}

	public String getPlanApprAuthCode() {
		return planApprAuthCode;
	}

	public void setPlanApprAuthCode(String planApprAuthCode) {
		this.planApprAuthCode = planApprAuthCode;
	}
 
	public String getPlanApprAuthName() {
		return planApprAuthName;
	}

	public void setPlanApprAuthName(String planApprAuthName) {
		this.planApprAuthName = planApprAuthName;
	}

	public List<DistrictModel> getDistrictModelList() {
		if(districtModelList==null)
			districtModelList = new ArrayList<DistrictModel>();
		return districtModelList;
	}

	public void setDistrictModelList(List<DistrictModel> districtModelList) {
		this.districtModelList = districtModelList;
	}

	public Calendar getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
	}

	public UserModel getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(UserModel createdBy) {
		this.createdBy = createdBy;
	}

	public Calendar getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Calendar updatedOn) {
		this.updatedOn = updatedOn;
	}

	public UserModel getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(UserModel updatedBy) {
		this.updatedBy = updatedBy;
	}
}
