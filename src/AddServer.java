//Server Program
import java.rmi.*;
import java.net.*;
public class AddServer {
    public static void main (String args[]) {
        try{
            Prime_Num_Impl obj = new Prime_Num_Impl();
            Naming.rebind("rmi:///Prime_Num", obj);
        }
        catch (RemoteException re){
            re.printStackTrace();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
