package conta_bancaria.model;

public class ContaPoupança extends ContaCorrente {

	private int aniversario;

	public ContaPoupança(int numero, int agencia, int tipo, String titular, float saldo, float limite,
			int aniversario) {
		super(numero, agencia, tipo, titular, saldo, limite);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public void visualizar() {
	super.visualizar();
	System.out.println("Aniversário da conta: " + this.aniversario);
	
	}
}
