import java.util.Random ;
import java.util.Scanner ;
public class Rps{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in) ;
        Random random = new Random() ;
        String[] choices = {"rock" , "paper" , "scissor"} ;
        String computerchoice ;
        String playerchoice ;
        String playagain = "yes";
        String smiley = """
                        ------
                        |^__^|
                        |    |
                         |  |
                         ----
                         """ ;

        System.out.println("******************") ;
        System.out.println("Rock-Paper-Scissor") ;
        System.out.println("******************") ;
        do
        {
            System.out.print("Enter you'r move(rock-paper-scissor): ") ;
            playerchoice = scanner.nextLine().toLowerCase() ;

            if(!playerchoice.equals("rock") && !playerchoice.equals("paper") && !playerchoice.equals("scissor"))
            {
                System.out.println("Invalid Choice!!!") ;
                continue ;
            }
            computerchoice = choices[random.nextInt(3)] ;
            System.out.println("Computer choice: " + computerchoice) ;
            if(playerchoice.equals(computerchoice))
            {
                System.out.println("TIE") ;
            }
            else if((playerchoice.equals("rock") && computerchoice.equals("scissor")) || (playerchoice.equals("paper") && computerchoice.equals("rock")) || (playerchoice.equals("scissor") && computerchoice.equals("paper")))
            {
                System.out.println("You Win!!!") ;
            }
            else
            {
                System.out.println("You lose") ;
            }
            System.out.println("Do you want to play again?(yes/no): ") ;
            playagain = scanner.nextLine().toLowerCase() ;

        }while(playagain.equals("yes")) ;

        System.out.println("\nThank you for playing") ;
        System.out.println(smiley) ;
    }
}
