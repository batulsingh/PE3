import java.io.*;

public class Ex9 {
    public static void main(String[] args) throws IOException {
        File path = new File("FileDemo.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String firstLine = reader.readLine();
        reader.close();
        String str = firstLine.toUpperCase();
        int length = str.length();
        System.out.println(str+"\n"+"Number of characters : " + length);
    }
}
