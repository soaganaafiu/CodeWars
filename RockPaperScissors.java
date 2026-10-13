import java.util.Scanner;
public class Kata {
  public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Rock, Paper, Scissors: ");
        String playerOne = input.nextLine();

        System.out.print("Enter Rock, Paper, Scissors: ");
        String playerTwo = input.nextLine();
    
    
        String output = rps(playerOne, playerTwo);
        System.out.print(output);
    
  }
  
  
  
  
  
  public static String rps(String playerOne, String playerTwo) {
    
       if(playerOne.equalsIgnoreCase("scissors") && playerTwo.equalsIgnoreCase("Paper")){

            return "Player 1 won!";

        }

        else if(playerOne.equalsIgnoreCase("scissors") && playerTwo.equalsIgnoreCase("Rock")){

            return "Player 2 won!";

        }
        else if(playerOne.equalsIgnoreCase("Paper") && playerTwo.equalsIgnoreCase("Scissors")){

            return "Player 2 won!";

        }

        else if(playerOne.equalsIgnoreCase("Rock") && playerTwo.equalsIgnoreCase("scissors")){

            return "Player 1 won!";

        }
        else if(playerOne.equalsIgnoreCase("Paper") && playerTwo.equalsIgnoreCase("Rock")){

            return "Player 1 won!";

        }

        else if(playerOne.equalsIgnoreCase("Rock") && playerTwo.equalsIgnoreCase("Paper")){

            return "Player 2 won!";

        }

        else if(playerOne.equalsIgnoreCase(playerTwo)){

            return "Draw!";

        }
    
    return "Invalid";


  }
}

