package zadanie1;

import java.util.Map;

public class CountriesTest {
    public static void main(String[] args) {
        String fileName = "countries.csv";

        Map<String, Countries> countryMap = CountriesUtils.countryMap(fileName);
        CountriesUtils.printMap(countryMap);
    }
}
