package main;

import model.entity.Booking;
import model.entity.Flight;
import model.entity.User;
import model.entity.UserDetails;
import repository.EmployeeRepository;
import repository.UserDetailsRepository;
import repository.impl.BookingRepositoryImpl;
import repository.impl.FlightRepositoryImpl;
import repository.impl.UserDetailsRepositoryImpl;
import repository.impl.UserRepositoryImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        UserRepositoryImpl user=new UserRepositoryImpl();
        UserDetailsRepositoryImpl userDetailsRepository=new UserDetailsRepositoryImpl();
        FlightRepositoryImpl flightRepository=new FlightRepositoryImpl();
        BookingRepositoryImpl bookingRepository=new BookingRepositoryImpl();
        Booking booking=new Booking();
        User newUser=new User();
        UserDetails userDetails=new UserDetails();
        Flight newFlight=new Flight();



        //Add user details in DB
//        userDetails.setEmail("test");
//        userDetails.setFirstName("test");
//        userDetails.setLastName("test");
//        userDetails.setPhoneNumber("test");
//        userDetailsRepository.save(userDetails);        //call the method to save into DB


        //Add user  in DB
//        newUser.setUsername("patrik");
//        newUser.setPassword("patrik");
//        newUser.setRole("1");
//        newUser.setUser_details(userDetails);
//        user.save(newUser);                             //call the method to save into DB

        //Add flight in DB
//        newFlight.setAirline("airline1");
//        newFlight.setFlightNumber("1");
//        newFlight.setDestination("1");
//        newFlight.setOrigin("Tir");
//        newFlight.setStatus("Pending");
//        flightRepository.save(newFlight);



          //get all flights
//        List<Flight> results=flightRepository.findAll();
//        results.forEach(flight -> {
//           System.out.println(flight.getAirline()+"\n"+
//                              flight.getFlightNumber()+"\n"+
//                              flight.getStatus()+"\n"+
//                              flight.getId());
//       });


//        //get user by ID
//        Optional<User> result=user.findById(20);
//        User userFound = result.get();
//        System.out.println(userFound.getUsername());

//
//
//
//        //get flight by ID
//        Optional<Flight> flightByID=flightRepository.findById(1);
//        Flight flightFound = flightByID.get();
//
//
//        //Save new booking
//       // booking.setBookingDate(new Date());
//        booking.setFlight(flightFound);
//        booking.setUser(userFound);
//        bookingRepository.save(booking);
//       // booking.setStatus("Booked");



//        List<User> results=user.findAll();
//        results.forEach(user1 -> {
//           System.out.println(user1.getUsername()+" "+
//                                user1.getUser_details().getEmail());
//
//       });






    }

}
