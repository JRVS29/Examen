 
package serviciotelefono;


public class Serviciotelefono {

  
    public static void main(String[] args) {
    String matriz[][] = {{"Silvestre Cardenas","8"},{"Andres Lopez","1"},{"Andreina Gonzalez","5"},{"Maria Perez","0"},{"armando Paredes","10"}};
    int calificacion;
    
    for(int i= 0;i<5;i++){
       
        calificacion = Integer.parseInt( matriz[i][1]);
        if(calificacion == 0 ){
            System.out.print("El cliente "+matriz[i][0]+" no atendio la llamada");
        }else if(calificacion <= 4   ){
            System.out.print("El cliente "+matriz[i][0]+" no estuvo satisfecho");
        }else if(calificacion == 5 ){
            System.out.print("El cliente "+matriz[i][0]+" tuvo una reacion neutra");
        }else if(calificacion <= 8  ){
            System.out.print("El cliente "+matriz[i][0]+" estuvo satisfecho");
        }else if ( calificacion <= 10  ){
            System.out.print("El cliente "+matriz[i][0]+" estuvo muy satisfecho");
        }
        
        System.out.println("");
    }
    
    
    
    
    }
    
}
