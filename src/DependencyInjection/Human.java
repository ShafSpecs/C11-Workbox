package DependencyInjection;

public class Human {
    private Walk walkInPidgin = new DorcasWalk();

    public Human(){}

    public Human(Walk newWalk){
        this.walkInPidgin = newWalk;
    }

    public void setWalk(Walk newWalk){
        this.walkInPidgin = newWalk;
    }

    public void walk(){
        walkInPidgin.walk();
    }
}
