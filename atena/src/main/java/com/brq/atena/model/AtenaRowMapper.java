package com.brq.atena.model;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;



public class AtenaRowMapper implements RowMapper<Status>{
	
	

	@Override
	public Status mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	
		
		Status objectStatus = new Status();
		
		try {
			
			objectStatus.setTelefone(rs.getString("NR_TELEFONE"));
			objectStatus.setProtocolo(rs.getString("NR_PROTOCOLO"));
			objectStatus.setTipoTransacao(rs.getString("CD_TIPO_TRANSACAO"));
			objectStatus.setAssinante(rs.getString("CD_ASSINANTE"));
			objectStatus.setStatusTransacao(rs.getString("CD_STATUS_TRANSACAO"));
			objectStatus.setStatusVersao(rs.getString("CD_STATUS_VERSAO"));
			objectStatus.setJanela(rs.getDate("DT_JANELA_MIGRACAO"));
			
				
			
		} catch (Exception e) {
			
		} 
		
		return objectStatus;
	}
	

}
