package com.app.FundFlowBackend.repository;

import com.app.FundFlowBackend.model.Stage;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class StageRepository extends SimpleJpaRepository<Stage, String> {
    private final EntityManager em;
    public StageRepository(EntityManager em) {
        super(Stage.class, em);
        this.em = em;
    }
    @Override
    public List<Stage> findAll() {
        return em.createNativeQuery("Select * from \"fundflowbackend61\".\"Stage\"", Stage.class).getResultList();
    }
}