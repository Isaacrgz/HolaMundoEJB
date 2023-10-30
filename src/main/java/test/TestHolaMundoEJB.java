package test;

import beans.HolaMundoRemote;
import javax.naming.*;

public class TestHolaMundoEJB {
    public static void main(String[] args) {
        System.out.println("Staring call to EJB from the client");
        try {
            Context jndi = new InitialContext();
            HolaMundoRemote holaMundoRemote = (HolaMundoRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEJBImpl!beans.HolaMundoRemote");
            int result = holaMundoRemote.sumar(1, 3);
            System.out.println(result);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
