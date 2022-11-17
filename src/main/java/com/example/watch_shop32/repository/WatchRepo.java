package com.example.watch_shop32.repository;

import com.example.watch_shop32.entity.WatchEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepo extends CrudRepository<WatchEntity, Integer> {

}
