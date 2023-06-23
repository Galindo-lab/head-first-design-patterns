/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzafactory;

/**
 *
 * @author galindo
 */
public class PizzaFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        
        Pizza p1 = nyStore.orderPizza("veggie");
        System.out.println(p1.getName());
        
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza p2 = nyStore.orderPizza("veggie");
        System.out.println(p2.getName());
    }
    
}
