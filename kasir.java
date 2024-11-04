package latihanarray;
import java.util.Scanner;
public class kasir {
    public static void main(String[] args) {
        String belanja[] = new String [5];
        int harga[] = new int [5];
        int jumlah[] = new int [5];
        int total[] = new int [5];
        Scanner sc = new Scanner (System.in);
        int pilih=0,item=0,jum=0;
        double grandtotal=0  ;
        
         System.out.println("Kasir Toko Kita");
         System.out.println("1.Tas [100.000]\n2.Sepatu[150.000]\n3.Sandal[50.000]\n4.Baju[75.000]\n5.Jaket[200.000]\n6.Selesai");

        do{
            System.out.print("Pilih = ");
            pilih=sc.nextInt();
           
            switch(pilih){
                case 1:
                    System.out.println("TAS");
                    if(item<belanja.length){
                    belanja[item]="Tas";
                     harga[item]= 100000;
                        System.out.println("Harga = "+harga[item]);
                        System.out.print("Jumlah = ");
                     jum=sc.nextInt();
                    jumlah[item]=jum;
                     total[item] = harga[item]*jumlah[item];
                        System.out.println("Total = Rp. "+total[item]);
                    }
                    else System.out.println("Keranjang Penuh!");
                    break;
                case 2:
                    System.out.println("SEPATU");
                     if(item<belanja.length){
                     belanja[item]="Sepatu";
                      harga[item]=150000;
                     System.out.println("Harga = "+harga[item]);
                         System.out.print("Jumlah = ");
                     jum=sc.nextInt();
                    jumlah[item]=jum;
                     total[item] = harga[item]*jumlah[item];
                     System.out.println("Total = Rp. "+total[item]); 
                     }
                       else System.out.println("Keranjang Penuh!");
                     break;
                case 3:
                    System.out.println("SANDAL");
                     if(item<belanja.length){
                     belanja[item]="Sandal";
                      harga[item]=50000;
                     System.out.println("Harga = "+harga[item]);
                      System.out.print("Jumlah = ");
                     jum=sc.nextInt();
                    jumlah[item]=jum;
                     total[item] = harga[item]*jumlah[item];
                     System.out.println("Total = Rp. "+total[item]);
                     }
                       else System.out.println("Keranjang Penuh!");
                     break;
                case 4:
                    System.out.println("BAJU");
                     if(item<belanja.length){
                     belanja[item]="Baju";
                      harga[item]=750000;
                     System.out.println("Harga = "+harga[item]);
                     System.out.print("Jumlah = ");
                      jum=sc.nextInt();
                    jumlah[item]=jum;
                     total[item] = harga[item]*jumlah[item];
                     System.out.println("Total = Rp. "+total[item]);
                     }
                       else System.out.println("Keranjang Penuh!");
                     break;
                case 5:
                    System.out.println("JAKET");
                     if(item<belanja.length){
                     belanja[item]="Jaket";
                       harga[item]=200000;
                     System.out.println("Harga = "+harga[item]);
                     System.out.print("Jumlah = ");
                      jum=sc.nextInt();
                    jumlah[item]=jum;
                     total[item] = harga[item]*jumlah[item];
                     System.out.println("Total = Rp. "+total[item]);
                     }
                       else System.out.println("Keranjang Penuh!");  
                     break;
                case 6:
                    System.out.println("=======================");
                    System.out.println("Daftar Belanja");
                    System.out.println("No\titem\t\tharga\t\tQty\t\ttotal");
                    System.out.println("");
                    for (int i = 0; i<item; i++) {
                        System.out.print((i+1)+"\t"+belanja[i]);
                        System.out.print("\t\t["+harga[i]+"]");
                        System.out.print("\t["+jumlah[i]+"]");
                        System.out.print("\t\t[Rp. "+total[i]+"]");
                        System.out.println("");
                        System.out.println("");
                     System.out.println("==========================");
                     grandtotal += total[i];
                     System.out.println("TOTAL BELANJA = Rp. "+grandtotal);
                    }
                    
                     break;
            }
            item++;
            
            if (item>5)
                item=5;
            
        }while(pilih!=6);
        
    }  
}
