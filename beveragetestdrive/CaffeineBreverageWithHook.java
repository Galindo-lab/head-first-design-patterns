/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beveragetestdrive;

/**
 *
 * @author galindo
 */
abstract class CaffeineBreverageWithHook {
    
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    
    abstract void addCondiments();
    
    void boilWater() {
        System.out.println("hirviendo agua...");
    }

    void pourInCup() {
        System.out.println("Poniendolo en un vaso");
    }

    boolean customerWantsCondiments() {
        return true;
    }

    
}
