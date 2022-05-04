package service.impl;

import dao.impl.TripDaoImpl;
import model.Trip;
import org.hibernate.SessionFactory;
import service.TripService;

import java.util.List;
import java.util.Set;


public class TripServiceImpl implements TripService {

    private SessionFactory sessionFactory;
    private TripDaoImpl tripDao;

    public TripServiceImpl(SessionFactory sessionFactory, TripDaoImpl tripDao) {
        this.sessionFactory = sessionFactory;
        this.tripDao = tripDao;
    }

    @Override
    public void save(Trip trip) {

        tripDao.createTrip(trip);
    }

    @Override
    public void getById(long id) {
        System.out.println(tripDao.getTripById(id));
    }

    @Override
    public void update(Long id, Trip trip) {
        tripDao.update(id, trip);
    }

    @Override
    public void delete(long id) {
        tripDao.deleteById(id);
    }

    @Override
    public void getAll() {
        tripDao.getAll();
    }

    @Override
    public Set<Trip> get(int offset, int perPage, String sort) {
        return null;
    }


    @Override
    public List<Trip> getTripsFrom(String city) {
        return null;
    }

    @Override
    public List<Trip> getTripsTo(String city) {
        return null;
    }


}
