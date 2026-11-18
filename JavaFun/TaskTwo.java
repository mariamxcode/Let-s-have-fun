import java.util.Scanner;
public class TaskTwo{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int sum = 0;
int counter = 1;
while(counter <= 10){
System.out.print("Enter score: ");
int score = scanner.nextInt();
sum+=score;
counter++;
}
float average = sum /(float)counter;
System.out.printf("%.2f%n",average);
}


}
