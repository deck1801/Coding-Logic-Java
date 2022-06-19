package Recursion;

public class rec1 {
    public static void main(String args[]){
        //Recursion is the repersentation of loops
        /*
         * Function that call itself
         * Solving larger problem by smaller part of problem
         * 
         */
        System.out.println("Recursion Example 1: ");
        pnum(5);
        System.out.println();
        System.out.println(); 
        System.out.println("Recursion Example 2: ");
        pnumf(5);
        System.out.println();
        System.out.println();
        System.out.println("Recursion Example 3: ");
        System.out.println("Sum of n Natural Numbers: "+ sumofnatural(5));  
        System.out.println();
        System.out.println("Recursion Example 4: ");
        System.out.println("Factorial of a number: "+factorial(5));
        System.out.println();
        System.out.println("Recursion Example 5: ");
        System.out.print("Fibonacci Sequence:  ");
        System.out.print(0+" ");
        System.out.print(1+" ");
        fibonacci(0, 1, 3);
        System.out.println();
        System.out.println();
        System.out.println("Recursion Example 6: ");
        System.out.println("The exponent: "+exponent(2, 4));
        System.out.println();
        System.out.println("Recursion example 7: ");
        System.out.println("The Exponent Optimized: "+exponent2(2,4));
        System.out.println();
    }
    
    static void pnum(int num){
        //base condition
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        pnum(num-1);
    }
    
    static void pnumf(int num){
        if(num==0){
            return;
        }
        pnumf(num-1);
        System.out.print(num+" ");
    }
    
    static int sumofnatural(int num){
        if(num==0){
            return 0;
        }
        return sumofnatural(num-1)+num;
    }
    
    static int factorial(int num){
        if(num==0){
            return 1;
        }
        return factorial(num-1)*num; 
    }
    
    static void fibonacci(int f1,int f2,int num){
        if(num==0){
            return;          
        }
        int f3=f1+f2;
        System.out.print(f3+" ");
        fibonacci(f2, f3, num-1);
    }
    
    static int exponent(int n,int pow){
        if(pow==0){
            return 1;
        }
        return exponent(n, pow-1)*n;
    }
    
    static int exponent2(int n,int pow){
        if(n==0){
            return 0;
        }
        if(pow==0){
            return 1;
        }
        if(n%2==0){
            return exponent(n, pow/2)*exponent(n, pow/2);
        }else{
            return exponent(n, pow/2)*exponent(n, pow/2)*n
;        }
    }
}
