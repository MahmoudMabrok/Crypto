import java.util.Scanner;

/**
 * v1.0
 *
 * Created by mo3tamed on 8/27/17.
 */
public class Test {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n  , input ;


        for(;;) {

            System.out.println("Enter Text ");
            String s = in.next();
            System.out.println("enter n of encryption ");
            n = in.nextInt();
            do {

                System.out.println("1- encrypt text ");
                System.out.println("2- decrypt text ");
                System.out.println("3- exit ");
                input = in.nextInt();

                switch (input) {
                    case 1:
                        s = Main.caeserify(s, n) ;
                        System.out.println(s);
                        break;
                    case 2:
                        s= Main.decaeserify(s, n) ;
                        System.out.println(s);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Error ,Joke with me  ??  ");

                }
            } while (input != 3);
        }

    }


}
