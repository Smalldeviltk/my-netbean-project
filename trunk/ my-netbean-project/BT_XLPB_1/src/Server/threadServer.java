package Server;

import java.io.*;
import java.net.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class threadServer extends Thread {

    Socket socket = null;

    public threadServer(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String inLine;
            while (true) {
                inLine = in.readLine();
                Calendar cal = new GregorianCalendar();
                if (inLine.equalsIgnoreCase("quit")) {
                    break;
                } else {
                    out.println(daochuoi(inLine));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đảo chuỗi
    public String daochuoi(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return daochuoi(str.substring(1, (str.length()))) + str.substring(0, 1);
        }
    }
}
