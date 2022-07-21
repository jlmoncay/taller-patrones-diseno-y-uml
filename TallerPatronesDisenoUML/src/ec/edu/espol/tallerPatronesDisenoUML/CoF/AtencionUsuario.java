package ec.edu.espol.tallerPatronesDisenoUML.CoF;

public class AtencionUsuario extends DevolucionProducto{
    
    public AtencionUsuario(Handler nextHandler) {
        super(nextHandler);
    }
    
    @Override
    public boolean verificar(Producto producto) {
        return true;  //En este caso se verifica que el producto se encuentre en el periodo de garantía
    }    
}
