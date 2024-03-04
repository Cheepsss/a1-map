import java.lang.Math;

class Problema1
{
    public static void main(String []args)
    {
        if(args.length != 2){
            System.out.println("The wrong number of parameters");
            return;
        }
        System.out.println("Problem 1:");
        for(int i = Integer.parseInt(args[0]); i<= Integer.parseInt(args[1]); i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
    public static boolean isPrime(int nr){
        if(nr%2==0)
            return false;
        for(int i = 3; i<= Math.sqrt(nr); i+=2){
            if(nr%i == 0){
                return false;
            }
        }
        return true;
    }
};