package fourthpackage;

public class ArrayPractice {
    public static void main(String[] args) {

        String name = "Rohan1, Rohan2, Rohan3";
        System.out.println(name);

        String[] names = {"Julia", "Burhan", "Menad"};

        int [] years = {2022,2025,2026};


        System.out.println(names[1]);
        System.out.println(years[2]);
        for (int i = 0; i < names.length; i++) {
            String dataOnLoop = names[i];
            System.out.println(dataOnLoop);
        }

        System.out.println(names);


    }
}



