package entities.es_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Secondo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rndm = new Random();
        List<Integer> nCasuali = new ArrayList<>();

        System.out.println("INSERISCI UN NUMERO, VERRANNO GENERATI N NUMERI CASUALI DA ZERO A 100");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int nRandom = rndm.nextInt(0, 101);
            nCasuali.add(nRandom);
        }

        System.out.println(" NUMERI CASUALI GENERATI: ");
        for (int numero : nCasuali) {
            System.out.println(numero);
        }

        List<Integer> specchio = new ArrayList<>();

        for (int i = nCasuali.size() - 1; i >= 0; i--) {
            specchio.add(nCasuali.get(i));
        }

        System.out.println("LISTA + LISTA AL CONTRARIO: ");
        for (int i = 0; i < nCasuali.size(); i++) {
            System.out.print(nCasuali.get(i) + " ");
        }
        for (int element : specchio) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("INSERISCI VERO SE VUOI STAMPARE I NUMERI PARI O FALSO PER QUELLI DISPARI: ");
        boolean pOd = Boolean.parseBoolean(sc.nextLine());
        listBoolean(nCasuali, pOd);

        sc.close();
    }

    public static void listBoolean(List<Integer> nCasuali, boolean go) {
        for (int numero : nCasuali) {
            if (go && numero % 2 == 0) {
                System.out.print("NUMERO PARI " + numero + " ");
            } else if (!go && numero % 2 != 0) {
                System.out.print("NUMERO DISPARI " + numero + " ");
            }
        }
    }
}
