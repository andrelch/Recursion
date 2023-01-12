public class Main {

    public int factorial(int n){
        if (n <= 1) {
            return 0;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int fibonacci(int n){
        if (n <= 1) {
            return 0;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public int chomp(int c1, int c2, int c3){

        if (c1 > 3 && c2 > 3 && c3>3) {
            return 0;
        } else {
            return chomp(c1+1,c2+1,c3+1);
            /*if (c2 > 3) {
                return 0;
            } else {
                return c2++;
                if (c3 > 3) {
                    return 0;
                } else {
                    return c3++;
                }
            }*/
        }

    }


    public static void main(String[] args){
        int num = 10;

        Main factorial = new Main();
        Main fibonacci = new Main();
        Main chomp = new Main();

        System.out.println(num + " factorial: " + factorial.factorial(num));
        System.out.println(num + "th fibonacci: " + fibonacci.fibonacci(num-4));
        System.out.println(chomp.chomp(1,0,0));
    }
}