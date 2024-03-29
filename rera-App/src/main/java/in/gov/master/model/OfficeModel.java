package in.gov.master.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "OfficeModel")
@Table(name = "TM_RERA_OFFICE")
public class OfficeModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7678687991L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OFFICE_ID")
	private Long officeId;
	
	@Column(name = "OFFICE_NAME")
	private String officeName;
	
	@Column(name = "OFFICE_ADDRESS", length = 500)
	private String officeAddress;

	public Long getOfficeId() {
		return officeId;
	}

	public void setOfficeId(Long officeId) {
		this.officeId = officeId;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	
	
}
