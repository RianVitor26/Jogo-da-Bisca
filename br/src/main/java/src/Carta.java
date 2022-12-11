package src; 

public class Carta{
    private String nipe;
    private int valor;

 
    public Carta(String faces, String nipe, int valor){
        this.faces = faces;
        this.nipe = nipe;
        this.valor = valor;
 
    }
 
    public String toString(){
        return this.faces + this.nipe;
    }
    public String getFaces(){
        return this.faces;
    }

    public String getNipe(){
        return nipe;
    }
    public void setNipe(){
        this.nipe = nipe;
    }
 
    public int getValor(){
        return valor;
    }
 
    public void setValor(){
        this.valor = valor;
    }
}