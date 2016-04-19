package com.tao.training.domain.reservation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.Resource;
import com.tao.training.domain.person.BusinessPartner;

@JsonInclude(Include.NON_NULL)
public class ReservationItem extends AbstractDomain<Long>{
		
	public ReservationItem()
	{
		
	}
	private Long reservationId;
    private Resource reserveResource;
    private BusinessPartner reserveBp;

    private String reserveDate;
    private String reserveDateTo;
    private String flagPeriodMorning;
    private String flagPeriodAfternoon;
    private String timeDetail;
    private String remark;
	public Long getReservationId() {
		return reservationId;
	}
	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}
	public Resource getReserveResource() {
		return reserveResource;
	}
	public void setReserveResource(Resource reserveResource) {
		this.reserveResource = reserveResource;
	}
	public BusinessPartner getReserveBp() {
		return reserveBp;
	}
	public void setReserveBp(BusinessPartner reserveBp) {
		this.reserveBp = reserveBp;
	}
	public String getReserveDate() {
		return reserveDate;
	}
	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
	}
	public String getReserveDateTo() {
		return reserveDateTo;
	}
	public void setReserveDateTo(String reserveDateTo) {
		this.reserveDateTo = reserveDateTo;
	}
	public String getFlagPeriodMorning() {
		return flagPeriodMorning;
	}
	public void setFlagPeriodMorning(String flagPeriodMorning) {
		this.flagPeriodMorning = flagPeriodMorning;
	}
	public String getFlagPeriodAfternoon() {
		return flagPeriodAfternoon;
	}
	public void setFlagPeriodAfternoon(String flagPeriodAfternoon) {
		this.flagPeriodAfternoon = flagPeriodAfternoon;
	}
	public String getTimeDetail() {
		return timeDetail;
	}
	public void setTimeDetail(String timeDetail) {
		this.timeDetail = timeDetail;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
