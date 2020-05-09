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
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            System.out.println("nombre: ");  // Output user input
            String nombre = myObj.nextLine();  // Read user input

            System.out.println("apellido: ");  // Output user input
            String apellido = myObj.nextLine();  // Read user input

            System.out.println("email: ");  // Output user input
            String email = myObj.nextLine();  // Read user input

            System.out.println("ciudad: ");  // Output user input
            String ciudad = myObj.nextLine();  // Read user input

            System.out.println("fecha_nacimiento: ");  // Output user input
            String fecha_nacimiento = myObj.nextLine();  // Read user input

            System.out.println("peso: ");  // Output user input
            float peso = Float.parseFloat((myObj.nextLine()));

            System.out.println("direccion_ip: ");  // Output user input
            String direccion_ip = myObj.nextLine();  // Read user input

            Persona p = new Persona(nombre, apellido, email, ciudad, fecha_nacimiento, peso, direccion_ip);
            objectMapper.writeValue(new File("resources/personas.json"), p);
        } catch (IOException ex) {
            Logger.getLogger(Crear.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
