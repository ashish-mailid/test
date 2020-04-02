package com.howtodoinjava.demo;
 
import java.io.File;
import java.io.StringWriter;
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
 
public class JaxbExample 
{
    public static void main(String[] args) 
    {
        //Java object. We will convert it to XML.
        Employee employee = new Employee(1, "Lokesh", "Gupta", new Department(101, "IT"));
         
        //Method which uses JAXB to convert object to XML
        jaxbObjectToXML(employee);
    }
 
    private static void jaxbObjectToXML(Employee employee) 
    {
        try
        {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
             
            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
           //Store XML to File
            File file = new File("employee.xml");
             
            //Writes XML file to file-system
            jaxbMarshaller.marshal(employee, file); 
         System.out.println(myFirstCs.getObject());
          System.out.println(rs.last());
         String + ;
          Iterator it = names.iterator();
        } 
        catch (JAXBException e) 
        {
            e.printStackTrace();
        }
    }
}

