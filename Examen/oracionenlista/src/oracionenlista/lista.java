
package oracionenlista;

import java.util.Scanner;
public class lista {
    Scanner leer = new Scanner(System.in);
    nodo p = null;
    nodo u, aux;
    String sar;
    int i = 0;
    String matriz [] = {"Mi","nombre","es","Jose","y","estudio","ingieneria","de","sistemas"};

    void add(String nombre){
        
        nodo nuevo = new nodo(nombre);
        nuevo.palabra = nombre;
        if(p == null){
            p = nuevo;
            p.sig = p;
            nuevo.ant = u;
            u = nuevo;
        } else {
            u.sig = nuevo;
            nuevo.sig = p;
            nuevo.ant = u;
            u = nuevo;
            p.ant = u;

            }
        }
        public  void escribir(){
           
           if( i < 9){
               
               sar = matriz [i];
               add(sar);
               i++;
            escribir();
           }
        i = 0;
        aux = p;
        
    }
    public void recorrido(){
        
        
         if (i < 9){
             System.out.println(aux.palabra+" ");
             aux = aux.sig;
             i++;
            recorrido();
         }

        
     }
    
}
