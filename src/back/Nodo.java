package back;

public class Nodo {
    int noNodo = 1;
    int fe; //(factor equilibrio)
    String personaje, caracteristica, info;
    Nodo izq, der;

    public Nodo(int n, String p, String c){
        this.noNodo = n;
        this.personaje = p;
        this.caracteristica = c;
        this.fe = 0;
        this.izq = null;
        this.der = null;
    }
    
    public String getPersonaje(){
        return personaje;
    }
    
    public void setPersonaje(String p){
        this.personaje = p;
    }
    
    public String getCaracteristica(){
        return caracteristica;
    }
    
    public void setCaracteristica(String c){
        this.caracteristica = c;
    }
    
    public String toString(){
        return info +"(" +noNodo +"," +personaje +"," +caracteristica +")";
    }

}
