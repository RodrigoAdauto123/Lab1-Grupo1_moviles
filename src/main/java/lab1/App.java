package lab1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {


        //Listar Personas
            try {
                // Creo una instancia
                ObjectMapper mapper = new ObjectMapper();

                ListaPersona listaPersona = new ListaPersona();
                // Guardo en el objeto
                listaPersona = mapper.readValue(Paths.get("../resources/personas.json").toFile(), ListaPersona.class);

                // Imprimo
                System.out.println(listaPersona);

            } catch (Exception ex) {
                ex.printStackTrace();
            }





    }
}
