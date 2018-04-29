package com.JavaIDE.IDE;

import com.JavaIDE.Files.FileSorgente;

interface IDE extends Editor {

	default void compila(FileSorgente file) {
		System.out.println("File: " + file.getNome() + ": Compilato!");
	}

	default void esegui(FileSorgente file) {
		System.out.println("File: " + file.getNome() + ": Eseguito!");

	}

}
