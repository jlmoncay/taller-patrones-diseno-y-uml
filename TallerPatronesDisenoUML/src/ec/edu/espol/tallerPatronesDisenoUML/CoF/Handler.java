package ec.edu.espol.tallerPatronesDisenoUML.CoF;

public interface Handler {
    
    public void setNext(Handler h);
    public boolean verificar(Producto producto); 
    
}
