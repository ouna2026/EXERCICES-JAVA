import java.util.ArrayList;
import java.util.Scanner;
public class exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> invites = new ArrayList<>();
        invites.add("Alice");
        invites.add("Bob");
        invites.add("Charlie");
        System.out.println("Liste initiale : " + invites);

        System.out.print("Quel prénom voulez-vous supprimer ? ");
        String prenom = sc.nextLine();

        if (invites.contains(prenom)) {
            invites.remove(prenom);
            System.out.println("Invité supprimé avec succès.");
        } else {
            System.out.println("Erreur : ce prénom n'est pas dans la liste.");
        }

        System.out.println("Liste finale des invités : " + invites);

        sc.close();
    }
}
