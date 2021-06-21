package date0621;

public class Person3 {
    private int number;
    private String name;
    private String profession;
    private int Math;
    private int Chinese;

    Person3(int number, String name, String profession, int math, int chinese){
        this.number = number;
        this.name = name;
        this.profession = profession;
        this.Math = math;
        this.Chinese = chinese;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getMath() {
        return Math;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setMath(int math) {
        Math = math;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

}
