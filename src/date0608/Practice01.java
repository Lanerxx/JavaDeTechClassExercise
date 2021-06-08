package date0608;

public class Practice01 {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println(calculate.add(100, 90));
        System.out.println(calculate.add(12.3, -34.2));
        System.out.println(calculate.add('h', 'a'));
    }
}

class Calculate{
    int add(int a, int b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
    String add(char a, char b){
        return String.valueOf(a) + String.valueOf(b);
    }
}

