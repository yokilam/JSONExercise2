package nyc.c4q.jsonexercise2;

/**
 * Created by yokilam on 12/10/17.
 */

public class Breed {
    private String name;
    private String[] classes;

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}