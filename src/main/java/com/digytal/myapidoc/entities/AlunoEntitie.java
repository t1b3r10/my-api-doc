package com.digytal.myapidoc.entities;

import java.util.Objects;

public class AlunoEntitie {
	
	private String nome;
	private String sobrenome;
	
	public AlunoEntitie(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, sobrenome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoEntitie other = (AlunoEntitie) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sobrenome, other.sobrenome);
	}

	@Override
	public String toString() {
		return "AlunoEntitie [nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	
}
