import java.util.*;

public class ArrayLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <String> nomes = new ArrayList<>();

        while(true){
            System.out.println("nome: ");
            String entrada = sc.nextLine().trim();
            if(entrada.equalsIgnoreCase("fim"))break;
            if (!entrada.isEmpty()){
                nomes.add(entrada);
            }
            }

        System.out.println(nomes);
        }

    }
