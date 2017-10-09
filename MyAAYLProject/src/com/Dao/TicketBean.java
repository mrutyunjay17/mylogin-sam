package com.Dao;

public class TicketBean {
	String bookingdate;
	String busno;
	String bustype;
	String dtime;
	int tno;
	float totalPrice;
	
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getBusno() {
		return busno;
	}
	public void setBusno(String busno) {
		this.busno = busno;
	}
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public String getDtime() {
		return dtime;
	}
	public void setDtime(String dtime) {
		this.dtime = dtime;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "TicketBean [bookingdate=" + bookingdate + ", busno=" + busno + ", bustype=" + bustype + ", dtime="
				+ dtime + ", tno=" + tno + ", totalPrice=" + totalPrice + "]";
	}
	
}
