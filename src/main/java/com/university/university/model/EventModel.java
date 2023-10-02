package com.university.university.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "event")
public class EventModel {
    @Id
    private Integer eventId;
    private String eventName;
    private String locationOfEvent;
    private Date date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
