package Actividad10;

public class CardClase {

   // Valores iniciales, se define el Objeto Card para usar en un ArrayList
    
    private String Palo;
    private String Color;
    private String Valor;
    
  
    public CardClase(String Palo, String Valor, String Color){
        
        this.Palo = Palo;
        this.Valor = Valor;
        this.Color = Color;    
    }
    
    // Getters
    
    public String getPalo(){
        
        return Palo;
    }
    public String getColor(){
        
        return Color;
    }
    public String getValor(){
        
        return Valor;
    }
    
    // Setters
    
    public void setPalo(String Palo){
        
        this.Palo = Palo;
    }
    public void setColor(String Color){
        
        this.Color = Color;
    }
    public void setValor(String Valor){
        
        this.Valor = Valor;
    }
    
    // String Converter
    
    /* 
    
    Estuve teniendo problemas al imprimir las cartas, ya que por defecto imprime
    la dirección de memoria en vez de los valores, en un foro de GitHub encontré
    esta función que sobreescribe el valor en getObject() para mostrar los
    valores en el formato en vez de:
    
    proyecto@proyecto.Card@1234567
    
    */
    public String toString(){
        
        return "[" + Palo + ", " + Color + ", " + Valor + "]";
    }

    
    
}
