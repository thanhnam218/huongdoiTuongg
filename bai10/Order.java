package bai10;

import java.time.LocalDate;

public class Order {

	private int orderID;
	private OrderDetail lineItems;
	private LocalDate orderDate;
	private int count;
	
	public Order() {}
	public Order(int orderID, LocalDate orderDate, int count) {
		this.orderID=orderID;
		this.orderDate=orderDate;
		this.count=count;
	}
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public OrderDetail getLineItems() {
		return lineItems;
	}
	public void setLineItems(OrderDetail lineItems) {
		this.lineItems = lineItems;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
