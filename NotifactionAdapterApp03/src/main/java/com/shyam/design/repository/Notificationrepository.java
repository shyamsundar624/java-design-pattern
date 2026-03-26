package com.shyam.design.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.design.entity.Notificatin;

public interface Notificationrepository extends JpaRepository<Notificatin, Long> {

}
