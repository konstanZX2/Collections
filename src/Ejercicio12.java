import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter=null;
        BufferedReader bufferedReader=null;
        Map<String, Integer> map = new HashMap<>();

        try{
            bufferedReader= new BufferedReader( new FileReader("Colfuturo-Seleccionados.csv"));
            String line = bufferedReader.readLine();//ESTO ES PARA SALTARSE LA PRIMERA LINEA

            while((line = bufferedReader.readLine())!=null){
                String []items = line.split(",");
                String country = items[6];
                Integer frequency = map.get(country);
                map.put(country,frequency==null ? 1 : frequency + 1);


            }
            Set<String> keys = map.keySet();
            List<Pair> list = new ArrayList<>();
            for (String key: keys){
                list.add(new Pair(key, map.get(key)));
            }
            Collections.sort(list);
            Collections.reverse(list);
            for (Pair pair : list){
                System.out.println(pair.key+": "+pair.value);
            }

//            List<String> list = new ArrayList<>(keys);
//            Collections.sort(list);
            for (String s : keys){
                System.out.println(s +","+map.get(s));
            }
        }finally{
            if (bufferedReader!= null){
                bufferedReader.close();
            }
        }

    }
}
