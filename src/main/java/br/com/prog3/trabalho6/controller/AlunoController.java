package br.com.prog3.trabalho6.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.prog3.trabalho6.model.Aluno;
import br.com.prog3.trabalho6.persistence.AlunoDaoImp;

@ManagedBean
@SessionScoped
public class AlunoController {
	private Integer matricula;
	private String nome;
	private String ra;
	private Aluno aluno;
	private String mensagem;
	
	public void removeBean(Aluno aluno){
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(aluno);
    }

	// get/set
		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

		public Aluno getAluno() {
			return aluno;
		}

		public void setAluno(Aluno aluno) {
			this.aluno = aluno;
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
	public void addAluno() {
		aluno = new Aluno("","",null);
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setRa(ra);
		AlunoDaoImp ad = new AlunoDaoImp();
		setMensagem(ad.save(aluno));
		removeBean(aluno);		
			
	}
	public void limpaAluno() {
		this.aluno = new Aluno("","",null);	
			
	}

	public void editAluno() {
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setRa(ra);
		AlunoDaoImp ad = new AlunoDaoImp();
		setMensagem(ad.update(aluno));
	}

	public void deleteAluno() {
		AlunoDaoImp ad = new AlunoDaoImp();
		setMensagem(ad.delete(matricula));
	}

	public List<Aluno> getAlunos() {
		AlunoDaoImp ad = new AlunoDaoImp();
		return ad.list();
	}

	public Aluno findAluno() {
		AlunoDaoImp ad = new AlunoDaoImp();
		return ad.findByMatricula(matricula);
	}
	
}