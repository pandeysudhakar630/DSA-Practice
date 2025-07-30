
class lamAndGcd{
    public static int computeGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    // Method to compute LCM using the formula LCM = (a*b)/GCD
    public static int computeLCM(int gcd, int a, int b){
        return (a*b)/gcd;
    }
    public static int[] lcmAndGcd(int a, int b){
        int gcd = computeGCD(a, b);
        int lcm = computeLCM(a, b, gcd);
        return new int[]{lcm, gcd};
    }
}

