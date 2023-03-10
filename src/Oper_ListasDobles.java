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
}
