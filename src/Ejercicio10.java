import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = null;
        Map<String,Integer> map = new HashMap<>();
        try{
            bufferedReader = new BufferedReader(new FileReader("LastNameFrequencies.csv"));
            String line;
            while((line= bufferedReader.readLine())!=null){
            String[] items= line.split(",");
            Integer frequency = Integer.parseInt(items[1]);
            map.put(items[0],frequency);



            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }


}
