package com.udemy.cursomc.domain.enums;

import lombok.Getter;

@Getter
public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Fisica"),
	PESSOAJURIDICA(2, "Pessoa Juridica");	
	
	private Integer cod;
	private String descricao;
	
	private TipoCliente(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public static TipoCliente toEnum(Integer id) {
		
		if(id == null) {
			return null;
		}
		for(TipoCliente x : TipoCliente.values()) {
			if(id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}

}
