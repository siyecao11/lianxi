package com.Utility.driver;

public enum DocumentType {

	Identification("身份证", "SF"), Passport("护照", "HZ"),Officer("军官证", "JG"),  Other("其他", "ID"),Compatriots("台胞证","TB"),Gopassage("港澳通行证","GO"),Twpassage("台湾通行证","TW"),Gohome("回乡证","HX"),Providedlater("稍后提供","");

	private String documentName;
	private String documentAbbr;

	
	public String getDocumentName() {
		return documentName;
	}


	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}


	public String getDocumentAbbr() {
		return documentAbbr;
	}


	public void setDocumentAbbr(String documentAbbr) {
		this.documentAbbr = documentAbbr;
	}

	private DocumentType(String documentName, String documentAbbr) {
		this.documentName = documentName;
		this.documentAbbr = documentAbbr;
	}

	public static String getDocumentAbbr(String doucmentName) {
		for (DocumentType documentType : DocumentType.values()) {
			if (documentType.getDocumentName().equals(doucmentName)) {
				return documentType.getDocumentAbbr();
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
