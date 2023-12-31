package consome.appConsome.model;

public class AlunoModel {
	
	private String nome;
	private int idade;
	private String sexo;
	private String curso;
	private String campus;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	@Override
	public String toString() {
		return "AlunoModel [nome=" + this.nome + ", idade=" + this.idade + ", sexo=" + this.sexo + ", curso=" + this.curso + ", campus="
				+ this.campus + "]";
	}
	
}
