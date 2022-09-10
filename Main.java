import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayimiz:");
        int a = input.nextInt();
        deneme(a);
    }
    static void deneme(int number)
    {
        int temp, ters=0;
        temp = number;
        while(temp!=0)
        {
            ters=(ters*10)+(temp%10);
            temp=temp/10;
        }
        if(ters==number)
        {
            System.out.println("Palindrom bir sayıdır.");
        }
        else
        {
            System.out.println("Palinbrom bir sayı değildir.");
        }
    }
}