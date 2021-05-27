package date0526;

public class Practice3 {
    public static void main(String[] args){
        int age = 12;
        if (age > 0 && age <= 17)
            System.out.println("未成年");
        else if (age >= 18 && age <= 39)
            System.out.println("青年");
        else if (age >= 40 && age<=59)
            System.out.println("中年");
        else if (age >= 60 && age <= 100)
            System.out.println("老年");
        else
            System.out.println("超人");
    }
}
