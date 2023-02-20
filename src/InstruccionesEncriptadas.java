import java.io.*;
import java.util.Scanner;

public class InstruccionesEncriptadas {

   public static void main(String[] args) {
        /*FileWriter fichero = null;
        PrintWriter pw;
        Scanner sc = new Scanner(System.in);
        File archivo;

        try {
            archivo = new File("instrucciones.txt");
            int m1 = 0, m2 = 0;
            int n = 0;
            String instruc1 = "";
            String instruc2 = "";
            String mensaje = "";
            sc = new Scanner(archivo);

            m1 = sc.nextInt();
            m2 = sc.nextInt();
            n = sc.nextInt();
            instruc1 = sc.next();
            instruc2 = sc.next();
            mensaje = sc.next();

            if ((n >= 3 && n <= 5000) && (m1 >= 2 && m1 <= 50) && (m2 >= 2 && m2 <= 50)) {
                int i = 0;
                int j = 0;
                while (i < mensaje.length() && j < instruc1.length()) {
                    i++;
                    j++;
                    if (j == instruc1.length()) {
                        instruc1 = "SI";
                    } else {
                        instruc1 = "NO";
                    }
                }
                while (i < mensaje.length() && j < instruc2.length()) {
                    i++;
                    j++;
                    if (j == instruc2.length()) {
                        instruc2 = "SI";
                    } else {
                        instruc2 = "NO";
                    }
                }
                try {
                    fichero = new FileWriter("resultados.txt");
                    pw = new PrintWriter(fichero);
                    pw.println(instruc1);
                    pw.println(instruc2);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (null != fichero) ;
                        fichero.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
    }
}