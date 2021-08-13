public static int powerSum(int X, int N) {
    // Write your code here
        int k=1;
        int func=Fun(X,N,k);
        return func;
    }
    static int Fun(int X,int N,int k){
        int var=(int)Math.pow(k,N);
        if(var==X){
            return 1;
        }
        if(var>X){
            return 0;
        }
        return Fun(X-var,N,k+1)+Fun(X,N,k+1);
        
    }
