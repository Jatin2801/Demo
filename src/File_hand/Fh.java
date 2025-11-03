package File_hand;

import java.io.*;

public class Fh {
    public static void main(String[] args) throws IOException {

        // Writing and creating file
        
        // File file = new File("file.txt");
        // FileWriter fw = new FileWriter(file,true);
        // fw.write("My name is Jatin");
        // fw.flush();
        // fw.close();

        // BufferedWriter
        File fi = new File("file.txt");
            FileWriter fw = new FileWriter(fi, true); // 'true' means append mode
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("My name is Jatin");
            bw.newLine();
            bw.write("I am from MP");
            bw.flush();
            bw.close();

        // reading from file

        File file = new File("file.txt");
        FileReader fr = new FileReader(file);

        int myChar = -1;
        while ((myChar = fr.read()) != -1) {
            System.out.print((char)myChar);
        }
        System.out.println();
        fr.close();

        
    }
}