package conta_bancaria.controller;

import java.util.ArrayList;
import java.util.Optional;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository {

	// Criar a collection

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();

	// Variável para receber o número da conta

	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {

		Optional<Conta> conta = buscarNaColletion(numero);

		if (conta.isPresent())
			conta.get().visualizar();
		else
			System.out.println("A conta número" + numero + "não foi encontrada!");
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas)
			conta.visualizar();
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("A conta número: " + conta.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void atualizar(Conta conta) {

		Optional<Conta> buscaConta = buscarNaColletion(conta.getNumero());

		if (buscaConta.isPresent()) {
			listaContas.set(listaContas.indexOf(buscaConta.get()), conta);
			System.out.println("A conta numero: " + conta.getNumero() + "foi atualizada.");
		} else
			System.out.println("A conta número" + numero + "não foi encontrada!");
	}

	@Override
	public void deletar(int numero) {

		Optional<Conta> conta = buscarNaColletion(numero);

		if (conta.isPresent()) {
			if (listaContas.remove(conta.get()) == true)
				System.out.println("A conta número: " + numero + "foi deletada.");
			else
				System.out.println("A conta número" + numero + "não foi encontrada!");
		}

	}

	@Override
	public void sacar(int numero, float valor) {
		Optional<Conta> conta = buscarNaColletion(numero);
		
		if (conta.isPresent()) {
			if(conta.get().sacar(valor) == true)
				System.out.println("O saque na Conta número " + numero + "foi efetuado com sucesso!");
		}else {
			System.out.println("A conta número: " + numero + " não foi encontrada");
	}}

	@Override
	public void depositar(int numero, float valor) {

		Optional<Conta> conta = buscarNaColletion(numero);

		if (conta.isPresent()) {
			conta.get().depositar(valor);
			System.out.println("\nO Depósito na conta número: " + numero + "foi efetuado com sucesso!");

		} else
			System.out.println(
					"\nA Conta número: " + numero + "não foi encontrada ou a Conta destino não é uma Conta Corrente!");

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		
		Optional<Conta> contaOrigem = buscarNaColletion(numeroOrigem);
		Optional<Conta> contaDestino = buscarNaColletion(numeroDestino);
		
		if (contaOrigem.isPresent() && contaDestino.isPresent()) {
			if (contaOrigem.get().sacar(valor) == true ) {
				contaDestino.get().depositar(valor);
				System.out.println("\nA transferência da conta número: " + numeroOrigem + " para a conta destino numero: " + contaDestino + " foi efeutada com sucesso");
			}
		} else
			System.out.println("\nA Conta de Origem e/ou Destino não foram encontradas!");
	}

	/* Metodos auxiliares */

	public int gerarNumero() {
		return ++numero;
	}

	public Optional<Conta> buscarNaColletion(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return Optional.of(conta);
		}
		return Optional.empty();
	}

}
