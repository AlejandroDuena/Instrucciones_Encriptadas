import java.io.*;
import java.util.Scanner;

 public class Lector {

     private int caractInstruc1;
     private int caractInstruc2;
     private int caractMensaje;
     private String instruc_uno;
     private String instruc_dos;
     private String mensaje;

     Scanner sc = new Scanner(System.in);

     File archivo;

     public void leerArchivo(String nombreEntrada) {

         archivo = new File(nombreEntrada);
         int m1 = 0;
         int m2 = 0;
         int n = 0;
         String instruc1 = "";
         String instruc2 = "";
         String men = "";
         try {
             sc = new Scanner(archivo);
             m1 = sc.nextInt();
             setCaractInstruccion_uno(m1);
             m2 = sc.nextInt();
             setCaractInstruccion_dos(m2);
             n = sc.nextInt();
             setCaractMensajeIncriptado(n);
             instruc1 = sc.next();
             setIntruccion1(instruc1);
             instruc2 = sc.next();
             setInstruccion2(instruc2);
             men = sc.next();
             setMensaje(men);
         } catch (FileNotFoundException e) {
             System.out.println("Error a leer los datos, por favor verificar que el formato sea correcto.");
         }
     }

     public void setCaractInstruccion_uno(int caractInstruc1) {
         this.caractInstruc1 = caractInstruc1;
     }

     public void setCaractInstruccion_dos(int caractInstruc2) {
         this.caractInstruc2 = caractInstruc2;
     }

     public void setCaractMensajeIncriptado(int caractMensaje) {
         this.caractMensaje = caractMensaje;
     }

     public void setIntruccion1(String instruc_uno) {
         this.instruc_uno = instruc_uno;
     }

     public void setInstruccion2(String instruc_dos) {
         this.instruc_dos = instruc_dos;
     }

     public void setMensaje(String mensaje) {
         this.mensaje = mensaje;
     }

     public int getCaractInstruccion_uno() {
         return caractInstruc1;
     }

     public int getCaractInstruccion_dos() {
         return caractInstruc2;
     }

     public int getCaractMensajeIncriptado() {
         return caractMensaje;
     }

     public String getInstruccion1() {
         return instruc_uno;
     }

     public String getInstruccion2() {
         return instruc_dos;
     }

     public String getMensaje() {
         return mensaje;
     }
 }