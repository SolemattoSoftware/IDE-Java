package com.JavaIDE.IDE;

import com.JavaIDE.Files.FileSorgente;

interface Editor {

	default void apri(FileSorgente file) {
		System.out.println("File " + file.getNome() + " Aperto!");
	}

	default void close(FileSorgente file) {
		System.out.println("File " + file.getNome() + ": ");
		file.close();
	}

	default void modifica(FileSorgente file, String testo) {
		System.out.println("File " + file.getNome() + ": Modificato!");
	}

	default void salva(FileSorgente file) {
		System.out.println("File " + file.getNome() + ": Salvato!");
	}
}
