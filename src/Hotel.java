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

        }
    }
}
