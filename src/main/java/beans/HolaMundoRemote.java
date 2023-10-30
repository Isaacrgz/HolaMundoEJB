package beans;

import jakarta.ejb.Remote;

@Remote
public interface HolaMundoRemote {
    public int sumar(int a, int b);
}
