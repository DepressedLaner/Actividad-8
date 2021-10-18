package Actividad8;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner Skan = new Scanner(System.in);
        Deck mazo = new Deck();
        int op;

        System.out.println("Deck de Cartas para Iniciar: " + mazo.getSize());




        for (Card elemento : mazo.getDeck()) {
            System.out.print(elemento + " / ");
        }
        System.out.println("\n Que desea hacer?  ");

        do{
        System.out.println("1)Mezlar las cartas 2)Mostrar sig carta 3)Carta aleatoria 4)Cinco Cartas 5)Terminar proceso");
        op = Skan.nextInt();

        switch(op){
        case 1:    
        System.out.println("\n");
        mazo.suflle();
        return;

        case 2:
        System.out.println("\n");
        mazo.head();
        return;

        case 3:
        System.out.println("\n");
        mazo.pick();
        return;



        case 4:
        System.out.println("\n");
        mazo.hand();
        return;
        

            }
        }while(op == 5);

    }
}
