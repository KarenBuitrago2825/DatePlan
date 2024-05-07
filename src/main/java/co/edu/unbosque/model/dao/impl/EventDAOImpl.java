package co.edu.unbosque.model.dao.impl;

import co.edu.unbosque.model.dao.EventDAO;
import co.edu.unbosque.model.datasource.DataSource;
import co.edu.unbosque.model.entities.Event;

import java.util.List;

public class EventDAOImpl implements EventDAO {
    @Override
    public Event create(Event event) {
        return DataSource.createEvent(event);
    }

    @Override
    public Event update(Event event) {
        return DataSource.updateEvent(event);
    }

    @Override
    public Event delete(Event event) {
        return DataSource.removeEvent(event);
    }

    @Override
    public Event find(String id) {
        return DataSource.getEvent(Integer.parseInt(id));
    }

    @Override
    public List<Event> findAll() {
        return DataSource.getAllEvents();
    }
}
