package com.JavaIDE.IDE;
import com.JavaIDE.Files.FileSorgente;

public class JavaIDE implements IDE {
	
	@Override
	public void modifica(FileSorgente file,String testo) {
		
		try{
			file.aggiungiTesto(testo);
			System.out.println("Contenuto modificato:\n" 
					+ file.getContenuto());
			IDE.super.modifica(file, testo);
		}
		catch(RuntimeException exc) {
			System.out.println(exc);
		}
		
		
	}
	
	public void modifica(FileSorgente file,String testo, int posizione) {
		
		try{
			file.aggiungiTesto(testo,posizione);
			System.out.println("Contenuto modificato:\n" 
					+ file.getContenuto());
			IDE.super.modifica(file, testo);
		}
		catch(RuntimeException exc) {
			System.out.println(exc);
			file.close();
		}
		
	}
	
	@Override
	public void compila(FileSorgente file) {
		System.out.println(file.getNome() + ": Stò compilando...");
		IDE.super.compila(file);
	}
	
	@Override 
	public void esegui(FileSorgente file) {
		this.compila(file);
		IDE.super.esegui(file);
	}
}
