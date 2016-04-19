package com.tao.training.domain.training;

import java.util.Set;

import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.PaymentMethod;
import com.tao.training.domain.master.PaymentType;
import com.tao.training.domain.person.Member;
import com.tao.training.domain.quotation.Quotation;
import com.tao.training.domain.receive.Receive;

public class Trainee extends AbstractDomain<Long>{

		public Trainee()
		{
			
		}
		  private Long trainingTxId;
		    private Training trainingObj;
		    private Member payerBp;

		    private Integer traineeAmt;
		    private PaymentType paymentType;
		    private PaymentMethod paymentMethod;
		    private String flagConfirm;
		    private Receive refReceiveTx;
		    private Receive refReceiveTxReturn;
		    private Quotation refQuotationTx;
		    private String memberInfo;
		    private String remark;
		    private String flagCancel;
		    private Double totalAmount;
		    private String flagInvoice;
		    private Double vatRate;
		    private Double vat;
		    private Double travellingExpense;
		    private Double accoummodationExpense;
		    private Double otherExpense;
		    private Double totalPrice;

		    private Set<TraineeItem> items;
		    private boolean selected;
			public Long getTrainingTxId() {
				return trainingTxId;
			}
			public void setTrainingTxId(Long trainingTxId) {
				this.trainingTxId = trainingTxId;
			}
			public Training getTrainingObj() {
				return trainingObj;
			}
			public void setTrainingObj(Training trainingObj) {
				this.trainingObj = trainingObj;
			}
			public Member getPayerBp() {
				return payerBp;
			}
			public void setPayerBp(Member payerBp) {
				this.payerBp = payerBp;
			}
			public Integer getTraineeAmt() {
				return traineeAmt;
			}
			public void setTraineeAmt(Integer traineeAmt) {
				this.traineeAmt = traineeAmt;
			}
			public PaymentType getPaymentType() {
				return paymentType;
			}
			public void setPaymentType(PaymentType paymentType) {
				this.paymentType = paymentType;
			}
			public PaymentMethod getPaymentMethod() {
				return paymentMethod;
			}
			public void setPaymentMethod(PaymentMethod paymentMethod) {
				this.paymentMethod = paymentMethod;
			}
			public String getFlagConfirm() {
				return flagConfirm;
			}
			public void setFlagConfirm(String flagConfirm) {
				this.flagConfirm = flagConfirm;
			}
			public Receive getRefReceiveTx() {
				return refReceiveTx;
			}
			public void setRefReceiveTx(Receive refReceiveTx) {
				this.refReceiveTx = refReceiveTx;
			}
			public Receive getRefReceiveTxReturn() {
				return refReceiveTxReturn;
			}
			public void setRefReceiveTxReturn(Receive refReceiveTxReturn) {
				this.refReceiveTxReturn = refReceiveTxReturn;
			}
			public Quotation getRefQuotationTx() {
				return refQuotationTx;
			}
			public void setRefQuotationTx(Quotation refQuotationTx) {
				this.refQuotationTx = refQuotationTx;
			}
			public String getMemberInfo() {
				return memberInfo;
			}
			public void setMemberInfo(String memberInfo) {
				this.memberInfo = memberInfo;
			}
			public String getRemark() {
				return remark;
			}
			public void setRemark(String remark) {
				this.remark = remark;
			}
			public String getFlagCancel() {
				return flagCancel;
			}
			public void setFlagCancel(String flagCancel) {
				this.flagCancel = flagCancel;
			}
			public Double getTotalAmount() {
				return totalAmount;
			}
			public void setTotalAmount(Double totalAmount) {
				this.totalAmount = totalAmount;
			}
			public String getFlagInvoice() {
				return flagInvoice;
			}
			public void setFlagInvoice(String flagInvoice) {
				this.flagInvoice = flagInvoice;
			}
			public Double getVatRate() {
				return vatRate;
			}
			public void setVatRate(Double vatRate) {
				this.vatRate = vatRate;
			}
			public Double getVat() {
				return vat;
			}
			public void setVat(Double vat) {
				this.vat = vat;
			}
			public Double getTravellingExpense() {
				return travellingExpense;
			}
			public void setTravellingExpense(Double travellingExpense) {
				this.travellingExpense = travellingExpense;
			}
			public Double getAccoummodationExpense() {
				return accoummodationExpense;
			}
			public void setAccoummodationExpense(Double accoummodationExpense) {
				this.accoummodationExpense = accoummodationExpense;
			}
			public Double getOtherExpense() {
				return otherExpense;
			}
			public void setOtherExpense(Double otherExpense) {
				this.otherExpense = otherExpense;
			}
			public Double getTotalPrice() {
				return totalPrice;
			}
			public void setTotalPrice(Double totalPrice) {
				this.totalPrice = totalPrice;
			}
			public Set<TraineeItem> getItems() {
				return items;
			}
			public void setItems(Set<TraineeItem> items) {
				this.items = items;
			}
			public boolean getSelected() {
				return selected;
			}
			public void setSelected(boolean selected) {
				this.selected = selected;
			}
}
