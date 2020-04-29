/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Client {
    private String name;
    private int ID;
    private double balance;

    public Client(String name, int ID, double balance) {
        this.name = name;
        this.ID = ID;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
}
