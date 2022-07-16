package saime;

import java.io.IOException;
import java.util.Scanner;
public class Saime {

    
    public static void main(String[] args)throws IOException {
    lista lis = new lista();
    lista l = new lista();
    Scanner t = new Scanner(System.in);
    Scanner r = new Scanner(System.in);
    Scanner t1 = new Scanner(System.in);
    Scanner t2 = new Scanner(System.in);
    Scanner t3 = new Scanner(System.in);
    String  v,n;
    int o,m;
    int opcion = 0 ;
        do{
        System.out.println("(-- Bienvenido al saime                        --)");
        System.out.println("(-- Por favor indique opciones a realizar      --)");
        System.out.println("(--1 ingrese datos del cliente                 --)");
        System.out.println("(--2 archivar datos de los cliente en el dia   --)");
        opcion = t1.nextInt();

        switch (opcion){
            case 1:
                System.out.println("ingrese nombre de cliente");
                n = t.nextLine();
                System.out.println("ingrese cedula del cliente");
                v = t2.nextLine();
                System.out.println("ingrese actividad a realizar del cliente");
                System.out.println("1 cedulacion");
                System.out.println("2 pasaporte");
                System.out.println("3 retiro de documento");
                o = t3.nextInt();
                l.add(n, v, o);
                break;
            case 2:
                System.out.println("ingrese cantidad de clienetes");
                m = r.nextInt();
                l.ingresarcliente(m);
                l.mostrar();
                System.out.println("clientes del dia archivados con exito");
                break;
            case 3:
                System.out.println("gracias por trabajar hoy");
                break;
            }
        }while(opcion != 3);
    }
    
}