package com.company;


public class App {
    public static void main(String[] args) {
        com.company.factory.IceCream factory = new com.company.factory.IceCream("chocolate",2,1.5d,"1hr","cream,chocolate",5d);

        factory.loadTruck(50);
        factory.makeIceCream(50);

        System.out.println("Units in storage: "+com.company.factory.IceCream.getUnitsStored());
        System.out.println("Units sold: "+com.company.factory.IceCream.getUnitsSold());

        System.out.println("Total cost: "+factory.calculateCost());
        System.out.println("Total Revenue: "+factory.calculateRevenue());

        System.out.println(factory);

        System.out.println("------------------------");

        com.company.pointofsale.IceCream pointOfSale = new com.company.pointofsale.IceCream("chocolate",2.2,50);

        System.out.println("Total revenue: "+com.company.pointofsale.IceCream.getRevenue());
        pointOfSale.makeASale(25);
        System.out.println("Total units sold: "+com.company.pointofsale.IceCream.getUnitsSold());
        System.out.println("Total revenue generated:"+com.company.pointofsale.IceCream.getRevenue());

        pointOfSale.restock(25);
        System.out.println("Total after restocking: "+pointOfSale.getQuantity());
        pointOfSale.makeASale(5);
        System.out.println("sold: "+com.company.pointofsale.IceCream.getUnitsSold()+" Revenue: "+ com.company.pointofsale.IceCream.getRevenue());

        System.out.println(pointOfSale);
    }
}
