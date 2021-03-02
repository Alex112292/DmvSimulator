import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the DMV.");
        Random rand = new Random();
        int custNum = rand.nextInt(101-1) + 1;
        System.out.println("Your number is " + custNum + ". Go wait in line until your number is called.");
        int currNum = custNum;
        do {
            currNum = currNum + 1;
            System.out.println("Number " + currNum + " please step up.");
            if(currNum == 100)
            {
                currNum = 0;
            }
            if (currNum == custNum)
            {
                System.out.println("Please present your papers.");
                int chance = rand.nextInt(101-1)+1;
                if(chance <= 99 && chance >= 0)
                {
                    System.out.println("That is not the correct paper work. Get lost. muahahahahhahaaha");
                }
                else
                {
                    System.out.println("You're all set have a nice day!");
                }
            }
        }
        while(currNum != custNum);
    }
}
