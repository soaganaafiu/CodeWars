//import java.util.Scanner;
//
//    public class SquareEveryDigit{
//
//        public static void main(String[] args){
//
//            Scanner input = new Scanner(System.in);
//
//            System.out.print("Enter a number: ");
//            int number = input.nextInt();
//
//
//
//            String result = "";
//
//            while(number != 0){
//
//                int calc = number % 10;
//
//                int new_number = calc;
//
//                int squareNumber = new_number * new_number;
//
//                number = number / 10;
//
//                result = squareNumber + result;
//            }
//
//        System.out.println(result);
//
//        }
//
//    }



import java.util.Scanner;

public class SquareDigit {
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    
    int answer = squareDigits(number);
    System.out.print(answer);
  }

  static int squareDigits(int number) {

    if (number == 0){

        return 0;

    }
    

    String result = "";
    
    while(number != 0){
      
      int calc = number % 10;
      
      int new_number = calc;
      
      int squareNumber = new_number * new_number;
      
      number = number / 10;
      
      result = squareNumber + result;
    }
    
    return Integer.parseInt(result);
    
    
  }
}
