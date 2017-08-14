//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.12 at 12:04:13 AM EDT 
//


package com.websystique.springboot.model.student;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the student package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Student_QNAME = new QName("", "Student");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: student
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StudentType }
     * 
     */
    public StudentType createStudentType() {
        return new StudentType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link SchoolType }
     * 
     */
    public SchoolType createSchoolType() {
        return new SchoolType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Student")
    public JAXBElement<StudentType> createStudent(StudentType value) {
        return new JAXBElement<StudentType>(_Student_QNAME, StudentType.class, null, value);
    }

}