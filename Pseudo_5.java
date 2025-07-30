public class Pseudo_5 {
    public static void main(String[] args){
        int a = 10;
        int b = 10;
        System.out.println(fun(a,b));
    }
    public static int fun(int a,int b){
        int c;
        for(int i=2;i<5;i++){
            if(a%2 < b%3) a = 4 % 3;
            else{
                if(5 % 3 > b) a = b;
                b=1;
            }
        }
        return a+b;
    }
}
