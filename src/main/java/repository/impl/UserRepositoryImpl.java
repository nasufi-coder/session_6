package repository.impl;

import configuration.EntityManagerConfiguration;
import model.entity.Employee;
import model.entity.User;
import repository.UserRepository;
import util.Queries;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {

    private EntityManager entityManager = EntityManagerConfiguration.getEntityManager();

    @Override
    public List<User> findAll() {
        TypedQuery<User> result = entityManager.createQuery(Queries.FIND_ALL_Users, User.class);

        return result.getResultList();

    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.ofNullable(entityManager.find(User.class, id));
    }

    @Override
    public void save(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();

    }
}
