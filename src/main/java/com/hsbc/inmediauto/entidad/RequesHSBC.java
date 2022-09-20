package com.hsbc.inmediauto.entidad;

public class RequesHSBC {
	private String usuario;
	private String sistemaId;
	private String version;
	private String uuid;
	private String fechaHora;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSistemaId() {
		return sistemaId;
	}

	public void setSistemaId(String sistemaId) {
		this.sistemaId = sistemaId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUUID(String uuid) {
		this.uuid = uuid;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

}
