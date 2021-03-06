package com.JavaIDE.Files;

public class FileSorgente extends File {
	
	private String contenuto;
	
	public FileSorgente(String nome, int tipo, String percorsoFile) {
		super(nome, tipo, percorsoFile);
	}
	
	public FileSorgente(String nome,int tipo, String percorsoFile, String contenuto) {
		this(nome,tipo,percorsoFile);
		this.contenuto = contenuto;
		
	}

	public String getContenuto() {
		return contenuto;
	}

	private void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	
	public void aggiungiTesto(String contenuto) throws RuntimeException {
		if (contenuto != null) {
			if (this.contenuto == null) {
				this.setContenuto(contenuto);
			} else {
				assert this.getContenuto() != null : "Contenuto del file nullo!";

				this.setContenuto(this.getContenuto() + contenuto);
			}
		}else {
			throw new RuntimeException("Parametro del metodo null");
		}
	}
	
	
	public void aggiungiTesto(String contenuto, int posizione) throws RuntimeException{
		try {
			if (contenuto != null) {
				try {
					this.setContenuto(this.getContenuto().substring(0, posizione) + contenuto
							+ this.getContenuto().substring(posizione));
					assert this.getContenuto() != null : "Contenuto del file nullo!";
				} catch (IndexOutOfBoundsException exc) {
					System.out.println("Errore: parametro posizone del metodo aggiungiTesto(String,int) non valido.");
				}

			}
			else {
				throw new RuntimeException("Parametro del metodo null");
			}
			
		} catch (NullPointerException exc) {
			this.aggiungiTesto(contenuto);
		}
	}
		

	
	
	@Override
	public String toString() {
		//TODO: sostituire con Stringa che ricapitola nomefile.estensione + eventuale contenuto (se contenuto nullo stampare file vuoto)
		return this.getContenuto();
	}

}
