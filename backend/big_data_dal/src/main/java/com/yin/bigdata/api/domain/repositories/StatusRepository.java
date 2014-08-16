package com.yin.bigdata.api.domain.repositories;

import com.yin.bigdata.api.domain.entities.Status;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aakhmerov
 * Date: 5/13/13
 * Time: 12:47 AM
 * To change this template use File | Settings | File Templates.
 */
public interface StatusRepository extends CrudRepository<Status, Long> {
    List<Status> findByValue(String value);
}
