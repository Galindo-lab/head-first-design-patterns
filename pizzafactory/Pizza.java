/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzafactory;

import java.util.ArrayList;



/**
 *
 * @author galindo
 */
public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;
    ArrayList<String> toppings = new ArrayList<String>();
    

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ")
                .append(this.name)
                .append(" ----\n");

        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }

}
