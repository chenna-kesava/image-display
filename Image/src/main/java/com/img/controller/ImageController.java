/*
 *  Copyright 2018 WickedRide Adventure Services Private Limited.
 *  All Rights Reserved.
 *  For BOUNCE a unit of WickedRide "AS IS" PROPRIETARY/CONFIDENTIAL.
 *  Use is subject to license terms under employee agreement.
 *
 *  @version   1.0, 03-Dec-2018
 *  @author    roja
 */
package com.img.controller;

import com.img.entity.Image;
import com.img.service.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
public class ImageController {

    private static final Logger LOG = LoggerFactory.getLogger(ImageController.class);

    @Autowired
    ImageService imageService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String testMethod(@RequestPart("file") MultipartFile file) throws IOException {
        byte[] mediaBytes = file.getBytes();
        Image image = new Image();
        image.setImage(mediaBytes);
        image.setName(file.getOriginalFilename());
        String status = imageService.saveImage(image);
        return status;
    }

    @RequestMapping(value = "/fetchImages" ,method = RequestMethod.GET)
    public List<Image> fetchAllImages(){
        List<Image> images = imageService.fetchImages();
        return images;
    }

}
