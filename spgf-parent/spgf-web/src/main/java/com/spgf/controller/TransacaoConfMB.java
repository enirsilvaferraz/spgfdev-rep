package com.spgf.controller;

import com.spgf.model.entities.Transacao;
import java.util.List;
import com.spgf.model.entities.Categoria;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.architecture.controller.PadraoMBImpl;

@ViewScoped
@ManagedBean
public class TransacaoConfMB extends PadraoMBImpl<Transacao> {

	@SuppressWarnings("unchecked")
	public List<Categoria> getListCategoria(){
		return (List<Categoria>) montarCombo(new Categoria(), null);
	}


}