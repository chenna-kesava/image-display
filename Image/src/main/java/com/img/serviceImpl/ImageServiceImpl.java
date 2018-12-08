/*
 *  Copyright 2018 WickedRide Adventure Services Private Limited.
 *  All Rights Reserved.
 *  For BOUNCE a unit of WickedRide "AS IS" PROPRIETARY/CONFIDENTIAL.
 *  Use is subject to license terms under employee agreement.
 *
 *  @version   1.0, 04-Dec-2018
 *  @author    roja
 */
package com.img.serviceImpl;

import com.img.dao.ImageDaoImpl;
import com.img.entity.Image;
import com.img.service.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    private static final Logger LOG = LoggerFactory.getLogger(ImageServiceImpl.class);

    @Autowired
    ImageDaoImpl imageDaoImpl;

    @Override
    public String saveImage(Image image) {
        imageDaoImpl.save(image);
        return "success";
    }

    public List<Image> fetchImages(){
        return imageDaoImpl.findAll();
    }

}
