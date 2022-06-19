package repository.impl;

import configuration.EntityManagerConfiguration;
import model.entity.Booking;
import repository.BookingRepository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class BookingRepositoryImpl implements BookingRepository {
    private EntityManager entityManager = EntityManagerConfiguration.getEntityManager();

    @Override
    public List<Booking> findAll() {
        return null;
    }

    @Override
    public Optional<Booking> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public void save(Booking booking) {
        entityManager.getTransaction().begin();
        entityManager.persist(booking);
        entityManager.getTransaction().commit();
    }
}
