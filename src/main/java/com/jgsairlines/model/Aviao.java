package com.jgsairlines.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aviao")
public class Aviao {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "capacidade")
	private int capacidade;

	@Column(name = "quantidadeDisponivel")
	private int quantidadeDisponivel;

	@Column(name = "modelo")
	private String modelo;

	@Column(name = "faturamento")
	private double faturamento;

	@OneToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario piloto;

	@OneToOne
	@JoinColumn(name = "funcionario_id1")
	private Funcionario coPiloto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}

	public Funcionario getPiloto() {
		return piloto;
	}

	public void setPiloto(Funcionario piloto) {
		this.piloto = piloto;
	}

	public Funcionario getCoPiloto() {
		return coPiloto;
	}

	public void setCoPiloto(Funcionario coPiloto) {
		this.coPiloto = coPiloto;
	}

	@Override
	public String toString() {
		return "Aviao Details?= Id: " + this.id + ", Capacidade: " + this.capacidade + ", quantidadeDisponivel: "
				+ this.quantidadeDisponivel + ", modelo: " + this.modelo + ", faturamento: " + this.faturamento
				+ ", Piloto: " + this.piloto.getNome() + ", copiloto: " + this.coPiloto.getNome();
	}
}
