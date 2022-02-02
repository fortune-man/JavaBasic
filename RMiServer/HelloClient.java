package RMiServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class HelloClient {
    public static void main(String[] args) {
        try{
            HelloInterface hello = (HelloInterface) Naming.lookup("rmi://localhost/MyRemote");
            String response = hello.sayHello("kim");
            System.out.println("Coming from RMI Server : " + response);

        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
