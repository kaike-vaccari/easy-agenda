package br.com.easyagenda.easy_agenda;

import java.time.LocalDate;

public class GerenciadorArquivo {
	
	private int cpf;
	private String nome;
	private LocalDate idade;
	private String email;
	private int telefone;
	private String cidade;
	private LocalDate vigencia;
	
	
	
	public GerenciadorArquivo(int cpf, String nome, LocalDate idade, String email, int telefone, String cidade,
			LocalDate vigencia) {
		this.cpf = 000000000-00;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
		this.vigencia = vigencia;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getIdade() {
		return idade;
	}
	public void setIdade(LocalDate idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public LocalDate getVigencia() {
		return vigencia;
	}
	public void setVigencia(LocalDate vigencia) {
		this.vigencia = vigencia;
	}
	
	
}
