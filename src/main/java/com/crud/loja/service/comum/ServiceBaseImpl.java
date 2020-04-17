package com.crud.loja.service.comum;

import com.crud.loja.domain.comum.EntidadeBase;
import com.crud.loja.domain.dto.comum.BaseDto;
import com.crud.loja.repository.comum.BaseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

public abstract class ServiceBaseImpl<E extends EntidadeBase,
        R extends BaseRepository<E>, D extends BaseDto> implements ServiceBase <E, D>{

    @Autowired
    protected R repositorio;

    @Autowired
    private ModelMapper mapper;

    public D findById(Long id) {
        verificaSeRegistroExiste(id);
        return  converterEntidadeParaDTO(repositorio.findById(id).get());
    }

    public List<D> findAll() {
        return repositorio.findAll().stream().map(this::converterEntidadeParaDTO).collect(Collectors.toList());
    }

    public E insert(D dto) {
        return repositorio.save(converterDTOParaEntidade(dto));
    }

    public E update(D dto) {
        return repositorio.save(converterDTOParaEntidade(dto));
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }

    public void verificaSeRegistroExiste(Long id) {
        if (!repositorio.findById(id).isPresent()) {
            throw new RuntimeException("Registro nao encontrado");
        }
    }

    protected E converterDTOParaEntidade(D dto) {
        Class<?> classeDoTipoParametrizado = getClasseDoTipoParametrizado(0);
        return mapper.map(dto, (Type) classeDoTipoParametrizado);
    }

    protected D converterEntidadeParaDTO(E entidade) {
        Class<?> classeDoTipoParametrizado = getClasseDoTipoParametrizado(2);
        return mapper.map(entidade, (Type) classeDoTipoParametrizado);
    }

    private Class<?> getClasseDoTipoParametrizado (Integer posicao) {
        return (Class<?>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[posicao];
    }
}
