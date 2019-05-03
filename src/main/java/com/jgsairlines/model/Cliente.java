package com.jgsairlines.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "rg")
	private String rg;

	@OneToOne
	private CartaoFidelidade cartaoFidelidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public CartaoFidelidade getCartaoFidelidade() {
		return cartaoFidelidade;
	}

	public void setCartaoFidelidade(CartaoFidelidade cartaoFidelidade) {
		this.cartaoFidelidade = cartaoFidelidade;
	}

	@Override
	public String toString() {
		return "Client Details?= Id: " + this.id + ", Name: " + this.nome + ", RG: " + this.rg + ", Matricula: "
				+ this.cartaoFidelidade.getCodCartaoFidelidade();
	}
}
