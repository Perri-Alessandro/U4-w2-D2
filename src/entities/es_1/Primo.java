package entities.es_1;
import java.util.*;


public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> parole = new HashSet<>();
        List<String> doppie = new ArrayList<>();
        System.out.println("QUANTE PAROLE VUOI INSERIRE? ");
        int quante = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < quante; i++) {
            System.out.println("INSERISCI PAROLA " + (i+1) + " :");
            String parola = sc.nextLine();
            boolean aggiunte = parole.add(parola);
            if(!aggiunte) {
                System.out.println(parola + " è GIà PRESENTE NELL'ELENCO");
                doppie.add(parola);
            }
        }

        System.out.println("NUMERI DI PAROLE INSERITE :" + parole.size());
        System.out.println("TUTTE LE PAROLE INSERITE: " + parole);
        System.out.println("PAROLE INSERITE DUE VOLTE: " + doppie);

        sc.close();
    }
}