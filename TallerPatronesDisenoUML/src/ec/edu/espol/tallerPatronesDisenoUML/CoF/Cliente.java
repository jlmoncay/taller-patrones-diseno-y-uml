package ec.edu.espol.tallerPatronesDisenoUML.CoF;

public class Cliente {
    
    private static DevolucionProducto crearCadenaResponsabilidades() {
        DevolucionProducto handlerAtencionUsuario = new AtencionUsuario(null);
        DevolucionProducto handlerDepartamentoTecnico = new DepartamentoTecnico(handlerAtencionUsuario);
        DevolucionProducto handlerJefeInventario = new JefeInventario(handlerDepartamentoTecnico);
        DevolucionProducto handlerGerente = new Gerente(handlerJefeInventario);
        
        return handlerGerente;
    }    
}
