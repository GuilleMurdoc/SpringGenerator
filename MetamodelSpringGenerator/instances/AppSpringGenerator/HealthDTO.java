package com.company.app.data.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class HealthDTO extends DTO {


	private String title;


	private String message;


	private String status;


	public HealthDTODTO(
			String title,
			String message,
			String status) {
		this.title = title;
		this.message = message;
		this.status = status;
	}
}
