import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Creador {
    public static void main(String[] args) {
        Lector LD =  new Lector();
        if (args.length < 2){
            System.out.println("Se requiere dos archivos, uno de entrada y uno de salida.");
            System.exit(-1);
        }
        String entradaArchivo;
        entradaArchivo = args[0];
        String salidaArchivo;
        salidaArchivo = args[1];
        LD.leerArchivo(entradaArchivo);
        Verificador ver = new Verificador();
        ver.setLector(LD);
        Exceptions exc = new Exceptions();
        exc.setLector(LD);
        String instruc1 = ver.instruc1();
        String instruc2 = ver.instruc2();
        FileWriter fichero = null;
        PrintWriter pw;
        try {
            fichero = new FileWriter(salidaArchivo);
            pw = new PrintWriter(fichero);
            pw.println(instruc1);
            pw.println(instruc2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert fichero != null;
                fichero.close();
                Exceptions.verificadorIns();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}