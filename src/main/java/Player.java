import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.management.ConstructorParameters;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Player {
    private final String name;
    private final int id;
    private int position;

    public Player(String name, int id, int position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }
}
