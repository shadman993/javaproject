package fourthpackage;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(200);
        numberList.add(201);
        numberList.add(202);

        ArrayList<Object> objectsList = new ArrayList<>();
        objectsList.add("name");
        objectsList.add(true);
        objectsList.add(100);

    for(int i=0; i<numberList.size();i++){
        int number = numberList.get(i);
        System.out.println(number);
    }





    }
}
