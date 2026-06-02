package Gamemodes.Load;

public class resolutions {
    private String resolution;
    private int resx;
    private int resy;


    public resolutions(String resolution, int resx, int resy) {

        this.resolution = resolution;
        this.resx = resx;
        this.resy = resy;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getResx() {
        return resx;
    }

    public void setResx(int resx) {
        this.resx = resx;
    }

    public int getResy() {
        return resy;
    }

    public void setResy(int resy) {
        this.resy = resy;
    }

    @Override
    public String toString() {
        return "resolutions{" +
                "resolution='" + resolution + '\'' +
                ", resx=" + resx +
                ", resy=" + resy +
                '}';
    }
}
