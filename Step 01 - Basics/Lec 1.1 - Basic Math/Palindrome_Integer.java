public boolean isPalindrome(int n) {
    boolean status = false;
    int temp = n;
    if(n<0) return status;
    int num = 0;
    while(n!=0){
        int mod = n%10;
        num = num*10 + mod;
        n /= 10;
    }
    if(temp == num) status = true;
    return status;
}