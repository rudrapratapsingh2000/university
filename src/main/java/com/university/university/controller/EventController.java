package com.university.university.controller;

import com.university.university.model.EventModel;
import com.university.university.service.EventService;
import org.hibernate.sql.Delete;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/event-app")
public class EventController {
    @Autowired
    EventService eventService;
    @PostMapping("/addevent-api")
            public String addEvent(@RequestBody EventModel eventModel){
        return eventService.addEvent(eventModel);
    }
    @PutMapping("/update-api/id{id}")
            public String updateEvent(@PathVariable Integer id, @RequestBody EventModel eventModel){
        return eventService.updateEvent(id,eventModel);
    }
    @DeleteMapping("delete-api/id/{id}")
            public String DeleteEvent(@PathVariable Integer id){
        return eventService.deleteEvent(id);
    }
    @GetMapping("findall-api/date/{date}")
    public List<EventModel> findAllEventsByDate(@PathVariable Date date){
        return eventService.findAllEvents(date);
    }

}
