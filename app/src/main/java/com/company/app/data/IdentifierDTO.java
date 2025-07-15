package com.company.app.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class IdentifierDTO {


	private Integer id;


	public IdentifierDTO(
			Integer id) {
		this.id = id;
	}
}
