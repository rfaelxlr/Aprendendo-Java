/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;

import java.util.Scanner;

/**
 *
 * @author rafa_
 */
public class teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        System.out.println("Digite um numero");
        day = input.nextInt();
        switch(day){
            case 1:
                System.out.println("Olá");
                break;
            case 2:
                System.out.println("Nunca");
                break;
        }
        
    }
}
