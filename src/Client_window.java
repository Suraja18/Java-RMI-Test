import java.rmi.*;
import java.net.*;
import java.util.*;

public class Client_window {
    public static void main (String args[]){
        String host="localhost";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int a = scanner.nextInt();
        try{
            Prime_Num obj = (Prime_Num)Naming.lookup("rmi://"+host+"/Prime_Num");
            System.out.println(obj.Prime_Num_Check(a));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException ef) {
            ef.printStackTrace();
        } catch (RemoteException efg) {
            efg.printStackTrace();
        }
    }
}
