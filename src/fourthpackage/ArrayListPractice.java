package fourthpackage;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<String> CountryList = new ArrayList();
        CountryList.add("USA");
        CountryList.add("Canada");
        CountryList.add("China");

        System.out.println(CountryList);
        System.out.println(CountryList.size());

        for(int i=0;i<CountryList.size();i++){
            String Country = CountryList.get(i);
            System.out.println(Country);
        }

    }
}
