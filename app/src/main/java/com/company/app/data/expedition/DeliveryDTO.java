package com.company.app.data.expedition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class DeliveryDTO {


	private String dni;


	private String name;


	public DeliveryDTO(
			String dni,
			String name) {
		this.dni = dni;
		this.name = name;
	}
}
