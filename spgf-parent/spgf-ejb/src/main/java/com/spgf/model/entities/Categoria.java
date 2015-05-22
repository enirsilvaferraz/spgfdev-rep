package com.spgf.model.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.archtecture.model.entities.ModelAb;

import java.util.List;

/**
 * The persistent class for the categoria database table.
 * 
 */
@Entity
@Table(name = "CATEGORIA")
@NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c")
public class Categoria extends ModelAb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO", unique = true, nullable = false)
	private Long codigo;

	@Column(name = "NOME", nullable = false, length = 50)
	private String nome;

	@OneToMany(mappedBy = "categoria")
	private List<Transacao> listTransacao;

	public Categoria() {
	}

	public Long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Transacao> getListTransacao() {
		return this.listTransacao;
	}

	public void setListTransacao(List<Transacao> listTransacao) {
		this.listTransacao = listTransacao;
	}

	public Transacao addListTransacao(Transacao listTransacao) {
		getListTransacao().add(listTransacao);
		listTransacao.setCategoria(this);

		return listTransacao;
	}

	public Transacao removeListTransacao(Transacao listTransacao) {
		getListTransacao().remove(listTransacao);
		listTransacao.setCategoria(null);

		return listTransacao;
	}

	@Override
	public String[] getAtributosOrdencao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getLabel() {
		return getNome();
	}
}