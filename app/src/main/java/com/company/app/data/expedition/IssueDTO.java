package com.company.app.data.expedition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class IssueDTO {


	private String description;


	private Integer id;


	public IssueDTO(
			String description,
			Integer id) {
		this.description = description;
		this.id = id;
	}
}
