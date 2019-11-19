package zadanie1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountriesUtils {

    static Map<String, Countries> countryMap(String fileName){
        Map<String,Countries> map = new HashMap<>();
        try(var reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = reader.readLine()) != null){
                String [] countries = line.split(";");
                map.put(countries[0], new Countries(countries[0],countries[1],countries[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    static void printMap(Map<String, Countries> map){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String code = sc.nextLine();
        if (map.containsKey(code)){
            System.out.println(map.get(code.toUpperCase()));
        }else {
            System.out.println("Niepoprawny kod kraju");
        }
        sc.close();
    }
}
