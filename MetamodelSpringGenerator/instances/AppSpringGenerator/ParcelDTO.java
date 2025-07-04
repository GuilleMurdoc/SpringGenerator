package com.company.app.data.dtos.expedition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ParcelDTO extends DTO {


	private String status;


	private Double height;


	private Double width;


	private Double depth;


	private Double volume;


	private Double weight;


	private Integer id;


	public ParcelDTODTO(
			String status,
			Double height,
			Double width,
			Double depth,
			Double volume,
			Double weight,
			Integer id) {
		this.status = status;
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.volume = volume;
		this.weight = weight;
		this.id = id;
	}
}
