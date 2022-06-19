package repository.impl;

import configuration.EntityManagerConfiguration;
import model.entity.Flight;
import model.entity.User;
import repository.FlightRepository;
import repository.UserRepository;
import util.Queries;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class FlightRepositoryImpl implements FlightRepository {

    private EntityManager entityManager = EntityManagerConfiguration.getEntityManager();

    @Override
    public List<Flight> findAll() {
        TypedQuery<Flight> result = entityManager.createQuery(Queries.FIND_ALL_Flights, Flight.class);
        return result.getResultList();
    }

    @Override
    public Optional<Flight> findById(Integer id) {
        return Optional.ofNullable(entityManager.find(Flight.class, id));
    }

    @Override
    public void save(Flight flight) {
        entityManager.getTransaction().begin();
        entityManager.persist(flight);
        entityManager.getTransaction().commit();
    }
}