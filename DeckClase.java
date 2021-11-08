package Actividad10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

public class DeckClase {

    private final String[] ValoresPalo = {"Corazón", "Diamante", "Treból",
    "Pica"};
    private final String[] ValoresColor = {"Rojo", "Negro"};
    private final String[] ValoresCarta = {"2", "3", "4", "5", "6", "7", "8",
    "9", "10", "A", "J", "Q", "K"};
        
        
    // Se instancia el Deck<>
        
    private ArrayList<CardClase> Deck;
        
    public DeckClase(){
            
        Deck = new ArrayList<CardClase>();
            
        // Construcción de cartas por color
            
        for(int i = 0; i < 2; i++){
            
            for(int a = 0; a < ValoresCarta.length; a++){
                
                Deck.add(new CardClase(ValoresPalo[i], ValoresColor[0],
                ValoresCarta[a]));  
            } 
        }
        for(int i = 2; i < 4; i++){
            
            for(int a = 0; a < ValoresCarta.length; a++){
                
                Deck.add(new CardClase(ValoresPalo[i], ValoresColor[1],
                ValoresCarta[a]));  
            } 
        }   
    }
    
    // Size getter
    
    public int getSize(){
        
        return Deck.size();
    }
    
    // Array Getter
    
    public ArrayList<CardClase> getDeck(){
        
        return Deck;
    }
    
    // Métodos de muestra
    
    public void StartShuffle(){

        Collections.shuffle(Deck);
    }
    public void Shuffle()throws Exception{
        
        try{
            
            Collections.shuffle(Deck);
        
            JOptionPane.showMessageDialog(null, "Se ha mezclado el Deck.");
        
            System.out.println("Deck mezclado.");
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No quedan suficientes cartas.");
            
        }
        
        
    }
    public void HeadCard()throws Exception{
        
        try{
            
            JOptionPane.showMessageDialog(null, Deck.get(0));
        
            Deck.remove(0);
        
            System.out.println("Quedan: " + Deck.size() + " cartas en el Deck.");
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No quedan cartas en el Deck.");
            
        }

    }
    public void PickRandom()throws Exception{
        
        try{
            
            Random n = new Random();
            int x = n.nextInt(Deck.size());
        
            JOptionPane.showMessageDialog(null, Deck.get(x));
        
            Deck.remove(x);
            System.out.println("Quedan: " + Deck.size() + " cartas en el Deck.");
            
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No quedan suficientes cartas.");
            
        }  
        
    }
    public void HandCard() throws Exception {
        
        try{
            
        JOptionPane.showMessageDialog(null, 
        Deck.get(0) + "\n" + 
        Deck.get(1) + "\n" +
        Deck.get(2) + "\n" +
        Deck.get(3) + "\n" +
        Deck.get(4));
        
        for(int x = 0; x <= 4; x++){
            
            Deck.remove(x);   
        }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,
            "No quedan suficientes cartas en el Deck.");
            
        }
        
        System.out.println("Quedan: " + Deck.size() + " cartas en el Deck.");
    }
    
}
