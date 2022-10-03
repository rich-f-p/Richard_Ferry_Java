package com.company.factory;

public class IceCream {
    private String flavor;
    private int sizeOz;
    private double productionCost;
    private String productionTime;
    private String ingredients;
    private double salePrice;
    private static int unitsSold = 0;
    private static int unitsStored = 0;

    public IceCream() {
    }
    //1. increases the amount of units sold total
    public void loadTruck(int units) {
        unitsSold += units;
        unitsStored-= units;
    }
    //2. increases the amount of units stored
    public void makeIceCream(int units) {
        unitsStored += units;
    }
    //3. returns total revenue minus cost of units sold
    public double calculateRevenue() {
        return (salePrice * unitsSold) - (productionCost * unitsSold);
    }

    public double calculateCost(){
        return productionCost *unitsStored;
    }

    public static int getUnitsSold(){
        return unitsSold;
    }

    public static int getUnitsStored(){
        return unitsStored;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public IceCream(String flavor, int sizeOz, double productionCost, String productionTime, String ingredients, double salePrice) {
        this.flavor = flavor;
        this.sizeOz = sizeOz;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
        this.salePrice = salePrice;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", sizeOz=" + sizeOz +
                ", productionCost=" + productionCost +
                ", productionTime='" + productionTime + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", salePrice=" + salePrice +
                '}';
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getSizeOz() {
        return sizeOz;
    }

    public void setSizeOz(int sizeOz) {
        this.sizeOz = sizeOz;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

}
