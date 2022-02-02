package RMiServer;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface{


    protected  HelloImpl() throws RemoteException {
        super();
    }
    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hi" + name;
    }

    public static void main(String[] args) throws RemoteException {
        try {
            Naming.bind("rmi://localhost/MyRemote", new HelloImpl());
        } catch (MalformedURLException |RemoteException | AlreadyBoundException e ) {
            e.printStackTrace();
        }
    }
}

