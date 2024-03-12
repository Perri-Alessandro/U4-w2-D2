package entities.es_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Terzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Long> rubricaMap = new HashMap<>();

        System.out.println("RUBRICA");

        int scelta;
        do {
            System.out.println("SCEGLI UN OPZIONE:");
            System.out.println("1. AGGIUNGI COPPIA NOME-TELEFONO");
            System.out.println("2. RIMUOVI COPPIA NOME-TELEFONO");
            System.out.println("3. ESCI");
            scelta = Integer.parseInt(sc.nextLine());

            switch (scelta) {
                case 1:
                    System.out.println("INSERISCI IL NOME (lascia vuoto per terminare): ");
                    String nome = sc.nextLine();
                    if (!nome.isEmpty()) {
                        System.out.println("ORA INSERISCI IL NUMERO DI TELEFONO:");
                        long numero = Long.parseLong(sc.nextLine());
                        rubricaMap.put(nome, numero);
                        System.out.println("AGGIUNTO: " + nome + " - " + numero);
                    }
                    System.out.println("RUBRICA AGGIORNATA: " + rubricaMap);
                    break;
                case 2:
                    System.out.println("INSERISCI IL NOME DA RIMUOVERE: ");
                    String nomeDaRimuovere = sc.nextLine();
                    if (rubricaMap.containsKey(nomeDaRimuovere)) {
                        rubricaMap.remove(nomeDaRimuovere);
                        System.out.println("RIMOSSO: " + nomeDaRimuovere);
                    } else {
                        System.out.println("NOME NON TROVATO IN RUBRICA.");
                    }
                    System.out.println("RUBRICA AGGIORNATA: " + rubricaMap);
                    break;
                case 3:
                    System.out.println("USCITA IN CORSO ...");
                    break;
                default:
                    System.out.println("OPZIONE NON VALIDA, RIPROVA");
                    break;
            }

        } while (scelta != 3);


        sc.close();
    }
}
