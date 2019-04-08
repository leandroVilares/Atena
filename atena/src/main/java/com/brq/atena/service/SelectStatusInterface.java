package com.brq.atena.service;

import java.util.List;

import com.brq.atena.model.Status;

public interface SelectStatusInterface {

	
	public List<Status> selectStatus(String[] nrTelefones);
}
