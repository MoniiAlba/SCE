package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hola extends Remote {
    String sayHello() throws RemoteException;
	int suma(int a, int b) throws RemoteException;
}

