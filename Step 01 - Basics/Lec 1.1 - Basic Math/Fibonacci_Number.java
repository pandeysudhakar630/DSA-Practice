public int fib(int n) {
    int one = 0;
    int two = 1;
    if(n == 0) return one;
    if(n == 1 || n == 2) return two;
    int third = 0;
    while(n-1 > 0){
        third = one + two;
        one = two;
        two = third;
        n--;
    }
    return third;
}