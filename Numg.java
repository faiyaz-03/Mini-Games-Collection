import java.util.Random ;
import java.util.Scanner ;

public class Numg{
    public static void main(String[] args)
    {
        Random random = new Random() ;
        Scanner scanner = new Scanner(System.in) ;

        int computer , player = 0;
        int tries = 0 ;
        computer = random.nextInt(1 , 101) ;
        String smiley = """
                        ------
                        |^__^|
                        |    |
                         |  |
                         ----
                         """ ;

        do
        {
            System.out.print("Enter a number(1 to 100): ") ;
            player = scanner.nextInt() ;
            if(player < 1 || player > 100)
            {
                System.out.println("Invalid Choice") ;
                continue ;
            }

            if(player > computer)
            {
                System.out.println("Too high") ;
            }
            else if(player < computer)
            {
                System.out.println("Too low") ;
            }
            else
            {
                System.out.println("Correct") ;

            }
            tries++ ;

        }
        while(player != computer) ;

        System.out.println("You have tried " + tries +" times") ;
        System.out.println("Thank you for playing") ;
        System.out.println(smiley) ;
    }
}
