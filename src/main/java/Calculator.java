public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b) {
        if (b == 0) throw  new IllegalArgumentException();
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        int a = 10;
        int b = 5;
        return add(dif(a,b),div(times(a,b),b)) ;
    }
}
