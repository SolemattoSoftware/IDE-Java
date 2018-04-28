
public class FileSorgente extends File {
	
	private String contenuto;
	
	public FileSorgente(String nome, int tipo, String percorsoFile) {
		super(nome, tipo, percorsoFile);
	}
	
	public FileSorgente(String nome,int tipo, String percorsoFile, String contenuto) {
		this(nome,tipo,percorsoFile);
		this.contenuto = contenuto;
		
	}

	private String getContenuto() {
		return contenuto;
	}

	private void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	
	public void aggiungiTesto(String testo) {
		
		if(testo == null) {
			this.setContenuto(testo);
		}
		
		assert this.getContenuto() != null: "Contenuto del file nullo";
		
		this.setContenuto(this.getContenuto() + testo);
		
	}

}
