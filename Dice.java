import java.util.Random ;
import java.util.Scanner ;

public class Dice {
    public static void main(String[] args)
    {
        int numofDice1 , numofDice2 ,  total1 = 0 , total2 = 0 ;
        Scanner scanner = new Scanner(System.in) ;
        Random random = new Random() ;

        System.out.println("*************") ;
        System.out.println("Dice Roll Game") ;
        System.out.println("*************") ;

        System.out.print("Enter the # of dice to roll(Player 1) : ") ;
        numofDice1 = scanner.nextInt() ;

        System.out.print("Enter the # of dice to roll(Player 2) : ") ;
        numofDice2 = scanner.nextInt() ;

        if(numofDice1 > 0)
        {
            for(int i = 0 ; i < numofDice1 ; i++)
            {
                int roll = random.nextInt(1 , 7) ;
                System.out.printf("You have rolled: %d\n" , roll);
                printDice(roll) ;
                total1 += roll ;
            }
        }
        else
        {
            System.out.println("# of dice should be greater than 0") ;
        }


          if(numofDice2 > 0)
        {
            for(int i = 0 ; i < numofDice2 ; i++)
            {
                int roll = random.nextInt(1 , 7) ;
                System.out.printf("You have rolled: %d\n" , roll);
                printDice(roll) ;
                total2 += roll ;
            }
        }
        else
        {
            System.out.println("# of dice should be greater than 0") ;
        }

        if(total1 == total2)
        {
            System.out.println("player-1 = " + total1 + "\nplayer-2 = " + total2) ;
           if(numofDice1 == numofDice2)
           {
             System.out.println("Player-1 and player-2 tied\nPlayer-1 and player-2 rolled " + numofDice1) ;
           }
           else if(numofDice1 > numofDice2)
           {
             System.out.println("Player-2 is the winner\nPlayer-1 rolled " + numofDice1 + " \nPlayer-2 rolled " + numofDice2) ;
           }
           else{
             System.out.println("Player-1 is the winner\nPlayer-1 rolled " + numofDice1 + " \nPlayer-2 rolled " + numofDice2) ;
           }
        }
        else if(total1 > total2)
        {
            System.out.println("player-1 = " + total1 + "\nplayer-2 = " + total2) ;
            System.out.println("Player-1 is the winner") ;
        }
        else
        {
            System.out.println("player-1 = " + total1 + "\nplayer-2 = " + total2) ;
            System.out.println("Player-2 is the winner") ;
        }
        scanner.close() ;

    }
    static void printDice(int roll)
    {
        String dice1 = """
                        -----
                       |     |
                       |  ●  |
                       |     |
                        -----
                       """ ;

        String dice2 = """
                        -----
                       | ●   |
                       |     |
                       |   ● |
                        -----
                       """ ;

        String dice3 = """
                        -----
                       | ●   |
                       |   ● |
                       |    ●|
                        -----
                       """ ;

        String dice4 = """
                        -----
                       |●   ●|
                       |     |
                       |●   ●|
                        -----
                       """ ;

        String dice5 = """
                        -----
                       |●   ●|
                       |  ●  |
                       |●   ●|
                        -----
                       """;

        String dice6 = """
                        -----
                       |●   ●|
                       |●   ●|
                       |●   ●|
                        -----
                       """;

      switch(roll)
      {
        case 1 -> System.out.print(dice1) ;
        case 2 -> System.out.print(dice2) ;
        case 3 -> System.out.print(dice3) ;
        case 4 -> System.out.print(dice4) ;
        case 5 -> System.out.print(dice5) ;
        case 6 -> System.out.print(dice6) ;
      }
    }
}
