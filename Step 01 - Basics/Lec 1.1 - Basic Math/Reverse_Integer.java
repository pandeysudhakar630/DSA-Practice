public int reverse(int n) {
    int num = 0;
    while(n!=0){
        int mod = n%10;
        if(num>Integer.MAX_VALUE/10 || num==Integer.MAX_VALUE/10 && mod>7) return 0;
        if(num<Integer.MIN_VALUE/10 || num==Integer.MIN_VALUE/10 && mod<-8) return 0;
        num = num*10 + mod;
        n /= 10;
    }
    return num;
}