package primeiroPrograma;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ipt_nome = new Scanner(System.in);

        boolean nomeLindo = false;
        System.out.print("Qual o seu nome? ");
        String nome = ipt_nome.nextLine();
        System.out.println("Calculando...");

        String[] nomesLindos = {"YUZO", "BOLONHO", "FELIX", "FÉLIX"};

        for (int i = 0; i < nomesLindos.length; i++){
            if (nome.toUpperCase().equals(nomesLindos[i])){
                nomeLindo = true;
            }
        }

        if (nomeLindo){
            System.out.print("Qual seu numero favorito? ");
            Scanner input2 = new Scanner(System.in);
            int range = input2.nextInt();
            System.out.println(range);

            for (int i = 0; i < range; i++){
                System.out.println(nome + " lindo demais");
            }

        } else {
            System.out.println(nome);
            System.out.println("Feio");
        }
    }
}