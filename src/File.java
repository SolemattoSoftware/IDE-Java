
public abstract class File {
	private String nome;
	private int tipo;
	private String percorsoFile;
	
	
	public File(String nome, int tipo, String percorsoFile) {
		this.nome = nome;
		this.tipo = tipo;
		this.percorsoFile= percorsoFile;
		}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String getPercorsoFile() {
		return percorsoFile;
	}


	public void setPercorsoFile(String percorsoFile) {
		this.percorsoFile = percorsoFile;
	}
}
