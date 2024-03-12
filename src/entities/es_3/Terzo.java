package entities.es_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Terzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Long> rubricaMap = new HashMap<>();

        System.out.println("RUBRICA");

        String nome;
        do {
            System.out.println("INSERISCI UNA COPPIA NOME-TELEFONO. INIZIA INSERENDO IL NOME (lascia vuoto per terminare):");
            nome = sc.nextLine();

            if (!nome.isEmpty()) {
                System.out.println("ORA INSERISCI IL NUMERO DI TELEFONO :");
                long numero = Long.parseLong(sc.nextLine());

                rubricaMap.put(nome, numero);

                System.out.println("AGGIUNTO: " + nome + " - " + numero);
            }

        } while (!nome.isEmpty());

        System.out.println("RUBRICA AGGIORNATA: " + rubricaMap);


        sc.close();
    }
}
