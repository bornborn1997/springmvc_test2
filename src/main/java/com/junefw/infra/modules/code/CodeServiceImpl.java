package com.junefw.infra.modules.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeServiceImpl implements CodeService{

	@Autowired
	CodeDao dao;
	
	@Override
	public List<Code> selectList() throws Exception {
		return dao.selecList();
	}

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return dao.insert();
	}

}