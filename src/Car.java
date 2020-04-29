/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Car {
    String brand;
    int year;
    
    Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    void setBrand(String brand){
        this.brand = brand;
    }
    String getBrand(){
        return this.brand;
    }
    void setYear(int year){
        this.year = year;
    }
    int getYear(){
        return this.year;
    }
    void printInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}