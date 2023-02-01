package com.mycompany.palindromo;

import java.util.Scanner;

/**
 *
 * @author willg
 */
public class Palindromo {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String word = sn.nextLine();
        String Nword = (word.toLowerCase()).replace(" ", "");
        System.out.println("Nword = " + Nword);
        boolean isP = false;
        char[] letras = Nword.toCharArray();
        int indice = 0;
        for (int i = letras.length - 1; i >= 0; i--){
            if (String.valueOf(letras[indice]).compareTo(String.valueOf(letras[i])) == 0){
                isP = true;
                indice++;
            }else {
                isP = false;
                break;
            }
        }

        if (isP){
            System.out.println("La palabra o frase ingresa es palindroma");
        }else {
            System.out.println("La palabra o frase ingresada no es palindorma");
        }
    }
}

