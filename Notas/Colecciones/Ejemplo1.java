import java.util.ArrayList;

public class Ejemplo1 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(10);
        arr.add(20);
        arr.add(50);
        arr.add(1, 9);
        System.out.println("Tamaño del ArrayList: "+arr.size());
        System.out.println("Elemento en la posición 4: "+ arr.get(3));
        for (Integer e : arr) {
            System.out.println(e);
        }
    }
    
}
