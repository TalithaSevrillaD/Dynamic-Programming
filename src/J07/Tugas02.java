package J07;
import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args)
    {
        int [] kilogram = new int[] {7, 5, 4, 3, 2};
        int nominal[] = { 10000, 7000, 5000,3000, 2000};
        char [] jenis = new char [] {'E', 'B','A','D','C'};
        
        String identitas = "Talitha Sevrilla Duriga / XRPL2 / 35";
        System.out.println("Identitas: " + identitas);
        System.out.println("");
        
        Scanner baca = new Scanner (System.in);
        System.out.print("Masukkan max berat barang: ");
        int berat = baca.nextInt();
        int jumlah = 0, i, bayar = 0;
        
        for(i = 0; i < 5; i++)
        {
            jumlah = berat/kilogram[i];
            berat = berat - (kilogram[i]*jumlah);
            bayar += jumlah*nominal[i];
            char barang = jenis[i];
            
            System.out.println("Jenis barang " + barang + " berat " + kilogram[i] + " kg " + " : " + jumlah);
        }
        System.out.println("Bayaran yang didapat : " + bayar);
    }
    
}
