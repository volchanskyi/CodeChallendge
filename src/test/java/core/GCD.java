package core;

    import java.util.Scanner;

    public class GCD {

        public static void main(String[] args) {
    	int p, q;

    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter two numbers :");
    	p = sc.nextInt();
    	q = sc.nextInt();
        sc.close();
    	int gcd = 0;
    	while (q != 0) {
    	    gcd = q;
    	    q = p % q;
    	    p = gcd;
    	}

    	System.out.println("GCD is :" + gcd);

        }
    }
