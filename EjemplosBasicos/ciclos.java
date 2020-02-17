import java.util.Scanner;

public class ciclos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese cuando dinero tiene:");
        Scanner scanner = new Scanner(System.in);
        int monedas = scanner.nextInt();
        System.out.println("Tiene Q. " + monedas);
    }  
}