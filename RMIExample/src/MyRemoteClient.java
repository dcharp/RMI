

import java.rmi.Naming;
 class MyRemoteClient {
	public static void main (String[] args){
		new MyRemoteClient().go();
	}

	public void go() {
		try {
			System.out.println("Working...");
			MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
			String s = service.sayHello();
			
			Integer a = new Integer(10);
			Integer b = new Integer(10);
			Integer result = service.add(a,b);
			
			System.out.println(s + "The result is: "  + result);
		} catch(Exception ex){
			System.out.println("Could not find service.");
			System.out.println(ex);
		}
		
	}
}
