import org.springframework.context.annotation.Scope;

@Scope(value = "prototype") //??????
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
