import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();

        System.out.println("cliente connected");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        
        while(true){                
            String str = bf.readLine();
            System.out.println(":.. "+ str);
            
            System.out.print("..: ");
            
            PrintWriter pr = new PrintWriter(s.getOutputStream());
            String msg = sc.next(); 

            pr.println(msg);
            pr.flush();            
        }
    }
}
