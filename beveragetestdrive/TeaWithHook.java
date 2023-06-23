/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beveragetestdrive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author galindo
 */
class TeaWithHook extends CaffeineBreverageWithHook {

    @Override
    void brew() {
        System.out.println("agregando el té");
    }

    @Override
    void addCondiments() {
        System.out.println("Agregando limon");
    }
    
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }
    

    private String getUserInput() {
        String answer = null;

        System.out.print("quiere limon en el té? (y:n):  ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println(ioe.toString());
        }
        if (answer == null) {
            return "no";
        }
        return answer;

    }
    
}
