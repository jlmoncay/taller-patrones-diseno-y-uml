package ec.edu.espol.tallerPatronesDisenoUML.CoF;

public class JefeInventario extends DevolucionProducto{
   
    public JefeInventario(Handler nextHandler) {
        super(nextHandler);
    }
    
    @Override
    public boolean verificar(Producto producto) {
        return true;  //En este caso se verifica la existencia del producto en bodega para su devolución 
    }  
}
