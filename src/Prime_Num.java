import java.rmi.*;

public interface Prime_Num extends Remote{
    public int Prime_Num_Check (int a) throws RemoteException;
}
