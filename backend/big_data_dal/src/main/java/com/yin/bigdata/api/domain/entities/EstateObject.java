package com.yin.bigdata.api.domain.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aakhmerov on 16/08/14.
 */
@Entity
@XmlRootElement
@Table(name = "objects")
public class EstateObject extends AbstractPersistable<Long> {
}
