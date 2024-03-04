import java.lang.Math;


class Problema3
{
    public static void main(String []args)
    {
        if(args.length < 1){
            System.out.println("Not enough parameters");
            return;
        }
        if(args.length == 1) {
            System.out.println(args[0]);
            return;

        }
        int result = gcd(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        for(int i = 2; i<args.length; i++){
            result = gcd(result, Integer.parseInt(args[i]));
        }
        System.out.println(result);


        
    }

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, Math.abs(a - b));
    }
};