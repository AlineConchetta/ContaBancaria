package conta_bancaria.controller;

import java.util.ArrayList;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository {

	// Criar a collection

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();

	// Variável para receber o número da conta

	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {


	}
	@Override
	public void listarTodas() {
		for(var conta : listaContas)
			conta.visualizar();
			}
		
	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("A conta número: " + conta.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int numero) {
		
		public void procurarPorNum(int numero) {

			var conta = buscarNaCollection(numero);
			
			if (conta != null)
				if(listaContas.remove(conta)==true)
					System.out.println("A conta número: " + numero + "foi deletada.");
			else
				System.out.println("A conta número" + numero + "não foi encontrada!");
		}
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub

	}

	/* Metodos auxiliares */

	public int gerarNumero() {
		return ++numero;
	}

}
