package br.com.victor.ex01;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio01 {

    public static void main(String[] args) {

        System.out.println("************** Digite nome separados por virgula: **************");

        Scanner s = new Scanner(System.in);

        String res = s.next();

        String[] names = res.split(",");

        int i;
        int j;
        String aux = "";

        for (i = 0; i < names.length - 1; i++) {
            for ( j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    aux = names[i];
                    names[i] = names[j];
                    names [j] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(names));

    }

}
