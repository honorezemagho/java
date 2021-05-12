import java.util.Scanner;

public class ControlFlow {

    public static void statement(){
            System.out.println("Pick a number between 1 and 10: ");
            Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt();

        if(inputNum < 5){
            System.out.println("Enjoy the good luck a friend brings you");
        }
        else{
            // System.out.println("Your shoe selection will make you very happy today");
        }
    }

    public static void isPlaying(){
        boolean isOnRepeat = true;
        Scanner input = new Scanner(System.in);
        while(isOnRepeat){
            System.out.println("Playing the current song");
            System.out.println("Would you like to take this song off of repeat? If so answer yes");
            String userInput = input.next();

            if(userInput.toLowerCase().equals("yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("Playing the next song");
    }

    public static void multipleChoice(){
        Scanner input = new Scanner(System.in);
       
        String answer1 = "Google Chrome";
        String answer2 = "Firefox";
        String answer3 = "Internet Explorer";

        String question = "What is default browser of the linux operating system Ubuntu? \n Choose a number between 1 and 3. \n 1." + answer1 + "\n 2."+answer2+" \n 3."+answer3;

        int GoodAnswer = 2;

        System.out.println(question);
        System.out.print("Answer: ");
        
        int userInput = input.nextInt();

        if(userInput == GoodAnswer){
            System.out.println("Congratulations. You've got it right");
        }
        else{
            System.out.println("Oh no. You fail it. The answer was 2." + answer2);
        }
        input.close();
    }

    public static void main(String[] args) {
    
        statement();
        isPlaying();
        multipleChoice();
    }
}
