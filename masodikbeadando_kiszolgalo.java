package masodikbeadando;
import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class masodikbeadando_kiszolgalo implements Runnable {

	private Socket s;
	 private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	public masodikbeadando_kiszolgalo(Socket s) {
		this.s = s;
		
	}
	@Override
	public void run() {
		
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
		    Timestamp idobelyeg = new Timestamp(System.currentTimeMillis());
			 
			String line = br.readLine();
			
			System.out.println("Kapott szoveg: " +line);
			
			FileWriter fw = new FileWriter("outputtext.txt");
			PrintWriter printWriter = new PrintWriter ("outputtext.txt");
			printWriter.println (line);
			System.out.println(sdf1.format(idobelyeg));
			printWriter.println (sdf1.format(idobelyeg));
			
			fw.close();
			br.close();
			s.close();
			printWriter.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	}


