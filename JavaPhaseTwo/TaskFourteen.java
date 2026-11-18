import java.util.Scanner;
public class TaskFourteen{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int sum = 0;
int counter = 1;
while (counter <= 10){
System.out.println("Enter score: ");
int score = scanner.nextInt();
for(int number = 1; number <= score; number++){
        if (number * number == score){
            sum+=score
            }
            
}
counter++;
}
float average =(float)sum / counter;
System.out.printf("%d, ",sum);
System.out.printf("%f%n ",average);
}
}
