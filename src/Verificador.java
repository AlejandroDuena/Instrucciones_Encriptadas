public class Verificador {
    public String instruc1() {

        int instruccion_uno = lector.getCaractInstruccion_uno();
        int instruccion_dos = lector.getCaractInstruccion_dos();
        int mensajeIncriptado = lector.getCaractMensajeIncriptado();
        String instruccion1 = lector.getInstruccion1();
        String mensaje = lector.getMensaje();
        String instruc_1 = "";

        if ((mensajeIncriptado >= 3 && mensajeIncriptado <= 5000) &&
                (instruccion_uno >= 2 && instruccion_uno <= 50) &&
                (instruccion_dos >= 2 && instruccion_dos <= 50)) {
            int i = 0;
            int j = 0;

            while (i < mensaje.length()-1 && j < instruccion1.length()) {
                i++;
                if (instruccion1.charAt(j) == mensaje.charAt(i)) {
                    j++;
                }
            }
            if (j == instruccion1.length())
            {
                instruc_1 = "SI";
            } else {
                instruc_1 = "NO";
            }
        }
        else{
          enviarError("Los parametros establecidos no se cumplen, por favor revise que estos se esten cumpliendo.");
        }
        return instruc_1;
    }
    public String instruc2() {

        int instruccion_uno = lector.getCaractInstruccion_uno();
        int instruccion_dos = lector.getCaractInstruccion_dos();
        int mensajeIncriptado = lector.getCaractMensajeIncriptado();
        String instruccion2 = lector.getInstruccion2();
        String mensaje = lector.getMensaje();
        String instruc_2 = "";

        if ((mensajeIncriptado >= 3 && mensajeIncriptado <= 5000) &&
                (instruccion_uno >= 2 && instruccion_uno <= 50) &&
                (instruccion_dos >= 2 && instruccion_dos <= 50)) {
            int i = 0;
            int j = 0;

            while (i < mensaje.length() - 1 && j < instruccion2.length()) {
                i++;
                if (instruccion2.charAt(j) == mensaje.charAt(i)) {
                    j++;
                }
            }
            if (j == instruccion2.length()) {
                instruc_2 = "SI";
            } else {
                instruc_2 = "NO";
            }
        }
        return instruc_2;
    }
    private void enviarError(String error){
        System.out.println(error);
        System.exit(-1);
    }
    private Lector lector;
    public void setLector(Lector lector) {
        this.lector = lector;
    }
}
