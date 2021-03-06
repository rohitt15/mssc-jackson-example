package com.developer.msscjackson.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

/*
 Created by Rohit on 09-11-2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;

	private OffsetDateTime createdDate;
	private OffsetDateTime lastUpdatedDate;
}
