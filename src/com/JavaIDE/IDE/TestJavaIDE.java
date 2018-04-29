package com.JavaIDE.IDE;

import com.JavaIDE.Files.FileSorgente;
import com.JavaIDE.Files.TipoFile;

class TestJavaIDE {

	public static void main(String[] args) {
		
		JavaIDE ide = new JavaIDE();
		try(FileSorgente file = new FileSorgente("Test.java", TipoFile.JAVA, "C:\\", "public Class{\n\t")){
			ide.apri(file);
			//ide.modifica(file, "}");
			ide.modifica(file, null);
			ide.salva(file);
		}
		

	}

}
