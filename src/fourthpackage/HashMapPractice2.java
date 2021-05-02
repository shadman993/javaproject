package fourthpackage;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice2 {

    public static void main(String[] args) {

        // USa --> ny nj pa
        // canada --> co nh


        ArrayList<String> listOfStateUSA = new ArrayList<>();
        listOfStateUSA.add("NY");
        listOfStateUSA.add("NY");
        listOfStateUSA.add("PA");

        ArrayList<String> listOfStateCanada = new ArrayList<>();
        listOfStateCanada.add("co");
        listOfStateCanada.add("NH");

        HashMap<String, ArrayList<String>> countryMap = new HashMap<>();
        countryMap.put("USA", listOfStateUSA);
        countryMap.put("Canada", listOfStateCanada);

        System.out.println(countryMap);

        System.out.println(countryMap.get("USA"));

        System.out.println("**********");

        // ArrayList<String> cityAndZipCodes = new ArrayList<>();

        HashMap<String, Integer> cityAndZipOfUSA = new HashMap<>();
        cityAndZipOfUSA.put("Rego Park", 11374);

        cityAndZipOfUSA.put("Forest Hills", 12222);

        HashMap<String, Integer> cityAndZipOfCanada = new HashMap<>();
        cityAndZipOfCanada.put("Rego Park", 11364);
        cityAndZipOfCanada.put("Forest Hills", 1322);


        ArrayList<HashMap<String, Integer>> cityAndZipCodes = new ArrayList<>();
        cityAndZipCodes.add(cityAndZipOfUSA);
        cityAndZipCodes.add(cityAndZipOfCanada);

        System.out.println(cityAndZipCodes);


    }

}
