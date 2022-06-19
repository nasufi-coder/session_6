package model.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "flight")

public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "origin", nullable = false)
    private String origin;

    @Column(name = "destination", nullable = false)
    private String destination;

    @Column(name = "airline")
    private String airline;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "departure_date")
    private Date departureDAte;

    @Column(name = "arrival_date")
    private Date arrivalDAte;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "flight")
    Set<Booking> bookings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDepartureDAte() {
        return departureDAte;
    }

    public void setDepartureDAte(Date departureDAte) {
        this.departureDAte = departureDAte;
    }

    public Date getArrivalDAte() {
        return arrivalDAte;
    }

    public void setArrivalDAte(Date arrivalDAte) {
        this.arrivalDAte = arrivalDAte;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
