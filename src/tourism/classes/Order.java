package tourism.classes;

import java.util.Date;

public class Order extends Entity {
    private Person customer;
    private Voucher voucher;
    private Transport transport;
    private NutritionType nutritionType;
    private Date startDate;
    private Date endDate;

    public Order() {
    }

    public Order(Person customer, Voucher voucher, Transport transport, NutritionType nutritionType, Date startDate, Date endDate) {
        this.customer = customer;
        this.voucher = voucher;
        this.transport = transport;
        this.nutritionType = nutritionType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public NutritionType getNutritionType() {
        return nutritionType;
    }

    public void setNutritionType(NutritionType nutritionType) {
        this.nutritionType = nutritionType;
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
}