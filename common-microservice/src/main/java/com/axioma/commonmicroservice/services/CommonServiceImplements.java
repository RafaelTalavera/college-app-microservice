package com.axioma.commonmicroservice.services;




import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public class CommonServiceImplements<E, R extends CrudRepository<E, Long>> implements CommonService<E> {

    private R curdRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<E> findAll() {
        return curdRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<E> findById(Long id) {
        return curdRepository.findById(id);
    }

    @Override
    @Transactional
    public E save(E entity) {
        return curdRepository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        curdRepository.deleteById(id);

    }
}
