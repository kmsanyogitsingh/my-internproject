import java.util.Random;
import java.util.Scanner;
public class RandomNumber{
public static void main(String[]args){
int answer,guess;
final int MAX=5;
Scanner keyboard=new Scanner(System.in);
Random rand=new Random();
answer = rand.nextInt(MAX)+1;
System.out.print("Guess a Number between 1and 5:");
guess=keyboard.nextInt();
if(guess==answer){
System.out.println("Goodjob,the number was" + answer);
}
else{
System.out.println("Sorry,but the number was "+answer);
}
}
}
