package com.ncr.service;

import java.util.UUID;

import org.dozer.DozerBeanMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ncr.model.PersonData;
import com.ncr.model.PersonIdData;
import com.ncr.model.PersonViewData;

/**
 * @author km185223
 */
@RestController
@RequestMapping("/service")
public class ServiceImp {

    DozerBeanMapper mapper= new DozerBeanMapper();

    @RequestMapping(value = "/{salary}",method = RequestMethod.POST)
    public PersonViewData readBookmarks(@RequestBody PersonData input, @RequestParam("age") int age, @PathVariable("salary") String salary ) {
        PersonIdData id = new PersonIdData();
        id.setId(UUID
                .randomUUID()
                .toString());

        PersonViewData personViewData = mapper.map(input, PersonViewData.class);
        personViewData.setIdData(id);
        personViewData.setSalary(Integer.valueOf(salary));
        personViewData.setAge(age);
        return personViewData;

    }


    @RequestMapping(value = "/{age}", method = RequestMethod.GET)
    public String post(@PathVariable("age") Long age) {
        return "hello-" + age;
    }
}
