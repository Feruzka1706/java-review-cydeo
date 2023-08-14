package lambda_review;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Car {

    private String make;
    private int topSpeed;
    private int year;
}
