import java.util.Scanner;
public class exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String codeSecret = "1234";
        String codeSaisi;

        System.out.print("Entrez le code secret : ");
        codeSaisi = sc.nextLine();

        while (!codeSaisi.equals(codeSecret)) {
            System.out.println("Code incorrect, réessayez !");
            System.out.print("Entrez le code secret : ");
            codeSaisi = sc.nextLine();
        }

        System.out.println("Accès autorisé. Bienvenue !");

        sc.close();
    }

}
