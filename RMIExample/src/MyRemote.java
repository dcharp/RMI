import java.rmi.Remote;
import java.rmi.RemoteException;


public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException; 
	public Integer add(Integer a,Integer b) throws RemoteException;
}
