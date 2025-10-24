package array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "AL";
        estados[2] = "AP";
        estados[3] = "AM";
        estados[4] = "BA";
        estados[5] = "CE";
        estados[6] = "DF";
        estados[7] = "ES";
        estados[8] = "GO";
        estados[9] = "MA";

        System.out.print("Escolha em Estado: ");
        String escolha = sc.nextLine();

        boolean isAchou = false;
        int ip = 0;

        for (int i = 0; i < estados.length; i++) {
            if (estados[i].equalsIgnoreCase(escolha)) {
                isAchou = true;
                ip = i;
                break;
            }

        }

        if (isAchou) {
            System.out.println("Esse Estado existe no vetor na posição " + ip);
        } else {
            System.out.println("Esse Estado não existe no vetor");
        }

        sc.close();

    }
}
