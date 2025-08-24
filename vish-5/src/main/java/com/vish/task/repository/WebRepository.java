package com.vish.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vish.task.webtask.WebTask;

public interface WebRepository extends JpaRepository<WebTask , String> {

}
