package com.company.app.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ErrorDTO extends DTO {


	private String title;


	private String message;


	public ErrorDTODTO(
			String title,
			String message) {
		this.title = title;
		this.message = message;
	}
}
