package co.edu.unbosque.model.datasource;

import co.edu.unbosque.model.entities.Event;
import co.edu.unbosque.model.entities.User;

import java.util.ArrayList;

public class DataSource {
    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<Event> events = new ArrayList<Event>();


    public static User createUser(User user){
        users.add(user);
        return user;
    }
    public static Event createEvent(Event event){
        events.add(event);
        return event;
    }
    public static User updateUser(User user){
        int index = users.indexOf(user);
        users.set(index, user);
        return user;

    }
    public static Event updateEvent(Event event){
        int index = events.indexOf(event);
        events.set(index, event);
        return event;
    }
    public static User removeUser(User user){
        users.remove(user);
        return user;
    }
    public static Event removeEvent(Event event){
        events.remove(event);
        return event;
    }
    public static User getUser(int id){
        return users.get(id);
    }
    public static Event getEvent(int id){
        return events.get(id);
    }
    public static ArrayList<User> getAllUsers() {
        return users;
    }
    public static ArrayList<Event> getAllEvents() {
        return events;
    }
}
