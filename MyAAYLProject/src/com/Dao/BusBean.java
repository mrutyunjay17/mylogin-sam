package com.Dao;

public class BusBean {
String busno;
String bustype;
String depart_time;
float price;
int seatstot;
int seatsav;
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
public String getDepart_time() {
	return depart_time;
}
public void setDepart_time(String depart_time) {
	this.depart_time = depart_time;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getSeatstot() {
	return seatstot;
}
public void setSeatstot(int seatstot) {
	this.seatstot = seatstot;
}
public int getSeatsav() {
	return seatsav;
}
public void setSeatsav(int seatsav) {
	this.seatsav = seatsav;
}
@Override
public String toString() {
	return "BusBean [busno=" + busno + ", bustype=" + bustype + ", depart_time=" + depart_time + ", price=" + price
			+ ", seatstot=" + seatstot + ", seatsav=" + seatsav + "]";
}


}
