package DiscountSystem;

import java.util.Date;

public class Visit {

    private Customer customer;
    private Date date;
    private double servicesExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServicesExpense() {
        return servicesExpense;
    }

    public void setServicesExpense(double servicesExpense) {
        this.servicesExpense = servicesExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return this.getProductExpense() + this.getServicesExpense();
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", servicesExpense=" + servicesExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
