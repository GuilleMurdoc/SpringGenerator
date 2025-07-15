package com.company.app.data.expedition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CreationIssueDTO extends DTO {


	private String description;


	public CreationIssueDTO(
			String description) {
		this.description = description;
	}
}
