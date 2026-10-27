import java.util.Scanner;
public class exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = sc.nextInt();

        System.out.println("--- Table de " + nombre + " ---");

        for (int i = 1; i <= 10; i++) {
            int resultat = nombre * i;
            System.out.println(nombre + " x " + i + " = " + resultat);
        }

        sc.close();
    }
}
