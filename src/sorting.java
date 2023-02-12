import java.util.Scanner;
public class sorting {
    public static void main (String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a= inp.nextInt();
        System.out.println("İkinci sayyı giriniz : ");
        int b= inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz : ");
        int c=inp.nextInt();
        if (a > b && a>c) {
            if (b>c){
                System.out.print("a="+a+">b="+b+">c="+c);
            }else {
                System.out.print("a="+a+">c="+c+">b="+b);
            }
        }else if (b>a && b>c){
            if (a>c){
                System.out.print("b="+b+">a="+a+">c="+c);
            }
            else{
                System.out.print("b="+b+">c="+c+">a="+a);
            }
        } else if (c>a && c>b) {
            if (a>b){
                System.out.print("c="+c+">a="+a+">b="+b);
            }
            else{
                System.out.print("c="+c+">b="+b+">a="+a);
            }
        }
    }
}
