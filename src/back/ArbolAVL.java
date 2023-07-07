package back;

public class ArbolAVL {
    private Nodo raiz;
    public ArbolAVL(){
        raiz = null;
    }
    
    public Nodo detectarIzq(){
        Nodo aux = raiz;
        if (aux.izq != null) {
            aux = aux.izq;
            return aux;
        }
        return null;
    }
    
    public Nodo detectarDer(){
        Nodo aux = raiz;
        if (aux.der != null) {
            aux = aux.der;
            return aux;
        }
        return null;
    }
    
    public Nodo obtenerRaiz(){
        return raiz;
    }
    
    public Nodo buscar (int d){
        Nodo aux = raiz;
        while (aux.noNodo != d){
            if (d < aux.noNodo) {
                aux = aux.izq;
            } else {
                aux = aux.der;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }
    
    //Obtener el factor de equilibrio
    public int obtenerFE(Nodo x){
        if (x == null) {
            return -1;
        } else {
            return x.fe;
        }
    }
    
    //Rotacion simple Izquierda
    public Nodo rotacionIzq(Nodo c){
        Nodo aux = c.izq;
        c.izq = aux.der;
        aux.der = c;
        c.fe = Math.max(obtenerFE(c.izq), obtenerFE(c.der)) +1;
        aux.fe = Math.max(obtenerFE(aux.izq), obtenerFE(aux.der)) +1;
        return aux;
    }
    
    //Rotacion simple Derecha
    public Nodo rotacionDer(Nodo c){
        Nodo aux = c.der;
        c.der = aux.izq;
        aux.izq = c;
        c.fe = Math.max(obtenerFE(c.izq), obtenerFE(c.der)) +1;
        aux.fe = Math.max(obtenerFE(aux.izq), obtenerFE(aux.der)) +1;
        return aux;
    }
    
    //Rotacion doble a la derecha
    public Nodo rotacionDobleIzq(Nodo c){
        Nodo temporal;
        c.izq = rotacionDer(c.der);
        temporal = rotacionIzq(c);
        return temporal;
    }
    
    //Rotacion doble a la Izq
    public Nodo rotacionDobleDer(Nodo c){
        Nodo temporal;
        c.der = rotacionIzq(c.der);
        temporal = rotacionDer(c);
        return temporal;
    }
    
    //Metodo para insertar AVL
    public Nodo insertarAVL(Nodo nuevo, Nodo subArb){
        Nodo nuevoPadre = subArb;
        if (nuevo.noNodo < subArb.noNodo) {
            if (subArb.izq == null) {
                subArb.izq = nuevo;
            } else {
                subArb.izq = insertarAVL(nuevo, subArb.izq);
                //Rotaciones
                if ((obtenerFE(subArb.izq)) - (obtenerFE(subArb.der)) == 2) {
                    if (nuevo.noNodo < subArb.izq.noNodo) {
                        nuevoPadre = rotacionIzq(subArb);
                    } else {
                        nuevoPadre = rotacionDobleIzq(subArb);
                    }
                }
            }
        } else if (nuevo.noNodo > subArb.noNodo){
            if (subArb.der == null) {
                subArb.der = nuevo;
            } else{
                subArb.der = insertarAVL(nuevo, subArb.der);
                //Rotaciones
                if ((obtenerFE(subArb.der)) - (obtenerFE(subArb.izq)) == 2) {
                    if (nuevo.noNodo > subArb.der.noNodo) {
                        nuevoPadre = rotacionDer(subArb);
                    } else{
                        nuevoPadre = rotacionDobleDer(subArb);
                    }
                }
            }
        } else{
            System.out.println("Nodo duplicado");
        }
        
        if ((subArb.izq == null) && (subArb.der != null)) {
            subArb.fe = subArb.der.fe + 1;
        } else if ((subArb.der == null) && (subArb.izq != null)) {
            subArb.fe = subArb.izq.fe + 1;
        } else {
            subArb.fe = Math.max(obtenerFE(subArb.izq), obtenerFE(subArb.der)) +1;
        }
        return nuevoPadre;
    }
    
    //Metodo para insertar
    public void insertar(int n, String p, String c){
        Nodo nuevo = new Nodo(n, p, c);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertarAVL(nuevo, raiz);
        }
    }
    
    public Nodo noUltimoNodo(){
        Nodo lastNodo = raiz;
        return lastNodo; 
    }
    
    //-----------RECORRIDOS-------------
    //Recorrer arbol preOrder (normal)
    public void enOrden(Nodo r){
        if (r != null) {
            enOrden(r.izq);
            System.out.print(r.noNodo + ", ");
            enOrden(r.der);
        }
    }
    
    //Recorrer arbol enOrden (izquierda a derecha)
    public void preOrden(Nodo r){ 
        if (r != null) {
            System.out.print(r.noNodo + ", ");
            preOrden(r.izq);
            preOrden(r.der);
         }
    }
    
    //Recorrer arbol PostOrden (abajo para arriba)
    public void postOrden(Nodo r){
        if (r != null) {
            postOrden(r.izq);
            postOrden(r.der);
            System.out.print(r.noNodo + ", ");
        }
    }
    
}
