/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 *
 * @author ADMIN
 * 
 */
public class Check extends UnicastRemoteObject implements  LoginInterface
{
    
    public Check()throws Exception {}

    //@Override
    public boolean checkLogin(String id, String pwd) throws RemoteException 
    {
if(id.equals("hardik") && pwd.equals("12345"))
    
    return true;
else
    return false;
    }


}
