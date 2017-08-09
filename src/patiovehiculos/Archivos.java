/*
 * Clase utilitaria de lectura y escritura de Archivos
 * Java versiones 7 y 8
 */

package patiovehiculos;

import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author miltonlab
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
	// Testing the write methods,
	// Paths run on GNU / Linux
	escribir("/tmp/salida.txt", "Esto es una \n prueba de escritura");
	System.out.println("Archivo '/tmp/salida.txt' grabado con éxito");	
	String t = leer("/tmp/entrada.txt");
	System.out.printf("Archivo '/tmp/entrada.txt' leido con éxito: %s",t);
    }

    public static String leer(String path){
	String texto = "";
	try{
	    Path ph = Paths.get(path);
	    List <String> lineas = Files.readAllLines(ph, StandardCharsets.UTF_8);
	    for (String  linea : lineas){
		texto += linea + "\n";
	    }
	
	} catch (IOException ioex){
	    System.err.println("Error al leer archivo: " + ioex.toString());
	}
	return texto;
    }
    
    public static void escribir(String path, String texto){
	try{
	    Path ph = Paths.get(path);
	    // Escribe de nuevo todo el archivo
	    // Files.write(ph, texto.getBytes());
	    // Escribe el archivo agregando al final
	    Files.write(ph, texto.getBytes(), StandardOpenOption.APPEND);

	}catch (Exception ex){
	    System.err.println("Error al escribir archivo: " + ex.toString());
	}	    
	
    }

}
