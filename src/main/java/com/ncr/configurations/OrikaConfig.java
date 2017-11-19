package com.ncr.configurations;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ncr.model.Manifest;
import com.ncr.model.Person;
import com.ncr.model.PersonIdData;
import com.ncr.model.QuoteRequest;
import com.ncr.model.nestedmapping.BasicPerson;
import com.ncr.model.nestedmapping.BasicPersonDto;

/**
 *
 * @author kartik
 */
@Configuration
public class OrikaConfig {

    @Bean
    public MapperFacade mapperFacadeBean(){
        final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory
                .classMap(BasicPerson.class, BasicPersonDto.class)
                .byDefault()
                .field("name.first", "firstName")
                .register();

        mapperFactory
                .classMap(QuoteRequest.class, QuoteRequest.class)
                .mapNulls(false)
                .mapNullsInReverse(false)
                .byDefault()
                .register();

        mapperFactory
                .classMap(Manifest.class, Manifest.class)
                .mapNulls(false)
                .mapNullsInReverse(false)
                .byDefault()
                .register();
        mapperFactory
                .classMap(Person.class, Person.class)
                .mapNulls(false)
                .mapNullsInReverse(false)
                .byDefault()
                .register();

        mapperFactory
                .classMap(PersonIdData.class, PersonIdData.class)
                .mapNulls(false)
                .mapNullsInReverse(false)
                .byDefault()
                .register();

        return mapperFactory.getMapperFacade();
    }

}
