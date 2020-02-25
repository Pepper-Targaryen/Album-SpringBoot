package com.sjtu.album.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjtu.album.entity.Photo;

public interface PhotoDao extends JpaRepository<Photo, Integer>{
	
}
