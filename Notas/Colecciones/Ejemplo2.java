import java.util.Hashtable;

public class Ejemplo2 {
    public static void main(String[] args) {
        Hashtable<String, Integer> tabla = new Hashtable<String, Integer>();
        tabla.put("uno", 1);
        tabla.put("dos", 2);
        tabla.put("cincuenta", 50);

        System.out.println("¿Contiene a cuatro?" + tabla.containsKey("cuatro"));

        for (String c : tabla.keySet()) {
            System.out.println(c);
        }

        for(Integer i : tabla.values()) {
            System.out.println(i);
        }
    }
}
