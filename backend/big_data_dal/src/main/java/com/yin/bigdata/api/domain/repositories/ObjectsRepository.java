package com.yin.bigdata.api.domain.repositories;

import com.yin.bigdata.api.domain.entities.EstateObject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by aakhmerov on 16/08/14.
 */
public interface ObjectsRepository  extends PagingAndSortingRepository<EstateObject,Long> {
    @Query("select e from EstateObject e where e.isSkyline = TRUE")
    List<EstateObject> findSkyline();
}
