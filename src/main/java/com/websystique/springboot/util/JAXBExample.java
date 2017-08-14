package com.websystique.springboot.util;

import com.websystique.springboot.model.student.ObjectFactory;
import com.websystique.springboot.model.student.StudentType;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {
    public static void main(String[] args) {

        try {

            File file = new File("C:\\jack_work\\SpringBootCRUDApplicationExample\\samples\\Student.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance("com.websystique.springboot.model.student");
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement<StudentType> student = (JAXBElement<StudentType>) jaxbUnmarshaller.unmarshal(file);
            System.out.println(student.getValue().toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}