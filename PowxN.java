class PowxN {
    public double myPow(double x, int n) {
       
       if(n==Integer.MIN_VALUE)
       {
            x=1/x;
            n=Integer.MAX_VALUE;
            return myPow(x,n)*x;
       }
       if(n<0)
       {
            x=1/x;
             n=-n;
       }
       if(n==0)
       {
        return 1.0;
       }
       double mid=myPow(x,n/2);
       mid=mid*mid;

       if(n%2==0)
       {
            return mid;
       }
       else
       {
            return mid*x;
       }
    }
}