// Sum of first n numbers and each number is the qube of its own number till the n take qube of each number and add them.

class solution{
    int sumOfSeries(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i*i*i;
        }
        return sum;
    }
}