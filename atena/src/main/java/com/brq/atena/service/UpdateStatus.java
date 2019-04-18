package com.brq.atena.service;

import org.springframework.jdbc.core.JdbcTemplate;

import com.brq.atena.model.Status;
import com.brq.atena.wsdl.conector.PortabilityTicketOut;

public class UpdateStatus {

	public UpdateStatus() {
		super();
	}

	JdbcTemplate jdbcTemplate;

	public UpdateStatus(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	String SQLactive = "update SPN_TRANSACAO set cd_status_versao = 'active', cd_status_transacao = '14', ds_erro = '' where nr_protocolo = '?'";
	String SQLold = "update SPN_TRANSACAO set cd_status_versao = 'old', cd_status_transacao = '14', ds_erro = '' where nr_protocolo = '?'";
	String SQLpending = "update spn_ow.spn_transacao set cd_status_versao = 'pending', cd_status_transacao = '7', ds_erro = '' where nr_protocolo = '?'";
	String SQLpendingPreAtiva = "update spn_ow.spn_transacao set cd_status_versao = 'pending', cd_status_transacao = '2', ds_erro = '' where nr_protocolo = '?'";
	String SQLsuspended = "update spn_ow.spn_transacao set cd_status_versao = 'suspended', cd_status_transacao = '2', ds_erro = '' where nr_protocolo = '?'";
	String SQLcancelled = "update spn_ow.spn_transacao set cd_status_versao = 'cancelled', cd_status_transacao = '16',DS_ERRO = '' where nr_protocolo = '?'";
	String SQLconflict = "update spn_ow.spn_transacao set cd_status_versao = 'conflict', cd_status_transacao = '6', ds_erro = '' where nr_protocolo = '?'";
	String SQLcancelPending = "update spn_ow.spn_transacao set cd_status_versao = 'cancelPending', cd_status_transacao = '8', ds_erro = '' where nr_protocolo = '?'";
	String SQLdisconnectRet = "update spn_ow.spn_transacao set cd_status_versao = 'disconnectPending', cd_status_transacao = '17', ds_erro = '' where nr_protocolo = '?'";
	String SQLdisconnectDev = "update spn_ow.spn_transacao set cd_status_versao = 'disconnectPending', cd_status_transacao = '18', ds_erro = '' where nr_protocolo = '?'";

	public void manterStatus(Status status, PortabilityTicketOut portabilityTicketOut) {

		if (portabilityTicketOut.getStatusSpg().equals("active")) {
			jdbcTemplate.update(SQLactive, new Object[] { portabilityTicketOut.getSubscriptionVersionId() });

		} else if (portabilityTicketOut.getStatusSpg().equals("old")) {
			jdbcTemplate.update(SQLold, new Object[] { portabilityTicketOut.getSubscriptionVersionId() });

		} else if (portabilityTicketOut.getStatusSpg().equals("pending")) {
			jdbcTemplate.update(SQLpending, new Object[] { portabilityTicketOut.getSubscriptionVersionId() });

		} else if (portabilityTicketOut.getStatusSpg().equals("cancelled")) {
			jdbcTemplate.update(SQLcancelled, new Object[] { portabilityTicketOut.getSubscriptionVersionId() });

		} else if (portabilityTicketOut.getStatusSpg().equals("suspended")) {
			jdbcTemplate.update(SQLsuspended, new Object[] { portabilityTicketOut.getSubscriptionVersionId() });

		} else if (portabilityTicketOut.getStatusSpg().equals("conflict")) {
			jdbcTemplate.update(SQLconflict, new Object[] { portabilityTicketOut.getSubscriptionVersionId() });

		} else if (portabilityTicketOut.getStatusSpg().equals("cancel-pending")) {
			jdbcTemplate.update(SQLcancelPending, new Object[] { portabilityTicketOut.getSubscriptionVersionId() });

		} else if (portabilityTicketOut.getStatusSpg().equals("disconnect-pending")) {
			if (portabilityTicketOut.getSubscriptionDonorSp().equals("0320")
					|| portabilityTicketOut.getSubscriptionDonorSp().equals("0115")
					|| portabilityTicketOut.getSubscriptionDonorSp().equals("0215")) {
				jdbcTemplate.update(SQLdisconnectRet, new Object[] { portabilityTicketOut.getSubscriptionVersionId() });

			} else {
				jdbcTemplate.update(SQLdisconnectDev, new Object[] { portabilityTicketOut.getSubscriptionVersionId() });

			}

		}

	}
}
