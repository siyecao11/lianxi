package com.visa.businessmodel;

public class Passengersobject {

	private String  type;
	private String  name;
	private String  certificate;
	private String  mobelPhone;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getMobelPhone() {
		return mobelPhone;
	}

	public void setMobelPhone(String mobelPhone) {
		this.mobelPhone = mobelPhone;
	}

	@Override
	public String toString() {
		return "Passengersobject [type=" + type + ", name=" + name + ", certificate=" + certificate + ", mobelPhone=" + mobelPhone + "]";
	}
	

	public Passengersobject() {
		super();
		
	}
	
	
	public Passengersobject(String  type,String Passengersname, String certificate,String mobelPhone) {
		super();
		this.type = type;
		this.name = Passengersname;
		this.certificate = certificate;	
		this.mobelPhone = mobelPhone;
	}

	
	public Passengersobject(String Passengersname,  String certificate, String mobelPhone) {
		super();
		this.name = Passengersname;
		this.certificate = certificate;	
		this.mobelPhone = mobelPhone;
	}
	
	
	
	
	
	
	
	
	
	
}
