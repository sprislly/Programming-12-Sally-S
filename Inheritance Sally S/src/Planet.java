import java.util.ArrayList;

public class Planet {
    int orbitTime;
    String designation;
    ArrayList<Moon> moons;
    Planet(){
    }
    Planet(int orbitTime, String designation){
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

}

/* ulti
math quiz 30 min
memorize french 2hr
draw french 15 min
8:30 pm
rest programming
*/