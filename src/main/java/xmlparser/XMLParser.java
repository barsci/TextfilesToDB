package xmlparser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import model.Customer;
import org.xml.sax.SAXException;

public class XMLParser {

    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            UserDataParser handler = new UserDataParser();
            saxParser.parse(new File("C:/Users/Marcin/Downloads/dane-osoby.xml"), handler);
            List<Customer> customers = handler.getCustomerList();
            for(Customer c: customers) {
                System.out.println(c);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

}
