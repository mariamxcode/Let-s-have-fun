import java.util.Scanner;
public class TaskEleven{
  public static void main(String...args){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int counter = 1;
    int primeNumber = 0;
    
    while (counter <= 10){
      System.out.print("Enter score: ");
      int score = scanner.nextInt();
      
      for(int number = 2; number < score; number++){
        if (score % number == 0){
          continue;
        }
      }
      
      primeNumber = score;
      System.out.println(primeNumber);
      //primeNumber = 0;
      counter+=1;
   }
  }
}

