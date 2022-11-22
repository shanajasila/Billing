import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    int tea=0;
    int cofee=0;
    int iddali=0;
    int dosa=0;
    int total=0;
    Hotel(){

    }
    public int tea(int count) {
        this.tea = count * 10;
        return tea;
    }
    public int cofee(int count){
            this.cofee=count*15;
            return cofee;
    }
    public static void main(String[] args) {
        ArrayList<Hotel> or=new ArrayList<Hotel>();
        System.out.println("Enter customer name : ");
        Scanner sc=new Scanner(System.in);
        String n= sc.next();
        System.out.println("Enter phone number : ");
        String ph= sc.next();
        Hotel ht=new Hotel();
        while (true){
            System.out.println("Select from below menu :\n");
            System.out.println("\n1.Tea - 10\n2.=Coffee - 15\n3.Iddali - 8\n4.Dosa - 6\n");
            int menu= sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("How many tea you wanted ");
                    int ct= sc.nextInt();
                    ht.tea(ct);
                    System.out.println(ht.tea);
                    break;
                case 2:
                    System.out.println("How many Coffee you wanted ");
                    int cc= sc.nextInt();
                    ht.cofee(cc);
                    System.out.println(ht.cofee);
            }
        }
    }
}
