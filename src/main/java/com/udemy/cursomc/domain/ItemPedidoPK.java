package com.udemy.cursomc.domain;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class ItemPedidoPK implements Serializable {	
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;

}
