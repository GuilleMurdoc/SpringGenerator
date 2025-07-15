package com.company.app.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class ErrorDTO {


	private String title;


	private String message;


	public ErrorDTO(
			String title,
			String message) {
		this.title = title;
		this.message = message;
	}
}
