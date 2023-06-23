/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beveragetestdrive;

/**
 *
 * @author galindo
 */
public class BeverageTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TeaWithHook teaHook = new TeaWithHook();
        CoffeWithHook coffeHook = new CoffeWithHook();
        
        System.out.println("\nHaciendo té...");
        teaHook.prepareRecipe();
        
        System.out.println("\nHaciendo caffe...");
        coffeHook.prepareRecipe();
        
    }
    
}
