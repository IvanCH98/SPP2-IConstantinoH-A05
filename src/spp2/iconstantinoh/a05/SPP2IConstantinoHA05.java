/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Iván Constantino Hernández A01411529 IIS
package spp2.iconstantinoh.a05;
import java.util.Scanner;
/**
 *
 * @author ivana
 */
public class SPP2IConstantinoHA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ent1,ent2,ent3;
        String t;
        double nd; // nd= numero double
        long nl; // nl= numero long
        ent1= solicitaEntero ("un número entero de menos de diez dígitos");
        
        t=solicitaTexto() ;
        nd= solicitaNumero();
        nl= solicitanumeroL();         
        
    }
    public static int solicitaEntero(String mensaje){
        //Instanciamos nuestro teclado
        Scanner kb = new Scanner(System.in);
        int varEntera=0;
        boolean flag;

        do {
            System.out.println("Introduce " + mensaje);
            try {
                //Código que puede producir un error (Excepción)
                varEntera = kb.nextInt();
                flag = false;
            } catch (Exception ex) {
                //Código para el manejo del error
                System.out.println("Introdujiste algo que no es entero o tiene mas de diez dígitos " + ex);
                flag = true;
                kb.nextLine();
            }
        } while (flag);
        return varEntera;
    }
    
        public static String solicitaTexto(){
        //Instanciamos nuestro teclado
        Scanner kb = new Scanner(System.in);
        String Text="";
        boolean flag;

        do {
            System.out.println("Introduce texto " );
            try {
                //Código que puede producir un error (Excepción)
                Text = kb.nextLine();
                flag = false;
            } catch (Exception ex) {
                //Código para el manejo del error
                System.out.println("Introdujiste algo que no es aceptado como texto " + ex);
                flag = true;
                kb.nextLine();
            }
        } while (flag);
        return Text;
    }
        
     public static Double solicitaNumero(){
        //Instanciamos nuestro teclado
        Scanner kb = new Scanner(System.in);
        double numeroD=0;
        boolean flag;

        do {
            System.out.println("Introduce cualquier número " );
            try {
                //Código que puede producir un error (Excepción)
                numeroD = kb.nextDouble();
                flag = false;
            } catch (Exception ex) {
                //Código para el manejo del error
                System.out.println("Introdujiste algo que no es un número " + ex);
                flag = true;
                kb.nextLine();
            }
        } while (flag);
        return numeroD;
    }    
      public static Long solicitanumeroL (){
        //Instanciamos nuestro teclado
        Scanner kb = new Scanner(System.in);
        long numeroL=0;
        boolean flag;

        do {
            System.out.println("Introduce un número sin decimales " );
            try {
                //Código que puede producir un error (Excepción)
                numeroL = kb.nextLong();
                flag = false;
            } catch (Exception ex) {
                //Código para el manejo del error
                System.out.println("Introdujiste algo que no es un número o tiene decimales " + ex);
                flag = true;
                kb.nextLine();
            }
        } while (flag);
        return numeroL;
    }
    
    
}