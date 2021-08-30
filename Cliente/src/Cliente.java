import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost", 4999);
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        
        while(true){
            System.out.print("..: ");
            String msg = sc.next();
            
            pr.println(msg);
            pr.flush();
            
            InputStreamReader in = new InputStreamReader(s.getInputStream());
            BufferedReader bf = new BufferedReader(in);

            String str = bf.readLine();
            System.out.println(":.. "+ str);
        }
    }
}
