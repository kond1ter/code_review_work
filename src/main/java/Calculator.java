public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int diff(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return (int) a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solverSichev(){
        int a = 321;
        int b = 78;

        return diff(add(a, times(a, b)), div(b, a));
    }
    public int solverNikitin(){
        int a = 10;
        int b = 5;
        return add(dif(a,b),div(times(a,b),b));
    }
}
