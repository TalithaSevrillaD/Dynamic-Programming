package J07;
import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args)
    {
        int [] nominal = new int[] {5000,2000, 1000, 500, 100};
        int uang, i,jumlah, n = nominal.length;
        
        String identitas = "Talitha Sevrilla Duriga / XRPL2 / 35";
        System.out.println("Identitas: " + identitas);
        System.out.println("");
        
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan Jumlah uang: ");
        uang = baca.nextInt();
    }
    
}
