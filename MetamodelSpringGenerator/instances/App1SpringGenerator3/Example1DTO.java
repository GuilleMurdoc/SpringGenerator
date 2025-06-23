package base.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Example1DTO extends DTO {

	private List<String> example;

	@Nullable
	private Double Property2;


	public Example1DTODTO(
			List<String> example,
			Double Property2) {
		this.example = example;
		this.Property2 = Property2;
	}
}
