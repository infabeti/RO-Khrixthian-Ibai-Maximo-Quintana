package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AgregarAlHtml {

	public void agregar(String x) {

		try {
			FileWriter fstream = new FileWriter(".//ficheros//Usuarios.html");
			BufferedWriter out = new BufferedWriter(fstream);

			out.write(x);
			out.close();

		} catch (IOException ex) {
			new ControlExcepciones("Excepci�n de archivo no encontrado" + ex.getMessage());
		}
	}
}
