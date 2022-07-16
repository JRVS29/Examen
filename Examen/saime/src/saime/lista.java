
package saime;

import java.io.*;

public class lista {
    PrintWriter pw;
    FileReader fr;
    nodo p, u, aux, anterior, actual;
    int tiempototal = 0; 
    int turno = 0;
    
      void add(String nombre,String cedula, int opcion){
        
        nodo nuevo = new nodo(nombre,cedula,opcion);
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
    
    

           void ingresarcliente(int cantidad) throws IOException{
    aux = p;   
    
    pw = new PrintWriter(new FileWriter("clientes.txt", true));
        while(turno < cantidad){
           
            if(aux.opcion == 1){
            pw.println("**"+aux.nombre+" C.I:" +aux.cedula+" tramite realizado: cedulacion con duracion de 15 minutos ");
            tiempototal =tiempototal + 15;
            }else if (aux.opcion == 2) {
            pw.println("**"+aux.nombre+" C.I:" +aux.cedula+" tramite realizado: pasaporte con duracion de 20 minutos ");
            tiempototal = tiempototal + 20;
            }else if (aux.opcion == 3){
            pw.println("**"+aux.nombre+" C.I: " +aux.cedula+" tramite realizado: retiro de documento con duracion de 3 minutos");
            tiempototal = tiempototal + 3;   
            }
            aux = aux.sig;
            turno++;
            

         }
        pw.close();

    }
      
      void mostrar() throws IOException{
        pw = new PrintWriter(new FileWriter("tiempototal.txt", false));
        pw.println("**tiempo total de actividades realizadas: "+tiempototal+" minutos**");
        pw.close();
      }



}
