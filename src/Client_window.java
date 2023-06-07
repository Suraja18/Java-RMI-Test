import java.rmi.*;
import java.net.*;
import java.util.*;

public class Client_window {
    public static void main (String[] args){
        String host="localhost";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int a = scanner.nextInt();
        try{
            Prime_Num obj = (Prime_Num)Naming.lookup("rmi://"+host+"/Prime_Num");
            if (obj.Prime_Num_Check(a) == 1){
                System.out.println("The number: "+a +" is not Prime Number");
            }
            else if (obj.Prime_Num_Check(a) == 0){
                System.out.println("The number: "+a +" is Prime Number");
            }
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
