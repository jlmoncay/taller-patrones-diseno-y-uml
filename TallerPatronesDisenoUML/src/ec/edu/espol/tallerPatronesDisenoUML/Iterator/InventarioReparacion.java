/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerPatronesDisenoUML.Iterator;

import ec.edu.espol.tallerPatronesDisenoUML.Iterator.Iterators.ReparacionIterator;
import ec.edu.espol.tallerPatronesDisenoUML.Iterator.Iterators.Iterator;

/**
 *
 * @author EmilioSG23
 */
public class InventarioReparacion implements Inventario{
    //Código de la colección
    public Iterator createInventario(){
        return new ReparacionIterator(this);
    }
}
