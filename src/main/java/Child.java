import java.io.Serial;
import java.io.Serializable;

public class Child implements Serializable {
    @Serial
    private static final long serialVersionUID = 2L;
    int age=50;
    String name="saddam hussein Junior";
    ChildOfChild childOfChild= new ChildOfChild();
}
