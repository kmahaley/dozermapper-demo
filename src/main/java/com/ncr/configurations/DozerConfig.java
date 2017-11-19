package com.ncr.configurations;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ncr.service.mapping.MappingBuilder;

/**
 * @author kartik
 */
@Configuration
public class DozerConfig {

    @Bean
    public Mapper DozerMapper(MappingBuilder mappingBuilder) {
        List<String> mappingFiles = new ArrayList<String>();
        final DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.setMappingFiles(mappingFiles);
        mapper.addMapping(mappingBuilder);

        return mapper;
    }

    @Bean
    public MappingBuilder mappingBuilder() {
        return new MappingBuilder();
    }
}
