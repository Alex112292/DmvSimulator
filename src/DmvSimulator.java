import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the DMV.");
        Random rand = new Random();
        int upper = 201;
        int lower = 1;
        int custNum = rand.nextInt(upper-lower) + lower;
        System.out.println("Your number is " + custNum + ". Go wait in line until your number is called.");
        int currNum = custNum;
        do {
            currNum = currNum + 1;
            System.out.println("Number: " + currNum + " please step up.");
            if(currNum == upper - 1)
            {
                currNum = lower - 1;
            }
            if (currNum == custNum)
            {
                System.out.println("Please present your papers.");
                System.out.println("Sorry that is not the correct paper work please go get a new number.");
            }
        }
        while(currNum != custNum);
    }
}
