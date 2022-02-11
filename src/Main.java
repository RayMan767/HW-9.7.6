import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hiddenNum = randomizer(0,10);
        int guessedNum;
        Scanner number = new Scanner(System.in);
        System.out.println("Otgadaite zagadannoe celoe chislo ot 0 do 10:");

        while(true){
            if(number.hasNextInt()) {
                guessedNum = number.nextInt();
                if (guessedNum == hiddenNum)
                    break;
                else
                    System.out.println("Poprobuite eshe:");
            }
            else{
                System.out.println("Vi vveli ne celoe chislo.");
                System.out.println("Poprobuite eshe:");
                number.next();
            }

        }
        System.out.println("Pozdravlyaem vi ugadali chislo!");

    }


    static int randomizer(int minNum, int maxNum){
        int rezult;
        rezult = (int)(Math.random() * (maxNum + 1 - minNum)) + minNum;
        return rezult;

    }
}
