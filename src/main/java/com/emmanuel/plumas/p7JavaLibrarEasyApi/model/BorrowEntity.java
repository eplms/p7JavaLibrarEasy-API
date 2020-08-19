package com.emmanuel.plumas.p7JavaLibrarEasyApi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="borrow")
public class BorrowEntity implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long borrowId;
	private Date startDate;
	private Date endDate;
	private Boolean isExtended;
	
	@ManyToOne
	@JoinColumn(name="copy_id")
	private CopyEntity copyEntity;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity userEntity;

	public BorrowEntity(Long borrowId, Date startDate, Date endDate, Boolean isExtended, CopyEntity copyEntity,
			UserEntity userEntity) {
		super();
		this.borrowId = borrowId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isExtended = isExtended;
		this.copyEntity = copyEntity;
		this.userEntity = userEntity;
	}

	public BorrowEntity() {
		super();
	}

	public Long getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(Long borrowId) {
		this.borrowId = borrowId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Boolean getIsExtended() {
		return isExtended;
	}

	public void setIsExtended(Boolean isExtended) {
		this.isExtended = isExtended;
	}

	public CopyEntity getCopyEntity() {
		return copyEntity;
	}

	public void setCopyEntity(CopyEntity copyEntity) {
		this.copyEntity = copyEntity;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	@Override
	public String toString() {
		return "BorrowEntity [borrowId=" + borrowId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", isExtended=" + isExtended + ", copyEntity=" + copyEntity + ", userEntity=" + userEntity + "]";
	}

	
	
	
	
	
}
