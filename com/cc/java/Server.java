
package com.cc.java;

import java.io.IOException;
import java.net.ServerSocket;

class Server {

  public static void main(String[] args) 
  {
  
    try (ServerSocket serverSocket = new ServerSocket(8080)) {

      output("Hi from " + serverSocket + " \nI´  am ready to serve your Request!");

      while (true) {
        // Keep the Server alive! (durch Endlosschleife im speicher behalten)
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
