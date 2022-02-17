package com.leandrolopes.cursomc.domain;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Categoria implements Serializable{	
	
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@NonNull
	private Long id;
	
	@NonNull
	private String nome;

}
