import java.io.FileWriter;
import java.io.PrintWriter;

public class crearDocumento {
    public static void main(String[] args) {
        Verificador ver = new Verificador();
        String instruc1 = ver.instruc1();
        String instruc2 = ver.instruc2();
        FileWriter fichero = null;
        PrintWriter pw;
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

                exceptions.verificadorIns(); }
            catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}