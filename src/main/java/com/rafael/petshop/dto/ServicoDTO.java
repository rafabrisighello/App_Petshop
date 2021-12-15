package com.rafael.petshop.dto;

import java.io.Serializable;
import java.util.Date;

import com.rafael.petshop.domain.Servico;

public class ServicoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date dataEntrada;
	private Date dataSaida;
	private String descricao;
	
	public ServicoDTO() {
		
	}

	public ServicoDTO(Servico serv) {
		this.id = serv.getId();
		this.dataEntrada = serv.getDataEntrada();
		this.dataSaida = serv.getDataSaida();
		this.descricao = serv.getDescricao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
