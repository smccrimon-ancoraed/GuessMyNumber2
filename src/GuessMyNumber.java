import java.util.Scanner;

/*
need comments here

 */
class PrintInstruction {

    public void displayInstruction() {

        // type in some instructions
        System.out.println("put the rules here");
        System.out.println("put the rules here");
        System.out.println("put the rules here");


    }
}

// need comments

public class GuessMyNumber {

    final static int NUMMAX = 9999;

    /*
      Function:  guessNumber()
      Returns the number the user enters
      We use a guess less than zero to quit unless we guess the number
     */


    // Generate a random number from 1 to nummax
    public int pickTheNumber(int nummax) {

        return (int) (Math.random() * nummax + 1);

    }


    public static void main(String[] args) {

        int numtrys = 0;
        int myguess;
        GuessMyNumber theNumber = new GuessMyNumber();
        int thepick = theNumber.pickTheNumber(NUMMAX);

        boolean inProcess = true;
        PrintInstruction obj = new PrintInstruction();
        obj.displayInstruction();
        // Testing
        System.out.println("hint: I picked "+thepick+"\n\n");
        Scanner inpDevice = new Scanner(System.in);

        do {
            numtrys++;
            System.out.print("Enter -1 to quit or guess a number ? ");
            myguess = inpDevice.nextInt();
            System.out.println();

            if ((myguess < 0) || (myguess == thepick)) {
                inProcess = false;
            }
            else {
                if (myguess > thepick) {
                    System.out.println(myguess + " is too high, try again.");
                }
                if (myguess < thepick) {
                    System.out.println(myguess + " is too low, try again.");
                }
            }
        } while (inProcess);

        // Check if got it
        if (myguess == thepick) {
            System.out.println("You got it in "+numtrys+ " tries.\n");
            System.out.println("to guess my number "+thepick);
        }
        else
        {
            System.out.println("Sorry you didn't guess it in "+numtrys);
            System.out.println();
        }

    }



}
