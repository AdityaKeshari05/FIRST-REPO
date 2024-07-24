import java.util.*;

public class first {
    public static void CheckPrime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print("Pime");
        }else{
            System.out.print("Not Prime");

        }
    }

    public static void Calculator(int a, int b ){
        Scanner vm = new Scanner(System.in);

        int operator = vm.nextInt();
       

        int result = 0;
        switch(operator){
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if(b==0){
                    System.out.print("invallid number");
                }else{
                    result = a/b;

                }
                
            }
        System.out.println(result);

    }
        public static void PrintFact(int num ) {
        int fact = 1;
        for(int i = num; i>=1;i--){
            fact = fact*i;
           

        }
        System.out.println(fact);
    }
       public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        
        int n= sc.nextInt();
        
        CheckPrime(n);


    }

    
}

