package Gamemodes.Load;

public class texts {
    private String id;
    private String out;


    public texts(String id, String out) {
        this.id = id;
        this.out = out;
    }

    @Override
    public String toString() {
        return "texts{" +
                "id='" + id + '\'' +
                ", out='" + out + '\'' +
                '}';
    }
}
