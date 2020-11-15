import java.util.Scanner;

public class _4lv1 {
    public static int boyfrindcount(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int girlfriendcount(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
     }

    public static int boyfriend(int n) {
        if(n == 1)
            return 1;
        else if(n == 2)
            return 1;
        else
            return (boyfriend(n - 1) + boyfriend(n - 2));
    }

    public static int girlfriend(int n) {
        if(n == 1)
            return 1;
        else if(n == 2)
            return 1;
        else
            return (girlfriend(n - 1) + girlfriend(n - 2));
    }
    public static void main(String[] args) {
        System.out.println("1.需要男朋友帮忙计算累加。 2.需要女朋友帮忙计算累加。 3.需要男朋友帮我算算斐波那契数列第n项是多少。 4.需要女朋友帮我算算斐波那契数列第n项是多少");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a == 1)
        {
            System.out.println("你需要计算多少的累加");
            int number = in.nextInt();
            int sum  = boyfrindcount(number);
            System.out.println("男朋友帮你计算的累加结果为"+sum);
        }
        if(a == 2)
        {
            System.out.println("你需要计算多少的累加");
            int number = in.nextInt();
            int sum = girlfriendcount(number);
            System.out.println("女朋友帮你计算的累加结果为"+sum);
        }
        if(a == 3)
        {
            System.out.println("你需要计算斐波那契数列第几项");
            int n = in.nextInt();
            int sum = boyfriend(n);
            System.out.println("男朋友帮你计算的斐波那契数列第"+n+"项结果为"+sum);
        }
        if(a == 4)
        {
            System.out.println("你需要计算斐波那契数列第几项");
            int n = in.nextInt();
            int sum = girlfriend(n);
            System.out.println("女朋友帮你计算的斐波那契数列第"+n+"项结果为"+sum);
        }
    }
}


