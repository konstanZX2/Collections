import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = null;
        Map<String,Integer> map = new HashMap<>();
        try{
            bufferedReader = new BufferedReader(new FileReader("LastNameFrequencies.csv"));
            String line;
            while((line= bufferedReader.readLine())!=null){



            }
        }

    }
}
