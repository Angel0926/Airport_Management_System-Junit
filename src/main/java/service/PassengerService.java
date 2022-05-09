package service;

import model.PassInTrip;
import model.Passenger;

import java.util.List;

public interface PassengerService {



    Passenger getById(long id);

    void delete(long id);

    public void save(Passenger passenger);

    void update(long id, Passenger passenger);

    List<Passenger> getAll();

    List<Passenger> get(int offset, int perPage, String sort);


    List<Passenger> getPassengersOfTrip(long tripNumber);


    void registerTrip(PassInTrip passInTrip);

    void cancelTrip(long passengerId, long tripNumber);
}
