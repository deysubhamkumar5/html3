import java.util.Scanner;

public class condition{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int num = sc.nextInt();
if(num >= 18){
System.out.println("Eligible for vote");
}
else{
System.out.println("Not Eligible for voting");
}
}
}
