package br.com.prog3.trabalho6.model;

import java.io.Serializable;



public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L; 
	private Integer matricula;
	private String nome;
	private String ra;
	
	public Aluno(){}
	
	public Aluno(String nome,String ra, Integer matricula){
		this.matricula = matricula;
		this.nome=nome;
		this.ra=ra;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	

}