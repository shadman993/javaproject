package thirdpackage;

public class ForLoopsPractice {
    public static void main(String[] args) {

        // for loop
        //for(int i=0;i<10;i++){
        //System.out.println("i love java"+i);


        //keyword(startingPoint;endingPoint; increment){--> body starts
        // body
        //} --> body ends

        for (int i = 0; i < 10; i++) {
            System.out.println("i love java" + i);
        }
        // for loop in decrement

        for (int i = 10; i > 0; i--) {
            System.out.println("i love java" + i);
        }
        for (int i = 0; i > -5; i--) {
            System.out.println("i love java" + i);

        }
        //inner for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("java" + i);

            for (int j = 0; j < 2; j++) {
                System.out.println("selenium");
            }

        }

        // conditional for loop

        // count till 10, if the number is 5 , print java, if the number is 6 print selenium
        // for the rest, print python

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                System.out.println("java");

            } else if (i == 6) {
                System.out.println("selenium");
            } else {
                System.out.println("python");
            }

        }
    }
}


