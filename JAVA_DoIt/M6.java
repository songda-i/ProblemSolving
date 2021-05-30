// import java.util.Scanner;
class A {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // scanner.nextInt();
        System.out.println();
        int n = 2;
        int i = 1;
        while(true) {
            if (n%2==1) {
                n++;
                continue;
            }
            System.out.println(n+"*"+i+"="+n*i++);
            if (i == 10) {
                i = 1;
                n++;
            }
            
            if (n == 9)
            break;
        }


    }
}