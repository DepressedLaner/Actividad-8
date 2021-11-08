package Actividad10;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Arrays que contienen los valores asignables al ArrayList "Deck"
        
        Scanner Line = new Scanner(System.in);
        
        DeckClase testDeck = new DeckClase();
        
        boolean isPlaying = true;
        char choice = 'x';
        
        // Ciclo principal
        
        while(isPlaying){
            
            /* 
            
            El ArrayList comienza en secuencia por defecto, por lo que 
            necesitamos barajearlo al principio antes que el juego empiece.
            
            */
            
            testDeck.StartShuffle();
            
            choice = JOptionPane.showInputDialog(
                    "Opciones: \n"
                    + "a) Shuffle   b) Draw First\n"
                    + "c) Random    d) Draw Five\n"
                    + "e) Exit\n"
                    + "Cartas en el Deck: " + testDeck.getSize()).charAt(0);
                
            
            switch(choice){
                
                case'a':
                    testDeck.Shuffle();
                    break;
                case'b':
                    testDeck.HeadCard();
                    break;
                case'c':
                    testDeck.PickRandom();
                    break;
                case'd':  
                    testDeck.HandCard();
                    break;
                case'e':
                    isPlaying = false;
                    JOptionPane.showMessageDialog(null, "¡Gracias por jugar!");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opción no reconocida.");
                    throw new Exception("RECUERDE: Las letras tienen que estar en minusculas");
            } 
            



            if(testDeck.getSize() == 0){
                
                isPlaying = false;
                
                JOptionPane.showMessageDialog(null, "El Deck está vacío. \n" + 
                "¡Gracias por jugar!");
                
            }
            
        }

    }
}
