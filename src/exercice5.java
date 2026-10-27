import java.util.ArrayList;
import java.util.Scanner;
public class exercice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Entrez l'article " + i + " : ");
            String article = sc.nextLine();
            courses.add(article);
        }
        System.out.println("\nMa liste de courses :");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i));
        }
        System.out.println("Nombre total d'articles : "
                + courses.size());
        sc.close();
    }
}
