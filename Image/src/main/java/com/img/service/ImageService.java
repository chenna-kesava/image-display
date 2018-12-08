/*
 *  Copyright 2018 WickedRide Adventure Services Private Limited.
 *  All Rights Reserved.
 *  For BOUNCE a unit of WickedRide "AS IS" PROPRIETARY/CONFIDENTIAL.
 *  Use is subject to license terms under employee agreement.
 *
 *  @version   1.0, 04-Dec-2018
 *  @author    roja
 */
package com.img.service;

import com.img.entity.Image;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public interface ImageService {

    String saveImage(Image image);

    List<Image> fetchImages();

}
