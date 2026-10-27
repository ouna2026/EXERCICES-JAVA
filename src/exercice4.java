public class exercice4 {
    public static void main(String[] args) {
        int[] notes = {12, 8, 15, 19, 10, 7, 14, 16};
        int somme = 0;
        int min = notes[0];
        int max = notes[0];
        int admis = 0;
        System.out.println("Liste des notes :");
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
            somme += notes[i];
            if (notes[i] < min) {
                min = notes[i];
            }
            if (notes[i] > max) {
                max = notes[i];
            }
            if (notes[i] >= 10) {
                admis++;
            }
        }
        double moyenne = (double) somme / notes.length;
        System.out.println("Somme : " + somme);
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Note minimale : " + min);
        System.out.println("Note maximale : " + max);
        System.out.println("Nombre de notes >= 10 : " + admis);
    }
}
