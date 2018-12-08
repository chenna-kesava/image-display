/*
 *  Copyright 2018 WickedRide Adventure Services Private Limited.
 *  All Rights Reserved.
 *  For BOUNCE a unit of WickedRide "AS IS" PROPRIETARY/CONFIDENTIAL.
 *  Use is subject to license terms under employee agreement.
 *
 *  @version   1.0, 04-Dec-2018
 *  @author    roja
 */
package com.img.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {

    private static final Logger LOG = LoggerFactory.getLogger(Image.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name="image",columnDefinition="mediumblob")
    private byte[] image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

}
