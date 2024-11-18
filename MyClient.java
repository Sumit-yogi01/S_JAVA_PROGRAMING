
import java.net.*;
import java.io.*;


public class MyClient{
    private Socket socket = null;
    private BufferedReader input = null;
    private DataOutputStream output = null;

    public MyClient(String address , int port){
        try{
            socket =new Socket(address, port);
            System.out.println("Connected");

            input = new BufferedReader(new InputStreamReader (System.in));

            output = new DataOutputStream(socket.getOutputStream());
    
        }
        catch(UnknownHostException u){
            System.out.println(u);
        }
        catch(IOException i){
            System.out.println(i);
        }
        String line = "";

        while (! line.equals("End")) {
            try{
                line = input.readLine();
                output.writeUTF(line);
            } 
            catch(IOException i){
                System.out.println(i);
            } 
        }
            try{
                input.close();
                output.close();
                socket.close();
            }          
            catch(IOException i){
                System.out.println(i);
            }
        }

    public static void main(String[] args){
    
        MyClient objOfMyClient = new MyClient("127.0.0.1", 5000);
      
    }
}
