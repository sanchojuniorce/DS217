
public class Tripulacao {
	private int idTripulacao;
	private Pessoa pessoa;
	private Endereco endereco;

	public int getIdTripulacao() {
		return idTripulacao;
	}

	public void setidTripulacao(int idTripulacao) {
		this.idTripulacao = idTripulacao;
	}

	public Pessoa getNome() {
		return nome;
	}

	public Pessoa setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
