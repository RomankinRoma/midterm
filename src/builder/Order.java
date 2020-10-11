package builder;

import MedCenter.MedCenter;

public class Order {
    Integer id;
    String address;
    String date;
    MedCenter medCenter;
    Boolean medicine;
    Boolean food;


    public Order(OrderBuilder orderBuilder) {
        this.id = orderBuilder.id;
        this.address = orderBuilder.address;
        this.date = orderBuilder.date;
        this.medCenter = orderBuilder.medCenter;
        this.medicine = orderBuilder.medicine;
        this.food = orderBuilder.food;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public MedCenter getMedCenter() {
        return medCenter;
    }

    public void setMedCenter(MedCenter medCenter) {
        this.medCenter = medCenter;
    }

    public Boolean getMedicine() {
        return medicine;
    }

    public void setMedicine(Boolean medicine) {
        this.medicine = medicine;
    }

    public Boolean getFood() {
        return food;
    }

    public void setFood(Boolean food) {
        this.food = food;
    }

    @Override
    public String toString() {
        if (food!=null || medicine!=null)
            return getId()+"."+getAddress()+" with addons";
        else
            return getId()+"."+getAddress()+" without addons";
    }
    public static class OrderBuilder {
        Integer id;
        String address;
        String date;
        MedCenter medCenter;
        Boolean medicine;
        Boolean food;

        public OrderBuilder(Integer id, String address, String date, MedCenter medCenter) {
            this.id = id;
            this.address = address;
            this.date = date;
            this.medCenter = medCenter;
        }

        public OrderBuilder withMedicine(Boolean medicine){
            this.medicine=medicine;
            return this;
        }

        public OrderBuilder withFood(Boolean food){
            this.food=food;
            return this;
        }

        public Order createOrder(){
            return new Order(this);
        }

    }
}
