package exception;

import java.io.*;

public class CheckedIoexception {
    public static void main(String[] args) {
        try {
            
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }

        System.out.println("Program continues...");
    }
}

