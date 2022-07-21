/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerPatronesDisenoUML.Iterator;

import ec.edu.espol.tallerPatronesDisenoUML.Iterator.Iterators.*;

/**
 *
 * @author EmilioSG23
 */
public class Empleado {
    public static void main(String[] args){
        Inventario inventario;
        Iterator iterator;
        //Comprador
        inventario=new InventarioDisponible();
        iterator=new DisponibleIterator((InventarioDisponible) inventario);
        //Vendedor
        inventario=new InventarioDisponible();
        iterator=new DisponibleIterator((InventarioDisponible) inventario);
        //Proveedor
        inventario=new InventarioFallas();
        iterator=new FallasIterator((InventarioFallas) inventario);
        //Asistente
        inventario=new InventarioReparacion();
        iterator=new ReparacionIterator((InventarioReparacion) inventario);
    }
}
