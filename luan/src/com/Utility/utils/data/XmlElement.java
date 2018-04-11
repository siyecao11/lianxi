package com.Utility.utils.data;
import java.io.File;
import java.util.List;

import org.dom4j.Element;



public class XmlElement {
	
	static File  file=new File("configuration/properties/login.xml");
	public static String path = file.getAbsolutePath().substring(0);
	
	public static Element getPurchaser(String file, String xpath, String aa) {
		
		
		Element root=XmlIO.getRoot(file);
		//List<Element> list = XmlIO.getElements(root, "//purchaserlogin");
		List<Element> list = root.selectNodes("//purchaserlogin");

		Element as = XmlIO.getElementByName(list, aa);
		return as;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Element getNodeByid(String file, String xpath, String ID) {
		List<Element> list = XmlIO.getDocument(file).selectNodes(xpath);
		Element node = XmlIO.getElementById(list, ID);
		return node;
	}

	
	public static Element getSupplierByNodeText(String file, String NodeName, String nodeName, String nodeText) {
		Element root = XmlIO.getRoot(file);
		Element node = XmlIO.getElementByNodeText(XmlIO.getElements(root, NodeName), nodeName, nodeText);

		return node;
	}
}
