package com.yin.bigdata.api.domain.repositories;

import com.yin.bigdata.api.domain.entities.EstateObject;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by aakhmerov on 16/08/14.
 */
public interface ObjectsRepository  extends PagingAndSortingRepository<EstateObject,Long> {
}
