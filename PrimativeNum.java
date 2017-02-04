/*
Jemma Tiongson
Class # 16031
Purpose: Declare/Initialize a variable using all Java primitive types
 */

class PrimativeNum{
    public static void main (String [] args){
        //use arithmetic covered in class multiply, add, subtract, mod, division
        String hello ="Hi my name is Jemma and this is a string.";
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        //multiply
        int multiply = a*b;

        //divide
        int divide = b/a;

        //mod
        int mod = b % c;

        //add
        int add = a + c;

        //subtract
        int subtract = c - b;

        boolean truth = true;
        char dollarBill = '$';
        byte byteNum = 127;
        short shortNum = 32767;
        long longNum = 9223372036854775807l;
        float floatNum = 3.40282359483057893457945f;
        double doubleNum = 1.797;

        int answer = 2;
        answer+=3;
        int num = 3;
        num-=2;
        int mult = 3;
        mult*=2;
        int div = 4;
        div/=2;
        int aPre=++a;
        int bPost=b++;
        int cPre=--c;
        int dPost=d--;

        System.out.println(hello);
        System.out.println("The value of int a is " +a);
        System.out.println("Boolean outputs either true or false \n Answer: " +truth);
        System.out.println("A byte is a primitive that can take in small numbers like " +byteNum+ ". \n and 'short' is a bit longer. For example: " +shortNum+ ".");
        System.out.println("A 'long' primitive is even larger than 'short'! It can go up to " +longNum);
        System.out.println("A float is not as precise than double. For example: " +floatNum+ " (float) VS (double) " +doubleNum);
        System.out.println("I can output " +dollarBill+ " using the variable dollarBill");
        System.out.println("What is the product of a and b? \n Answer: " +multiply );
        System.out.println("What is the value of b and a? \n Answer: " +divide );
        System.out.println("What is the remainder of b and c? \n Answer: " +mod );
        System.out.println("What is the sum of a and c? \n Answer: " +add );
        System.out.println("What is the difference of c and b? \n Answer: " +subtract );
        System.out.println("What is the new value of answer if it adds 3 to itself? \n Answer: " +answer );
        System.out.println("What is the new value of num if it subtracts 2 from itself? \n Answer: " +num );
        System.out.println("What is the new value of mult if it multiplies 3 to itself? \n Answer: " +mult );
        System.out.println("What is the new value of div if it divides 2 from itself? \n Answer: " +div );
        System.out.println("For Pre-increment, System.out.println(++a); outputs \n Answer: " +aPre );
        System.out.println("System.out.println(a); outputs \n Answer: " +a );
        System.out.println("For Post-increment,System.out.println(b++); outputs \n Answer: " +bPost );
        System.out.println("System.out.println(b); outputs \n Answer: " +b );
        System.out.println("For Pre-decrement, System.out.println(--c); outputs \n Answer: " +cPre );
        System.out.println("System.out.println(c); outputs \n Answer: " +c );
        System.out.println("For Post-decrement, System.out.println(d--); outputs \n Answer: " +dPost );
        System.out.println("System.out.println(d); outputs \n Answer: " +d );




    }
}