package br.com.victor.ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        System.out.println("******* Digite nome separados por virgula e genero (M/F) separado por ',': *******");

        Scanner s = new Scanner(System.in);

        String res = s.next();

        String[] names = res.split(",");
        String[] masc = new String[names.length];
        String[] femn = new String[names.length];

        int i;

        for (i = 1; i < names.length; i = i + 2) {
            if (names[i].toUpperCase().equals("M")) {
                if (i - 1 == 0) {
                    masc[0] = names[i - 1];
                } else {
                    masc[i - 2] = names[i - 1];
                }
            }
            if (names[i].toUpperCase().equals("F")) {
                if (i - 1 == 0) {
                    femn[0] = names[i - 1];
                } else {
                    femn[i - 2] = names[i - 1];
                }
            }
        }

        System.out.println("Masculino: " + Arrays.toString(Arrays.stream(masc)
                .filter(n -> (n != null && n.length() > 0)).toArray(String[]::new)));
        System.out.println("Feminino: " + Arrays.toString(Arrays.stream(femn)
                .filter(n -> (n != null && n.length() > 0)).toArray(String[]::new)));

    }

}
