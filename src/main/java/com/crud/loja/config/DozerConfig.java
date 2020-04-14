package com.crud.loja.config;


import com.crud.loja.domain.comum.EntidadeBase;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfig {
    @Bean
    public DozerBeanMapper dozerBeanMapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(objectMappingBuilder);
        return mapper;
    }

    BeanMappingBuilder objectMappingBuilder = new BeanMappingBuilder() {
        @Override
        protected void configure() {
            mapping(EntidadeBase.class, EntidadeBase.class);
        }
    };

}
