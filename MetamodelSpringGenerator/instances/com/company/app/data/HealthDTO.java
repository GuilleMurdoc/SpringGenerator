package com.company.app.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class HealthDTO {


	private String title;


	private String message;


	private String status;


	public HealthDTO(
			String title,
			String message,
			String status) {
		this.title = title;
		this.message = message;
		this.status = status;
	}
}
