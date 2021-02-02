import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat(   "Vaska",2, " Б");
        Cat catTwo = new Cat(   "Kolia",3, " В");
        Cat catThree = new Cat("Barsik",4, " Г");
        Cat catFour = new Cat( "Marsik",1, " А");

        Cat [] catArray = new Cat[]{catOne,catFour,catThree,catTwo};

        for (Object cat : catArray){
            System.out.println(cat);
        }

        Arrays.sort(catArray);//сортировка

        System.out.println();
        for (Object cat : catArray){

            System.out.println(cat);

        }
    }
}
