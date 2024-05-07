package co.edu.unbosque.model.dto;

import java.time.LocalDateTime;

public class EventDTO {
    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDate;

    public EventDTO() {
    }

    public EventDTO(String eventName, String eventDescription, LocalDateTime eventDate) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "EventDTO{" +
                "eventName='" + eventName + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventDate=" + eventDate +
                '}';
    }
}
