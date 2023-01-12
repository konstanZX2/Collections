import java.io.*;
import java.util.*;

import static java.util.Collections.frequency;

public class Ejercicio11 {
    public static void main(String[] args) throws IOException{
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        Map<String,Integer> map = new HashMap<>();
        try{
            bufferedReader = new BufferedReader(new FileReader("LastnameFrequencies.csv"));
            String line;
            while((line= bufferedReader.readLine())!=null){
                String[] items= line.split(",");
                Integer frequency = Integer.parseInt(items[1]);
                map.put(items[0],frequency);



            }
            printWriter = new PrintWriter(new FileWriter("sorted.txt"));
            Set<String> keys = map.keySet();
            List<String> list = new ArrayList<String>(keys);
            Collections.sort(list);
            for (String lastname: list){
                printWriter.println(lastname+","+map.get(lastname));
            }

        }finally {
            if (bufferedReader!=null){
                bufferedReader.close();
            }if (printWriter!=null){
                printWriter.close();
            }
        }

    }
}
