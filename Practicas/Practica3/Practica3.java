import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Practica3 {

    // Tomar la entrada desde método main, es decir, los args[n] van a ser la entrada 
    // Al menos 1 cadena a la entrada
    // El ArrayList es para las entradas (los args[n])
    // El HashMap es para mostrar las salidas digeridas (tenemos que hacer uso de generaHash)
    // Hint: para imprimir resultados es iterando las entradas y pidiendo al mapa los datos digeridos
    
    public static String generaHash(String texto) {
        // Crear la semilla a partir de la suma de los caracteres
        int semilla = 0;
        for (char c : texto.toCharArray()) {
            semilla += c;
        }

        Random random = new Random(semilla);

        // Generar 32 caracteres hexadecimales (simulando MD5)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int valor = random.nextInt(16); // 0 - F
            sb.append(Integer.toHexString(valor));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Ingresa una palabra al menos");
            return;
        }

        ArrayList<String> entradas = new ArrayList<>();

        for(String arg: args){
            entradas.add(arg);
        }

        HashMap <String, String> mapa = new HashMap<>();
        
        for(String entrada: entradas){
            mapa.put(entrada, generaHash(entrada));
        }
        System.out.println("Resultados:");
        for(String entrada: entradas){
            System.out.println("Entrada: " + entrada + "-> Hash:" + mapa.get(entrada));
        }
    }
}