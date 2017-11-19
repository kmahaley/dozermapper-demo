package com.ncr;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ncr.model.Destination;
import com.ncr.model.Person;
import com.ncr.model.PersonWithAnnotation;
import com.ncr.model.Source;

/**
 * @author kartik
 */
public class ApplicationTest {
    DozerBeanMapper mapper;
    List<String> mappingFileList;
    Source src;

    @Before
    public void initialize(){
        mappingFileList=new ArrayList<String>();
        mappingFileList.add("dozerBeanMapping.xml");
        mapper =new DozerBeanMapper();
        mapper.setMappingFiles(mappingFileList);

        src= new Source("mike", "murray", 54);
    }

    /**
     * mapping using mapping xml file
     * Attributes of the source and destination classes are of different name
     */
    @Test
    public void test1(){
        Destination dest = mapper.map(src, Destination.class);
        Assert.assertEquals("First Name equals",src.getName(),dest.getFirstName());
        Assert.assertEquals("Last Name equals",src.getSurname(),dest.getLastName());
        Assert.assertEquals("First Name equals",src.getAge(),dest.getAgeLived());

    }
    /**
     * Attributes of the source and destination classes are of same name
     */
    @Test
    public void test2(){
        Person person = mapper.map(src, Person.class);
        Assert.assertEquals("first name", "mike", person.getName());
    }

    /**
     * Bidirectional mapping
     */
    @Test
    public void test3(){
        Destination dest= new Destination("Dwayne", "Jhonson", 43);
        Source src = mapper.map(dest, Source.class);
        Assert.assertEquals("first name", "Dwayne", src.getName());
    }

    /**
     * Mapping using annotation
     */
    @Test
    public void test4(){
        PersonWithAnnotation personWithAnnotation = mapper.map(src, PersonWithAnnotation.class);
        Assert.assertEquals("first name", src.getName(), personWithAnnotation.getFName());
        PersonWithAnnotation person =new PersonWithAnnotation("Roger","Federer",36);
        Source source = mapper.map(person, Source.class);
        Assert.assertEquals(person.getYears(),source.getAge());
    }
}
