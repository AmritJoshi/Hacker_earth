import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int g=0;
            for(int j=l;j<=r;j++){
                if((gcd(j,sum(j)))>1){
                    g++;
                }
            }
            System.out.println(g);
        }


    }

    public static int sum(int j){
        String hex=Integer.toHexString(j);
        int sum=0;
        for(int i=0;i<hex.length();i++){
            char c= hex.charAt(i);
            if(Character.isLetter(c)){
                switch(c){
                    case 'a':sum+=10;
                        break;
                    case 'b':sum+=11;
                        break;
                    case 'c':sum+=12;
                        break;
                    case 'd':sum+=13;
                        break;
                    case 'e':sum+=14;
                        break;
                    case 'f':sum+=15;
                        break;
                }
            }
            if(Character.isDigit(c)){
                int num=Integer.parseInt(String.valueOf(c));
                sum+=num;
            }
        }
            return sum;
    }

  public static int gcd(int a,int b){
      if(a==0){
          return b;
      }
      if(b==0){
          return a;
      }
    return gcd(b,a%b);
  }
}
