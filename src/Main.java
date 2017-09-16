public class Main {

    public static void main(String[] args) {
        System.out.println("Opgave 1.1:");
        System.out.println("Welcome to Java.");
        System.out.println("Learning Java Now.");
        System.out.println("Programming is Fun.");
        System.out.println("---");

        System.out.println("Opgave 1.2:");
        int i = 1;
        while(i<=5){
            System.out.println(i+" : I love Java.");
            i++;
        }
        System.out.println("---");

        System.out.println("Opgave 1.4:");
        System.out.println("a   a^2   a^3   a^4");
        System.out.println("1   1     1     1");
        System.out.println("2   4     8     16");
        System.out.println("3   9     27    81");
        System.out.println("4   16    64    256");
        System.out.println("---");

        System.out.println("Opgave 1.5:");
        double resultat;
        resultat = (7.5 * 6.5 - 4.5 * 3)/(47.5-5.5);
        System.out.println("Resultatet er :"+ resultat);
        System.out.println("---");

        System.out.println("Opgave 1.6:");
        int k=1;
        int resultatTo = 0;
        while (k<=10){
            resultatTo = resultatTo + k;
            k++;
        }
        System.out.println("Resultat : " + resultatTo);
        System.out.println("---");

    }
}
