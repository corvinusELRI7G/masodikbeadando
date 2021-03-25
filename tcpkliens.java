package masodikbeadando;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
public class tcpkliens {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("localhost", 5678);
	
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		
		String szoveg = "Második beadandó";
		
		pw.println(szoveg);
	
		pw.flush();
		pw.close();
		s.close();
	}
}
