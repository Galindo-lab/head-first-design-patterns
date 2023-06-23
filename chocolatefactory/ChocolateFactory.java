/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chocolatefactory;

/**
 *
 * @author galindo
 */
public class ChocolateFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        
        System.out.println("=== Chocolate Factory ===");
        System.out.println(chocolateBoiler1);
        System.out.println(chocolateBoiler2);
        
        System.out.println("Llenando...");
        chocolateBoiler1.fill();
        
        System.out.println("========= Hervir ========");
        System.out.println("Esta hirviendo?: " + chocolateBoiler1.isBoiled());
        chocolateBoiler2.boil(); // la operacion se hace desde el chocolateBoiler2
                                 // pero se refleja en el 1
        System.out.println("Esta hirviendo?: " + chocolateBoiler1.isBoiled());
    }
    
}
