class Problema2
{
    public static void main(String []args)
    {
        if(args.length < 1){
            System.out.println("Not enough parameters");
            return;
        }
        double maximum = 0;
        double aux;
        for(int i = 0; i<args.length; i++){
            aux = Double.parseDouble(args[i]);
            if (aux > maximum){
                maximum = aux;
            }
        }
        System.out.println(maximum);
    }
};