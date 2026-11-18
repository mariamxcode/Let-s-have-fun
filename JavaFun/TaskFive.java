import java.util.Scanner;
public class TaskFive{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int sum = 0;
int counter = 1;
while(counter <= 10){
System.out.print("Enter score: ");
int score = scanner.nextInt();
if(score % 2==0){
sum+=score;
}
counter++;
}
System.out.printf("%d%n",sum);
}


}
