import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

//Implementation of Interface
public class Prime_Num_Impl extends UnicastRemoteObject implements Prime_Num {
    public Prime_Num_Impl() throws RemoteException{}
    public int Prime_Num_Check(int n){
        int flag = 0;
        if (n == 0 || n == 1)
        {
            flag = 1;
        }
        for (int i = 2; i <= n / 2; ++i) {
            // if n is divisible by i, then n is not prime
            // change flag to 1 for non-prime number
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        return flag;
    }
}
