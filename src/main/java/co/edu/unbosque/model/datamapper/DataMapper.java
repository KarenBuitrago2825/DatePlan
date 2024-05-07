package co.edu.unbosque.model.datamapper;

import co.edu.unbosque.model.dto.EventDTO;
import co.edu.unbosque.model.dto.UserDTO;
import co.edu.unbosque.model.entities.Event;
import co.edu.unbosque.model.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DataMapper {
    public static User userDTOToUser(UserDTO userDTO) {
        return new User(userDTO.getName(),
                userDTO.getAge(),
                userDTO.getMail());
    }
    public static UserDTO userToUserDTO(User user) {
        return new UserDTO(user.getName(),
                user.getAge(),
                user.getMail());
    }
    public static List<UserDTO> userListToUserDTOList(List<User> userList) {
        List<UserDTO> userDTOList = new ArrayList<UserDTO>();
        for (User user : userList) {
            userDTOList.add(userToUserDTO(user));

        }
        return userDTOList;
    }
    public static List<User> userDTOListToUserList(List<UserDTO> userDTOList) {
        List<User> userList = new ArrayList<>();
        for (UserDTO userDTO : userDTOList) {
            userList.add(userDTOToUser(userDTO));
        }
        return userList;
    }

    public static Event eventDTOToEvent(EventDTO eventDTO) {
        return new Event(eventDTO.getEventName(),
                eventDTO.getEventDescription(),
                eventDTO.getEventDate());
    }
    public static EventDTO eventToEventDTO(Event event) {
        return new EventDTO(event.getEventName(),
                event.getEventDescription(),
                event.getEventDate());
    }
    public static List<EventDTO> eventListToEventDTOList(List<Event> eventList) {
        List<EventDTO> eventDTOList = new ArrayList<>();
        for (Event event : eventList) {
            eventDTOList.add(eventToEventDTO(event));
        }
        return eventDTOList;
    }
    public static List<Event> eventDTOListToEventList(List<EventDTO> eventDTOList) {
        List<Event> eventList = new ArrayList<>();
        for (EventDTO eventDTO : eventDTOList) {
            eventList.add(eventDTOToEvent(eventDTO));
        }
        return eventList;
    }
}
