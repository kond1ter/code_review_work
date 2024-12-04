public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return (int) a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        int a = 321;
        int b = 78;

        return diff(add(a, times(a, b)), div(b, a));
    }
}
