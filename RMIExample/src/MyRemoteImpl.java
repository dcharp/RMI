import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	public MyRemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String sayHello(){
		System.out.println("Servicing request");
		return "Server says Hello!!";
	}

	public Integer add(Integer a, Integer b ){
		return a + b;
	}
	
	public static void main(String[] args) {
		try{
			System.out.println("Starting Server ....");
			MyRemote service = new MyRemoteImpl();
			Naming.bind("RemoteHello", service);
			System.out.println("Bounded Service");
		}catch (Exception e) {
			System.out.println("Could not bind service.");
			System.out.println(e);
		}
	}
}
