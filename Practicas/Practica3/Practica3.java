
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

// Tomar la entrada desde método main, es decir, los args[n] van a ser la entrada 
    // Al menos 1 cadena a la entrada
    // El ArrayList es para las entradas (los args[n])
    // El HashMap es para mostrar las salidas digeridas (tenemos que hacer uso de generaHash)
    // Hint: para imprimir resultados es iterando las entradas y pidiendo al mapa los datos digeridos
    
public class Practica3 {
    public static String generaHash(String texto){
        int semilla = 0;
        for(char c : texto.toCharArray()){
            semilla += c;
        }
        Random random = new Random(semilla);//inicializa en semilla
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<32; i++){
            int valor = random.nextInt(16);//cada pasada cambia el estado del objeto, por eso da diferentes numeros pero siempre da el mismo hash con la misma semilla.
            sb.append(Integer.toHexString(valor));
        }
        return sb.toString();
        
    }  
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
        HashMap<String, String> mapa = new HashMap<>();
        for (String texto : args){ // for-each (tipo de argumento: cada elemento)
            lista.add(texto);
        }
        for(int i=0; i < lista.size(); i++){
            String key = generaHash(lista.get(i));
            mapa.put(lista.get(i),key);
        }
        for (String texto: lista){
            System.out.println(texto + ":"+ mpa.get(texto));
        }
    }
    
}
