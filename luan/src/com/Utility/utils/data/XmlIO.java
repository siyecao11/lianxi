package com.Utility.utils.data;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlIO {
	
	//得到Document对象
		public static Document getDocument(String xmlPath)  {
			SAXReader reader = new SAXReader();
			File file = new File(xmlPath);
			Document document = null;
			try {
				
				document = reader.read(file);
					//document = reader.read(new ByteArrayInputStream(xmlPath.getBytes("utf-8")));//读取xml字符串，注意这里要转成输入流  
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			return document;
		}
		 //获得根节点
		public static Element getRoot(String xmlPath) {
			SAXReader reader = new SAXReader();
			File file = new File(xmlPath);
			Document document = null;
			try {
				document = reader.read(file);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			Element root = document.getRootElement();//获取根元素
			return root;
		}

		public static List<Element> getElements(Element element, String nodeName) {
			@SuppressWarnings("unchecked")
			List<Element> nodes = element.elements(nodeName);
			//List<Element> childElements = root.elements();//获取当前元素下的全部子元素  
			return nodes;
		}
		
		//定位某个元素
				public static Element getElementByName(List<Element> elements, String a) {
					Element element = null;
					for (Element subElement : elements) {
						List<Element> l = subElement.elements();
						for (Element element2 : l) {
							if(element2.getName().equals("url")){
								element = element2;
							}
							System.out.println(element2.getName());
						}
					}
					return element;
				}

		public static Element getElementById(List<Element> elements, String ID) {
			Element element = null;
			for (Element subElement : elements) {
				if (subElement.attribute("ID").getText().equals(ID)) {
					element = subElement;
					break;
				}
			}
			return element;
		}

		public static Element getElementByNodeText(List<Element> elements, String nodeText, String companyName) {
			Element element = null;
			for (Element subElement : elements) {
				if (subElement.element(nodeText).getText().equals(companyName)) {
					element = subElement;
				}
			}

			return element;
		}

	
	}


