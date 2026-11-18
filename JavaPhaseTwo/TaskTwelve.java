import java.util.Scanner;
public class TaskTwelve{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int sum = 0;
int counter = 1;
while (counter <= 10){
System.out.println("Enter score: ");
int score = scanner.nextInt();
if (score % 2 != 0 && score % 3 != 0 || score == 2){
sum+=score;
}
counter++;
}

float average =(float)sum / counter;
System.out.printf("%d, ",sum);
System.out.printf("%f%n ",average);
}
}
