import java.util.Scanner;
public class TaskOne{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int sum = 0;
for(int number = 1; number <=10;number++){
System.out.print("Enter score: ");
int score = scanner.nextInt();
sum+=score;
}
System.out.print(sum);
System.out.println();

}


}
