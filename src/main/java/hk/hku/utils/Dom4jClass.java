package hk.hku.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

public class Dom4jClass {
    public String getUserClass() throws DocumentException {
        File xmlFile = new File(this.getClass().getClassLoader().getResource("spring.xml").getPath());
        //new saxReader
        SAXReader saxReader = new SAXReader();
        //read xml file
        Document document = saxReader.read(xmlFile);
        //get root element
        Element rootElement = document.getRootElement();
        Element bean = rootElement.element("bean");
        String aClass = bean.attributeValue("class");
        return aClass;
    }
}
