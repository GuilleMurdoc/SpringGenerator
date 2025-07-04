package com.company.app.data.expedition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class DeliveryDTO extends DTO {


	private String dni;


	private String name;


	public DeliveryDTODTO(
			String dni,
			String name) {
		this.dni = dni;
		this.name = name;
	}
}
