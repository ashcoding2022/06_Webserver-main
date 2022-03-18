
package com.cc.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

class Server {

  public static void main(String[] args) 
  {
  
    try (ServerSocket serverSocket = new ServerSocket(8080)) {

      output("Hi from " + serverSocket + " \nI´  am ready to serve your Request!");

      while (true) {
        // Keep the Server alive! (durch Endlosschleife im speicher behalten)

        
     
       try (Socket client = serverSocket.accept()){
         output("message: " + client.toString());

         InputStreamReader inputStream = new InputStreamReader(client.getInputStream());
         BufferedReader bfReader = new BufferedReader(inputSream);
         
         StringBuilder request = new StringBuilder();

         String tmpLine = bfReader.readLine(); // one Line
         while (!tmpLine.isBlank()) { // Leerzeile als Trenner
         request.append(tmpLine + "\r\n");
         tmpLine = bfReader.readLine(); // zeile anhängen

         // Request als String ... 
         output("--> REQUEST: ");
         output("--> " + request);
}

      }
    }

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
   
 
  }

  private static void output(String outStr) {
    System.out.println(outStr);
  }



} // EoC
