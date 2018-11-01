public class Teste {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	private Agente agente;
	private Passageiro passageiro;
	private Pessoa pessoa;
	private Tripulacao tripulacao;

		Agente agente = new Agente();
		agente.getIdAgente();

		Pessoa pessoa = new Pessoa();
		pessoa.getNome();

		Passageiro passageiro = new Passageiro();
		passageiro.getNumeroSmiles();

		Tripulacao tripulacao = new Tripulacao();
		tripulacao.getIdTripulacao();
		}
	}