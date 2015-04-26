package com.spgf.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.architecture.controller.PadraoMBImpl;
import com.spgf.model.entities.Categoria;
import com.spgf.model.entities.Transacao;

@ViewScoped
@ManagedBean
public class TransacaoConfMB extends PadraoMBImpl<Transacao> {

	@SuppressWarnings("unchecked")
	public List<Categoria> getListCategoria() {
		return (List<Categoria>) montarCombo(new Categoria(), null);
	}

}