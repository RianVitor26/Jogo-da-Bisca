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
 
    public void setValor() {
        this.valor = valor;
    }
    
    private int calcula_valor() {
        int result;
        switch (this._face) {
            case "Q":
                result = 2;
                break;
            case "J":
                result = 3;
                break;
            case "K":
                result = 4;
                break;
            case "7":
                result = 10;
                break;
            case "A":
                result = 11;
                break;
            default:
                result = 0;
                break;
        }
        return result;

    }
}