package com.yin.bigdata.api.domain.repositories;

import com.yin.bigdata.api.domain.entities.RealEstatesHist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by aakhmerov on 16/08/14.
 */
public interface RealEstatesHistRepository extends PagingAndSortingRepository<RealEstatesHist,Long> {

}
