package com.company.app.data.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class IdentifierDTO extends DTO {


	private Integer id;


	public IdentifierDTODTO(
			Integer id) {
		this.id = id;
	}
}
