package Client;

import java.io.*;
import java.net.*;

public class client {

    public static void main(String[] arg) throws Exception {
        Socket cSk = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            //khoi tao socket
            cSk = new Socket("127.0.0.1", 9999);
            
            //dua chuoi len server
            out=new PrintWriter(cSk.getOutputStream(),true);
            
            //nhan chuoi gui tu server
            in=new BufferedReader(new InputStreamReader(cSk.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}