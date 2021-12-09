package com.bilgeadam.clientserverhwobject2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Base64;


public class ServerSide {
    public static void main(String[] args) {
        PortAndIpClass serverPort = new PortAndIpClass(4711);


        try (ServerSocket server = new ServerSocket(serverPort.getPort())) {
            System.out.println("Timeserver sizi <<" + serverPort.getPort() + ">> numaralı porttan dinliyor");

            while (true) {
                Socket socket = server.accept();

                InputStream input = socket.getInputStream();
                ObjectInputStream objectInputStream = new ObjectInputStream(input);

                /*InputStreamReader reader = new InputStreamReader(input);
                BufferedReader br = new BufferedReader(reader);*/
                Info info3 = (Info) objectInputStream.readObject();
                System.out.println(info3);
                String decodedPassword = decoder(info3.getPassword());
                System.out.println(decodedPassword);
                info3.setName(info3.getName().toUpperCase());
                info3.setSurname(info3.getSurname().toUpperCase());
                info3.setPassword(decodedPassword);
                System.out.println(info3);
                OutputStream output = socket.getOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(output);

                objectOutputStream.writeObject(info3);

                /*PrintWriter writer = new PrintWriter(output, true);
                writer.println("Adınız Soyadınız --> " + info3.getName() + " " + info3.getSurname());
                writer.println(info3.getPassword())*/;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getLocalizedMessage());
            System.exit(-3);
        }
    }

    private static String decoder(String password) {
        byte[] decodedBytes = Base64.getDecoder().decode(password);
        return new String(decodedBytes);
    }


}
