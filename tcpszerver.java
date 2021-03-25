package masodikbeadando;
import java.io.IOException;
import java.net.*;
import java.io.*;

public class tcpszerver {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(5678);
		
		while(true) {
			
			new Thread (new masodikbeadando_kiszolgalo(ss.accept())).start();		
		}
	}
}
