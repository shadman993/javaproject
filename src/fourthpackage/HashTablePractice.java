package fourthpackage;


import java.util.Hashtable;

public class HashTablePractice {

    public static void main(String[] args) {
        Hashtable<Integer, String> studentTable = new Hashtable<>();

        //lIfo pattern( last in first out)

        studentTable.put(1, "Tanzina");
        studentTable.put(2, "Tanz");
        studentTable.put(3, "Menad");

        System.out.println(studentTable);



    }
}
