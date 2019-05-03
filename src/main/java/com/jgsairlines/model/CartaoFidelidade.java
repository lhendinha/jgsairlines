package com.jgsairlines.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cartaofidelidade")
public class CartaoFidelidade {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "codigo")
	private int codCartaoFidelidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodCartaoFidelidade() {
		return codCartaoFidelidade;
	}

	public void setCodCartaoFidelidade(int codCartaoFidelidade) {
		this.codCartaoFidelidade = codCartaoFidelidade;
	}

	@Override
	public String toString() {
		return "Cartao Fidelidade Details?= Id: " + this.id + ", Codigo: " + this.codCartaoFidelidade;
	}
}