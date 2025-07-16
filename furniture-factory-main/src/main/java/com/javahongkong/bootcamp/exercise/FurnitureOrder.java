package com.javahongkong.bootcamp.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FurnitureOrder implements FurnitureOrderInterface {

    public static int counter = 0;
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    private HashMap<Furniture, Integer> ordersOfFurnitures;
    private int id;


    private List<Furniture> furnitures;




    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        counter++;
        this.id = counter;
        this.furnitures = new ArrayList<>();
        this.ordersOfFurnitures = new HashMap<>();

    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        for(int i=0;i<furnitureCount;i++){
            this.furnitures.add(type);
        }
        if(this.ordersOfFurnitures.get(type) == null){
            this.ordersOfFurnitures.put(type,furnitureCount);
        }else{
        this.ordersOfFurnitures.put(type,this.ordersOfFurnitures.get(type)+furnitureCount);
        }
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
      float totalCost = 0;
      for(int i=0;i<this.furnitures.size();i++){
      totalCost += this.furnitures.get(i).cost();
      }
        return totalCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method

    int totalCount= 0;
      for(int i=0;i<this.furnitures.size();i++){
        if(this.furnitures.get(i).equals(type)){
            totalCount++;
        }  
    }
     return totalCount;


    }


    public float getTypeCost(Furniture type) {
        // TODO: Complete the method

            float totalCost = 0;
      for(int i=0;i<this.furnitures.size();i++){
        if(this.furnitures.get(i).equals(type)){
            totalCost += type.cost();
        }  
    }
     return totalCost;
      
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return this.furnitures.size();
    }

        public int getId() {
        return id;
    }

        public List<Furniture> getFurnitures() {
        return furnitures;
    }

    public static void main(String[] args) {
        FurnitureOrder fo1 = new FurnitureOrder();

        fo1.addToOrder(Furniture.TABLE, 2);
        fo1.addToOrder(Furniture.TABLE, 2);
        fo1.addToOrder(Furniture.CHAIR, 1);
        fo1.addToOrder(Furniture.COUCH, 1);

        System.out.println(fo1.getFurnitures());
        System.out.println(fo1.getOrderedFurniture().get(Furniture.TABLE));

        System.out.println(fo1.getTotalOrderCost());

        HashMap<Furniture, Integer> orderedFurniture = fo1.getOrderedFurniture();
        System.out.println(orderedFurniture.values().stream().mapToInt(n-> n).sum());
        System.out.println(orderedFurniture.values().stream().collect(Collectors.mapping(n -> n,Collectors.toList())));
        System.out.println(orderedFurniture.values().stream().collect(Collectors.summingInt(n->n)));

      double num1 = fo1.getFurnitures().stream().
        collect(Collectors.summingDouble(n -> n.cost()));

        System.out.println(num1);

        // System.out.println(fo1.getTypeCost(Furniture.TABLE));
        // System.out.println(fo1.getTypeCount(Furniture.TABLE));
        // System.out.println(fo1.getTotalOrderQuantity());

        // System.out.println(Furniture.CHAIR.cost());
        
    }
}