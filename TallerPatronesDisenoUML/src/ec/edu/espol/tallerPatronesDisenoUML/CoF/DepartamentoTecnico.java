package ec.edu.espol.tallerPatronesDisenoUML.CoF;

public class DepartamentoTecnico extends DevolucionProducto{
    
    public DepartamentoTecnico(Handler nextHandler) {
        super(nextHandler);
    }
    
    @Override
    public boolean verificar(Producto producto) {
        return true;  //En este caso se verifica que el tipo de fallo se encuentre dentro de lo cubierto por la garantía
    }
    
}
