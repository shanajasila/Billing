import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    int tea=0;
    int cofee=0;
    int iddali=0;
    int dosa=0;

    int snack=0;

    int total=0;


    Hotel(){

    }
    public static int tea(int count) {

      int tea = count * 10;
        return tea;
   }
    public static int cofee(int count){
            int cofee=count*15;
            return cofee;
    }
    public int iddali(int count){
        this.iddali=count*8;
        return iddali;
    }
    public int dosa(int count){
        this.dosa=count*6;
        return dosa;
    }
    public int snack(int count){
        this.snack=count*10;
        return snack;
        }

   public int bill(int count){
        this.total=tea+cofee+iddali+dosa+snack;
        return total;
    }
    public static void main(String[] args) {
        ArrayList<Hotel> or=new ArrayList<Hotel>();
        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("Select from below menu :\n");
            System.out.println("\n1.Tea - 10\n2.=Coffee - 15\n3.Iddali - 8\n4.Dosa - 6\n5.Snacks - 10\n6.Generate bill\n7.View all Transaction");
            int menu= sc.nextInt();
            Hotel ht=new Hotel();
            switch (menu){
                case 1:
                    System.out.println("How many tea you wanted ");
                    int ct= sc.nextInt();
                   ht.tea(ct);

                    break;
                case 2:
                    System.out.println("How many Coffee you wanted ");
                    int cc= sc.nextInt();
                    ht.tea(cc);

                    break;
                case 3:
                    System.out.println("How many Iddali you wanted ");
                    int ci= sc.nextInt();
                    ht.tea(ci);

                    break;
                case 4:
                    System.out.println("How many Dosa you wanted ");
                    int cs= sc.nextInt();
                    ht.tea(cs);

                    break;
                case 5:
                    System.out.println("How many snacks you wanted ");
                    int csn= sc.nextInt();
                    ht.tea(csn);

                    break;
                case 6:
                    System.out.println("Enter customer name : ");
                    String n= sc.next();
                    System.out.println("Enter phone number : ");
                    String ph= sc.next();
                    System.out.println(ht.total);

            }
        }
    }
}
