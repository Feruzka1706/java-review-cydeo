package task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Builder
//@Builder generated an @AllArgConstructor unless there is another @XConstructor
/**
 * We usually don't use @Builder lombok annotation,
 * we need always @NoArgConstructor for each Model classes
 * and if we have @Builder (which creates AllArgConstructor unless there is no any other constructor)
 * and if we add NoArgConstructor together it will give compile error
 */
public class Orange {
    private int weight;
    private Color color;
}
