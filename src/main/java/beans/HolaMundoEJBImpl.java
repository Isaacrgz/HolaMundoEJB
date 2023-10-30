package beans;

import jakarta.ejb.Stateless;

@Stateless
public class HolaMundoEJBImpl implements HolaMundoRemote{

    @Override
    public int sumar(int a, int b) {
        System.out.println("Executing the adding method in the Server");
        return a + b;
    }
    
}
