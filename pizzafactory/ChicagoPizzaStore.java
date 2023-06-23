/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzafactory;

/**
 *
 * @author galindo
 */
public class ChicagoPizzaStore extends PizzaStore {

        @Override
	protected Pizza createPizza(String item) {
            switch (item) {
                case "cheese":
                    return new ChicagoStyleCheesePizza();
                case "veggie":
                    return new ChicagoStyleVeggiePizza();
                case "clam":
                    return new ChicagoStyleClamPizza();
                case "pepperoni":
                    return new ChicagoStylePepperoniPizza();
                default:
                    return null;
            }
	}
}