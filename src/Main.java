import java.util.Scanner;

public class Main {
    static double nfak(int n) {
            double r=1;
            for (int i=2; i <=n; i++)
                r = r*i;
            return r;
    }

    public static void main(String[] args) {
        // Beräkna binomialkoefficienten för n och k som läses in från användaren

        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in n: ");
        int n = input.nextInt();
        System.out.print("Skriv in k: ");
        int k = input.nextInt();

        System.out.println("Binomialkoefficienten är " + bin(n, k));
    }
}