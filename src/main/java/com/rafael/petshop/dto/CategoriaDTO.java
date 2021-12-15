package com.rafael.petshop.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rafael.petshop.domain.Categoria;
import com.rafael.petshop.domain.Produto;

public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private List<Produto> produtos = new ArrayList<>();
	
	public CategoriaDTO() {
		
	}

	public CategoriaDTO(Categoria cat) {
		this.id = cat.getId();
		this.nome = cat.getNome();
		this.produtos = cat.getProdutos();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
