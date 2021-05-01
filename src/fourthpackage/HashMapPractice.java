package fourthpackage;


import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {
        //dbName=com.oracle
        //dbUser=testUser
        //dbPassword=1234s56789

        HashMap<String,String> informationMap = new HashMap<>();
        informationMap.put("dbName", "com.oracle");
        informationMap.put("dbUser", "testUser");
        informationMap.put("dbPassword", "com.oracle");

        System.out.println(informationMap);

        System.out.println(informationMap.get("dbName"));
        System.out.println(informationMap.get("dbUser"));
        System.out.println(informationMap.get("dbPassword"));

    }
}
