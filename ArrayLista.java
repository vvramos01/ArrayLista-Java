import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o "+(i+1)+"° nome ");
            nomes[i] = sc.nextLine().trim();
        }
        for (int i = nomes.length; i > 0; i--) {
            System.out.println(nomes[i-1]);
        }
        System.out.println("-------------------");
        for (String n : nomes) {
            System.out.println(" - " + n);
        }
    }
}
