import java.util.Scanner;
public class TaskNine{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int sum = 0;
int counter = 1;
while(counter <= 10){
System.out.print("Enter score: ");
int score = scanner.nextInt();
if(score >=0 && score<=100){
  sum+=score;
  
}
counter++;
}
System.out.printf("%d, ",sum);
}


}
