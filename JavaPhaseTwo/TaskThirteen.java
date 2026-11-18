import java.util.Scanner;
public class TaskThirteen{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int counter = 1;
while (counter <= 10){
System.out.println("Enter score: ");
int score = scanner.nextInt();
for(int number = 1; number <= score; number++){
        if (number * number == score){
            System.out.print(score)
            }
            
}
counter++;
}
}
}
