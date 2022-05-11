package com.ratana.khun.inventory_service.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 10, nullable = false)
    private String code;

    @Column(length = 255, nullable = false)
    private String nameKh;

    @Column(length = 255, nullable = false)
    private String nameEn;

    @Column(nullable = true)
    private Long parentId;

    @Column(length = 255, nullable = false)
    private String unit;

    private Integer order_number;

    @Column(nullable = true)
    private String description;
}
