import java.util.Scanner;
import java.util.Random;
public class exercice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int nbreS = rd.nextInt(100) + 1;
        int p = 0;
        int t = 0;

        System.out.println("Bienvenue dans le jeu du nombre mystère !");

        while (p != nbreS) {
            System.out.println("Devine le nombre (1 à 100) : ");
            p = sc.nextInt();
            t++;

            if (p < 1 || p > 100) {
                System.out.println("Attention, le nombre doit être entre 1 et 100 !");
            } else if (p < nbreS) {
                System.out.println("Plus grand !");
            } else if (p > nbreS) {
                System.out.println("Plus petit !");
            } else {
                System.out.println("Bravo ! Tu as Trouvé !");
                System.out.println("Nombre de tentatives : " + t);
            }
        }
        sc.close();
    }
}
