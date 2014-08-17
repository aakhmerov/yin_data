package com.yin.bigdata.api.domain.repositories;

import com.yin.bigdata.api.domain.entities.AveragePriceObject;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by aakhmerov on 17/08/14.
 */
public interface AveragePriceObjectRepository extends CrudRepository<AveragePriceObject,Long> {
}
