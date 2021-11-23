package com.dflex;

public class OrderEntity {
	private String order_no;
	private String eretailOrderNo;
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getEretailOrderNo() {
		return eretailOrderNo;
	}
	public void setEretailOrderNo(String eretailOrderNo) {
		this.eretailOrderNo = eretailOrderNo;
	}
	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderEntity(String order_no, String eretailOrderNo) {
		super();
		this.order_no = order_no;
		this.eretailOrderNo = eretailOrderNo;
	}
	@Override
	public String toString() {
		return "OrderEntity [order_no=" + order_no + ", eretailOrderNo=" + eretailOrderNo + "]";
	}
	
	
	
}
