package com.company.pointofsale;

public class IceCream {
    private String flavor;
    private double price;
    private int quantity;

    private static int unitsSold = 0;

    private static double revenue = 0d;

    //1. returns the total revenue if all units are sold
    public double revenue(){
        return price*quantity;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    //2. increase the total units of ice cream sold and add revenue
    public void makeASale(int sell){
        System.out.println("selling "+sell+" units of ice cream");
        unitsSold+=sell;
        revenue+= price*sell;
        quantity= quantity-sell;
        placeRestockOrder(50-quantity);
    }

    //3. method that will restock ice cream
    public void restock(int units){
        System.out.println("Restocking ice cream: "+units+" added to quantity");
        this.quantity+=units;
    }

    // this will place a restocking order to the factory when quantity reaches 25 or below.
    public void placeRestockOrder(int units){
        if(quantity<=25) {
            System.out.println("Oh no! quantity of: "+flavor+" has fallen below 25");
            System.out.println("current quantity is: "+quantity);
            System.out.println("placing order for " + flavor+ " : "+units+" units");
            System.out.println("order will arrive tomorrow 6am");
        }
    }

    public static double getRevenue() {
        return revenue;
    }

    public static void setUnitsSold(int unitsSold) {
        IceCream.unitsSold = unitsSold;
    }

    public static void setRevenue(double revenue) {
        IceCream.revenue = revenue;
    }

    public static int getUnitsSold(){
        return unitsSold;
    }

    public IceCream() {
    }

    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
