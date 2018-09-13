package hitungfibonacci;
import java.util.Scanner;
public class HitungFibonacci {
    public static void tampilJudul (String identitas) 
    {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main (String[] args)
    {
        String identitas = "Talitha Sevrilla Duriga / XRPL2 / 35";
        tampilJudul(identitas);
        
        int n = tampilInput();
    }
    public static int tampilInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan ke-:");
        int n = scanner.nextInt();
        
        return n;
    }
    
}
