import java.util.Scanner;
public class TaskSeven{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int sum = 0;
int counter = 1;
int even_counter = 0;
while(counter <= 10){
System.out.print("Enter score: ");
int score = scanner.nextInt();
if(score % 2==0){
sum+=score;
even_counter++;
}
counter++;
}
float average =(float)sum / even_counter;
System.out.printf("%d, ",sum);
System.out.printf("%f%n ",average);
}


}
