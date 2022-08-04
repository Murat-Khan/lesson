import java.util.Random;

public class Main {
static Random random = new Random();



    public static void main(String[] args){
        System.out.println(canGoOut(25, 18));
        System.out.println(canGoOut(30, 25));
        System.out.println(canGoOut(15, 40));
        System.out.println(canGoOut(50, 18));
        System.out.println(canGoOut(10, 20));
        System.out.println(canGoOut(generateRandomAge(), 20));
        System.out.println(generateRandomAge());

    }

    public static String canGoOut(int age, int temperature) {

        if (age > 19 && age < 45 && temperature > -19 && temperature < 30) {
            return "Можно идти гулять ";
        } else if (age < 20 && temperature > -1 && temperature < 28) {
            return "Можно идти гулять ";
        } else if (age > 45 && temperature > -9 && temperature < 25)
            return "Мжно идти гулять ";
        else
            return "Оставайтесь дома";
    }


    public static int generateRandomAge(){
        return random.nextInt(99);
    }

}

