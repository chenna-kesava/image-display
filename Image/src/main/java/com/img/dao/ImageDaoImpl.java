/*
 *  Copyright 2018 WickedRide Adventure Services Private Limited.
 *  All Rights Reserved.
 *  For BOUNCE a unit of WickedRide "AS IS" PROPRIETARY/CONFIDENTIAL.
 *  Use is subject to license terms under employee agreement.
 *
 *  @version   1.0, 04-Dec-2018
 *  @author    roja
 */
package com.img.dao;

import com.img.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDaoImpl extends JpaRepository<Image , Long> {

}
