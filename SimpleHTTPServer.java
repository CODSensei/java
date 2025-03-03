//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleHTTPServer {

  //Basic HTTP Server

  //public static void main(String[] args) throws Exception {
  //  final ServerSocket server = new ServerSocket(8080);
  //  System.out.println("Listening for connection on port 8080 ...");
  //  while(true){
  //    final Socket client = server.accept();
  //    //Read HTTP request from the client socket 
  //    //Prepare an HTTP response 
  //    //Send HTTP response to the client 
  //    //Close the socket
  //  }
  // }

  //What browser sends when we make a request

  //public static void main(String args[]) throws IOException {
  //  ServerSocket server = new ServerSocket(8080);
  //  System.out.println("Listening for connection on port 8080 ...");
  //  while(true) {
  //  Socket clientSocket = server.accept();
  //  InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
  //  BufferedReader reader = new BufferedReader(isr);
  //  String line = reader.readLine();
  //  while(!line.isEmpty()){
  //    System.out.println(line);
  //    line = reader.readLine();
  //  }}
  //}
  //Basic HTTP server that sends today's date to the client
  public static void main(String args[]) throws IOException {
    ServerSocket server = new ServerSocket(8080);
    System.out.println("Listening for connection on port 8080 ...");
    while(true){
      try (Socket socket = server.accept()) {
        Date today = new Date();
        String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
        socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
      }
    }
  }

}
