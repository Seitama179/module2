import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("demo.txt");
            writer.write("hello!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
