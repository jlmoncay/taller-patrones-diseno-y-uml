package ec.edu.espol.tallerPatronesDisenoUML.CoF;

public class Gerente extends DevolucionProducto{
    
    public Gerente(Handler nextHandler) {
        super(nextHandler);
    }
    
    @Override
    public boolean verificar(Producto producto) {
        return true;  //En este caso se verifica que el precio de venta del producto supere los 1000 USD para llamar al gerente
    }    
}
