/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.tallerPatronesDisenoUML.Iterator.Iterators;

import ec.edu.espol.tallerPatronesDisenoUML.Iterator.Item;

/**
 *
 * @author EmilioSG23
 */
public interface Iterator {
    public Item first();
    public Item next();
    public boolean hasNext();
    public Item currentItem();
}
