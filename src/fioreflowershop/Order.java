/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fioreflowershop;

/**
 *
 * @author User
 */
public class Order {
    private String orderID;
    private String orderDesc;
    private String orderDate;
    private String orderStatus;
    private Customer customer;
    private CorporateCustomer corporateCustomer;
    private Payment payment;
    private Staff staff;
    String orderCustType; // Customer / Corporate

    public Order() {
    }

    public CorporateCustomer getCorporateCustomer() {
        return corporateCustomer;
    }

    public void setCorporateCustomer(CorporateCustomer corporateCustomer) {
        this.corporateCustomer = corporateCustomer;
    }

    public Order(String orderID, String orderDesc, String orderDate, String orderStatus, CorporateCustomer corporateCustomer, Payment payment, Staff staff, String orderCustType) {
        this.orderID = orderID;
        this.orderDesc = orderDesc;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.corporateCustomer = corporateCustomer;
        this.payment = payment;
        this.staff = staff;
        this.orderCustType = orderCustType;
    }

    public Order(String orderID, String orderDesc, String orderDate, String orderStatus, Customer customer, Payment payment, Staff staff, String orderCustType) {
        this.orderID = orderID;
        this.orderDesc = orderDesc;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.customer = customer;
        this.payment = payment;
        this.staff = staff;
        this.orderCustType = orderCustType;
    }

    public String getOrderType() {
        return orderCustType;
    }

    public void setOrderType(String orderCustType) {
        this.orderCustType = orderCustType;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", orderDesc=" + orderDesc + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", customer=" + customer + ", payment=" + payment + ", staff=" + staff + '}';
    }
}
