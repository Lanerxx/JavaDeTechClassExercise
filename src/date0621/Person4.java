package date0621;

public class Person4 implements Comparable<Person4>{
    private int number;

    public Person4(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Person4 o){
        return this.number < o.getNumber() ? -1 : (this.number == o.getNumber()) ? 0 : 1;
    }
}
