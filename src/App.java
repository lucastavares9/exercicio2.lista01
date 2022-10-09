import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    System.out.print("Digite um nuemro : ");
    Scanner sc = new Scanner (System.in); 
    double number = sc.nextDouble();
    sc.close();
    System.out.println("O numero digitado foi " + number);
            
    }
}
