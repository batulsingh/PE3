import java.io.*;

public class Ex11 {
    public static void main(String[] args) throws IOException {
        File path =new File("FileDemo.txt");
        System.out.println("We got a file:"+path);

        System.out.println("Does it exists?" +path.exists());
        System.out.println("Check?"+path.isDirectory());

               // String contentsToWrite = "i am a man ,\n" + "i like to sleep ,\n" + "i have a home.";

                //OutputStream outStream = new FileOutputStream(path); outStream.write(contentsToWrite.getBytes());
                //outStream.close();

                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
                String firstLine = reader.readLine();
                reader.close();
                System.out.println("Read a line :" + firstLine);


    }
}
