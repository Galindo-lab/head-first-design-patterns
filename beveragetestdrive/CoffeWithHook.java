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
class CoffeWithHook extends CaffeineBreverageWithHook {

    @Override
    void brew() {
        System.out.println("Pasando el cafe por el filtro");
    }

    @Override
    void addCondiments() {
        System.out.println("Agregando azucar a la leche");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("quiere cafe con azucar? (y:n):  ");

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
