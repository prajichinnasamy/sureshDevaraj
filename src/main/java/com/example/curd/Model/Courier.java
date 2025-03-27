package com.example.curd.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;


@Getter
@Setter
@Table(name = "CourierMst1")
@Entity



public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date orderDate;
    private String customerName;
    private String address;
    private String deliveryLocation;
    private String whatsapp;
    private String contact;
    private String payment;
    private String items;
    private String vendor;
    private String supplier;
    private String parcelService;
    private String bookingStatus;
    private String deliveryStatus;
    private Date bookedDate;
    private String lrNumber;
    private String paymentStatus;

    // Default Constructor
    public Courier() {}

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getDeliveryLocation() { return deliveryLocation; }
    public void setDeliveryLocation(String deliveryLocation) { this.deliveryLocation = deliveryLocation; }

    public String getWhatsapp() { return whatsapp; }
    public void setWhatsapp(String whatsapp) { this.whatsapp = whatsapp; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getPayment() { return payment; }
    public void setPayment(String payment) { this.payment = payment; }

    public String getItems() { return items; }
    public void setItems(String items) { this.items = items; }

    public String getVendor() { return vendor; }
    public void setVendor(String vendor) { this.vendor = vendor; }

    public String getSupplier() { return supplier; }
    public void setSupplier(String supplier) { this.supplier = supplier; }

    public String getParcelService() { return parcelService; }
    public void setParcelService(String parcelService) { this.parcelService = parcelService; }

    public String getBookingStatus() { return bookingStatus; }
    public void setBookingStatus(String bookingStatus) { this.bookingStatus = bookingStatus; }

    public String getDeliveryStatus() { return deliveryStatus; }
    public void setDeliveryStatus(String deliveryStatus) { this.deliveryStatus = deliveryStatus; }

    public Date getBookedDate() { return bookedDate; }
    public void setBookedDate(Date bookedDate) { this.bookedDate = bookedDate; }

    public String getLrNumber() { return lrNumber; }
    public void setLrNumber(String lrNumber) { this.lrNumber = lrNumber; }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }
}


