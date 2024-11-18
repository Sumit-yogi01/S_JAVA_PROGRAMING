import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

public class MyServer {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream inPut = null;

    public MyServer(int port){
        try{
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("waiting for client");

            socket = server.accept();
            System.out.println("Client accepted");

            inPut = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line = " ";

            while(! line.equals("End")){
                try{
                    line =inPut.readUTF();
                    System.out.println(line);
                }
                catch(IOException i){
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");

            socket.close();
            inPut.close();
        }
        
        catch(IOException i){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        MyServer objOfMyServer = new MyServer(5000);
    }
}

