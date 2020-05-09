/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opcionX;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab1.Menu;
import lab1.Persona;

/**
 *
 * @author jesus
 */
public class Crear extends Menu {

    @Override
    public void mostrarMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void realizarAccion(int opcion) {
        ObjectMapper objectMapper = new ObjectMapper();
        Scanner myObj = new Scanner(System.in);
        System.out.println("nombre: ");
        String nombre = myObj.nextLine();
        System.out.println("apellido: ");
        String apellido = myObj.nextLine();
        System.out.println("email: ");
        String email = myObj.nextLine();
        System.out.println("ciudad: ");
        String ciudad = myObj.nextLine();
        System.out.println("fecha_nacimiento: ");
        String fecha_nacimiento = myObj.nextLine();
        System.out.println("peso: ");
        float peso = Float.parseFloat((myObj.nextLine()));
        System.out.println("direccion_ip: ");
        String direccion_ip = myObj.nextLine();
        Persona p = new Persona(nombre, apellido, email, ciudad, fecha_nacimiento, peso, direccion_ip);
    }

}
