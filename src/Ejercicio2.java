import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        incrementaUno(hashSet);
    }

    public static void incrementaUno(HashSet<Integer> hashSet) {
        List<Integer> integerHashSet1 = new LinkedList<>(hashSet);
        hashSet.clear();
        for (Integer f : integerHashSet1){
            hashSet.add(f + 1);}
        System.out.println(hashSet);
    }


}

