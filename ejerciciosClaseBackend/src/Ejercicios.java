import java.util.HashSet;
import java.util.Set;

public class Ejercicios {
    public static void main(String[] args) {
        int [] numbers = {1,2,2,3,3,4,5,5};
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> duplicates = new HashSet<Integer>();

        for(int numero : numbers){
            if (!set.add(numero)){
                duplicates.add(numero);
            }

            System.out.println("Los valores repetidos son" + duplicates);


        }
    }

}


