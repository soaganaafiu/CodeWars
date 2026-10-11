import java.util.Scanner;

public class YesOrNo{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a true or false: ");
        boolean b = input.nextBoolean();

        String answer = boolToWord(b);
        System.out.print(answer);



}


    public static String boolToWord(boolean b){

        if(b == true){

            return "Yes";

        }

            return "No";


    }

}
