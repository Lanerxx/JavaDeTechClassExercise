package date0608;

public class Practice03 {
    public static void main(String[] args) {
        Son son1 = new Son("name1", 18, '男',"school1");
        System.out.println(son1.name);
        System.out.println(son1.age);
        System.out.println(son1.gender);
        System.out.println(son1.school);

        Son son2 = new Son("school2");
        System.out.println(son2.name);
        System.out.println(son2.age);
        System.out.println(son2.gender);
        System.out.println(son2.school);
    }
}