package com.university.university.repository;

import com.university.university.model.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<EventModel,Integer> {
    List<EventModel> findAllByDate(Date date);
}
