package ec.edu.espol.tallerPatronesDisenoUML.CoF;

public abstract class DevolucionProducto implements Handler{
    
    protected Handler nextHandler;
    
    public DevolucionProducto(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    @Override
    public void setNext(Handler h) {
        this.nextHandler = h;
    }
    
    @Override
    public abstract boolean verificar(Producto producto);    
}
