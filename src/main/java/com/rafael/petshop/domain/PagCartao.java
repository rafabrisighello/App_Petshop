package com.rafael.petshop.domain;

import javax.persistence.Entity;

import com.rafael.petshop.domain.enums.SituacaoPagamento;

@Entity
public class PagCartao extends Pagamento {

	private static final long serialVersionUID = 1L;
	
	private Integer parcelas;
	
	public PagCartao() {
		
	}

	public PagCartao(Integer id, Double valor, SituacaoPagamento situacao, Servico servico, Integer parcelas) {
		super(id, valor, situacao, servico);
		this.parcelas = parcelas;
		// TODO Auto-generated constructor stub
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
}
