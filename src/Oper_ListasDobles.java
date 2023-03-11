public class Oper_ListasDobles {
     NodoDoble prim=null, ulti=null;

     public void insertarInicio(int x){
         NodoDoble nuevo=new NodoDoble(x);

         if(prim==null){
             prim=nuevo;
             ulti=nuevo;
         }else {
             nuevo.sig=prim;
             prim.ant=nuevo;
            prim=nuevo;
         }
     }
    public void insertarFinal(int x){
         NodoDoble nuevo=new NodoDoble(x);

         if (prim==null){
             prim=nuevo;
             ulti=nuevo;
         }else {


             nuevo.ant=ulti;
             ulti.sig=nuevo;
             ulti=nuevo;
         }
    }
    NodoDoble buscarNodo(int dato){//Este metodo sirve para buscar el nodo y asi
        NodoDoble actual = prim; //No tengo que crear mas for
        while(actual != null && actual.dato != dato){
            actual = actual.sig;
        }
        return actual;
    }

    boolean insertarEnseguida(int x, int y){
        boolean i = false;
        NodoDoble encontrado = buscarNodo(y); //Usamos el método auxiliar para buscar el nodo
        if(encontrado != null && encontrado != ulti){ //Si encontramos el nodo y no es el último
            i = true;
            NodoDoble nodoNuevo = new NodoDoble(x);
            NodoDoble nodoSiguiente = encontrado.sig;
            encontrado.sig = nodoNuevo;
            nodoSiguiente.ant = nodoNuevo;
            nodoNuevo.ant = encontrado;
            nodoNuevo.sig = nodoSiguiente;
        }else if(encontrado == ulti){
            insertarFinal(x);
        }
        return i;
    }
    boolean EliminarInicio(){
         boolean i=false;

         if (prim!=null){
             i=true;
             if (prim==ulti){
                 prim=null;
                 ulti=null;
             }
             else {
                 NodoDoble nodoActual=prim;
                 prim=prim.sig;
                 prim.ant=null;
                 nodoActual.sig=null;

             }
         }
         return i;
    }
    boolean EliminarFinal(){
         boolean i=false;
         if (ulti!=null){
             i=true;
             if (prim==ulti){
                 prim=null;
                 ulti=null;
             }else{
                    NodoDoble nodoActual=ulti;
                    ulti=ulti.ant;
                    ulti.sig=null;
                    nodoActual.ant=null;
             }
         }
         return i;
    }
    void mostrarLista(){
         NodoDoble nodoActual = prim;
        while (nodoActual != null){
            System.out.println(nodoActual.dato);
            nodoActual = nodoActual.sig;
        }
     }

}
