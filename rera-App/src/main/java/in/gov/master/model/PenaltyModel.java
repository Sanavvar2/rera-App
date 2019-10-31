package in.gov.master.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "PenaltyModel")
@Table(name = "TM_PENALTY")
public class PenaltyModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1019469637729512931L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PENALTY_ID")
	private long penaltyId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EFFECTIVE_FROM")
	private Date effectiveFrom;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EFFECTIVE_TO")
	private Date effectiveTo;

	@Column(name = "PENALTY_CHARGE", length = 4, nullable = false, columnDefinition = "DOUBLE default '0.0'")
	private Double penaltyCharge;

	@Column(name = "ACTIVE", nullable = false, columnDefinition = "Boolean default FALSE")
	private boolean active;

	public long getPenaltyId() {
		return penaltyId;
	}

	public void setPenaltyId(long penaltyId) {
		this.penaltyId = penaltyId;
	}

	public Date getEffectiveFrom() {
		return effectiveFrom;
	}

	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public Date getEffectiveTo() {
		return effectiveTo;
	}

	public void setEffectiveTo(Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}

	public Double getPenaltyCharge() {
		return penaltyCharge;
	}

	public void setPenaltyCharge(Double penaltyCharge) {
		this.penaltyCharge = penaltyCharge;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
