package com.hsbc.inmediauto.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehdetails")
public class Objeto {
	
	@Id
	private String cvevigencia;
	private String descvigencia;
		
	public Objeto() {	}
	
	public Objeto(String cvevigencia, String descvigencia) {
		super();
		this.cvevigencia = cvevigencia;
		this.descvigencia = descvigencia;
	}
	public String getCvevigencia() {
		return cvevigencia;
	}
	public void setCvevigencia(String cvevigencia) {
		this.cvevigencia = cvevigencia;
	}
	public String getDescvigencia() {
		return descvigencia;
	}
	public void setDescvigencia(String descvigencia) {
		this.descvigencia = descvigencia;
	}
	
	

}
