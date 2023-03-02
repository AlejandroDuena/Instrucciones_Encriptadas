public class Exceptions {

    public static void verificadorIns(){
        Lector LD = new Lector();
        int caractIns1 = LD.getCaractInstruccion_uno();
        int caractIns2 = LD.getCaractInstruccion_dos();
        int caractMen = LD.getCaractMensajeIncriptado();
        String ins1 = LD.getInstruccion1();
        String ins2 = LD.getInstruccion2();
        String men = LD.getMensaje();
        if((caractMen >= 3 && caractMen <= 5000) && (caractIns1 >= 2 && caractIns1 <= 50) &&
                (caractIns2 >= 2 && caractIns2 <= 50)){
                if(caractIns1 == ins1.length() && caractIns2 == ins2.length() &&
                caractMen == men.length()){
                    if(validarCaracteresEspeciales(ins1) && validarCaracteresEspeciales(ins2) &&
                    validarCaracteresEspeciales(men)){
                        String result1 = validarCaracteres(ins1 , men);
                        String result2 = validarCaracteres(ins2 , men);

                        if(!result1.equals(result2)){
                        }
                        else {
                            System.out.println("Hay 2 instrucciones en el mensaje.");
                        }
                    }
                    if(!validarCaracteresEspeciales(ins1))System.out.println("Instrucción 1 contiene caracteres especiales.");

                    if(!validarCaracteresEspeciales(ins2))System.out.println("Instrucción 2 contiene caracteres especiales.");

                    if(!validarCaracteresEspeciales(men)) System.out.println("Mensaje encriptado contiene caracteres especiales.");

                }
                if(caractIns1 != ins1.length()) System.out.println("El tamaño esperado no coincide con la instrucción 1.");

                if(caractIns2 != ins2.length()) System.out.println("El tamaño esperado no coincide con la instrucción 2.");

                if(caractMen != men.length()) System.out.println("El tamaño esperado no coincide con el mensaje encriptado.");
        }
    }

    private static String validarCaracteres(String ins, String men){
        int recorrerMensaje = 0;
        int recorrerInstruc = 0;
        while (recorrerMensaje < men.length() && recorrerInstruc < ins.length()){
            if(men.charAt(recorrerMensaje) == ins.charAt(recorrerInstruc)){
                recorrerInstruc++;
            }
            recorrerMensaje++;
        }
        if (recorrerInstruc == ins.length()){
            return "SI";
        }
        return "NO";
    }

    private static boolean validarCaracteresEspeciales(String mensaje) {
        String caractValidos = "[a-zA-Z0-9]";
        String validarMensaje = mensaje.replaceAll(caractValidos, "");
        if (validarMensaje.equals("")){
            return true;
        }else {
            return false;
        }
    }
}