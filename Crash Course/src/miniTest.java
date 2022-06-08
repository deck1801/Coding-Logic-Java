import java.util.Scanner;

public class miniTest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;
        int ran=(int)(Math.random()*100);
        do{
            System.out.println("Guess The Number");
            choice=sc.nextInt();
            if(choice<ran){
                System.out.println("Go For Larger Number");
            }else if(choice>ran){
                System.out.println("Go For Smaller Number");
            }else if(choice==ran){
                System.out.println("You Got it.......");
            }
        }while(choice!=ran);
        sc.close();
    }
}
