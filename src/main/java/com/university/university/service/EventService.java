package com.university.university.service;

import com.university.university.model.EventModel;
import com.university.university.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;

    public String addEvent(EventModel eventModel) {
        eventRepository.save(eventModel);
        return "Event added Successfuly";
    }

    public String updateEvent(Integer id, EventModel eventModel) {
        EventModel eventModel1=eventRepository.findById(id).get();
        if(eventModel!=null){
            eventModel1.setEventName(eventModel.getEventName());
            eventModel1.setLocationOfEvent(eventModel.getLocationOfEvent());
            eventModel1.setDate(eventModel.getDate());
            eventModel1.setStartTime(eventModel.getStartTime());
            eventModel1.setEndTime(eventModel.getEndTime());
            return "Event updated Successfully";
        }
        else{
            return "Event Not Found";
        }
    }

    public String deleteEvent(Integer id) {
        eventRepository.deleteById(id);
        return "Event Deleted Successfully";
    }

    public List<EventModel> findAllEvents(Date date) {
        return eventRepository.findAllByDate(date);
    }
}
