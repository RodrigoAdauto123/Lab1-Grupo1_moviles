/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author jesus
 */
public abstract class Menu {
    public abstract void mostrarMenu();
    public abstract void realizarAccion(int opcion);
    
    public int numeroOpciones;
    public String menu;
}
