/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testnio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestNIO {

    static final String fileName = "C:\\Users\\Small\\Desktop\\demo.txt";
    public static void main(String[] args) throws IOException {
        // using BufferedReader, to read line by line
        readUsingBufferedReader(fileName);
       // writeUsingFileChannel(fileName);
    }
        
    private static void readUsingBufferedReader(String fileName)
        throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            // process the line
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
    
    private static void writeUsingFileChannel(String fileName) throws FileNotFoundException, IOException{
        FileOutputStream fout = new FileOutputStream(fileName);
        FileChannel fchan = fout.getChannel();
        String content = "Smalldevil";
        byte[] data = content.getBytes();
        ByteBuffer buff = ByteBuffer.allocateDirect( data.length);
        for(int i=0; i<data.length; i++){
            buff.put(data[i]);
        }
        buff.rewind();
        fchan.write(buff);
        fchan.close();
        fout.close();
    }
}
