package com.JavaIDE.Files;

class TestFileSorgente {

	public static void main(String[] args) {
	
		FileSorgente file = new FileSorgente("HelloWorld",TipoFile.JAVA,"C:\\","Hello");
		
		try {
		file.aggiungiTesto("Hello");
		file.aggiungiTesto(" World", file.getContenuto().length());
		System.out.println(file);
		}catch(RuntimeException exc) {
			exc.printStackTrace();
		}
		
	
		
	}

}
