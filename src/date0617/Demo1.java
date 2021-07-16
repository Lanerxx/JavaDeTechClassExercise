package date0617;


public class Demo1 {

    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer("Hello");
        StringBuffer buffer3 = new StringBuffer(10);

        StringBuilder builder = new StringBuilder();


        buffer2.append("java").append(100);


        buffer2.insert(5,",");

        buffer2.delete(5,buffer2.length());

//        buffer2.reverse();

        String str = buffer2.toString();

        buffer2.setCharAt(1,'a');

        System.out.println(buffer2.toString());
//        System.out.println(str);
    }

}
