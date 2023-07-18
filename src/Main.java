import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int P=scanner.nextInt();
        A=A%P;
        int result=1;
        for(int i=1;i<=B;i++)
        {
            result=(result*A)%P;
        }
        System.out.println(result);
    }
}