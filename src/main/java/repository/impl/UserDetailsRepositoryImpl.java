package repository.impl;

import configuration.EntityManagerConfiguration;
import model.entity.UserDetails;
import repository.UserDetailsRepository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class UserDetailsRepositoryImpl implements UserDetailsRepository {

    private EntityManager entityManager = EntityManagerConfiguration.getEntityManager();
    @Override
    public List<UserDetails> findAll() {
        return null;
    }

    @Override
    public Optional<UserDetails> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public void save(UserDetails userDetails) {
        entityManager.getTransaction().begin();
        entityManager.persist(userDetails);
        entityManager.getTransaction().commit();;
    }
}
