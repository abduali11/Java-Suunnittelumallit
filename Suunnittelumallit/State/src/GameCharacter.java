

public class GameCharacter {
    private String name;
    private int experiencePoints;
    private int healthPoints;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.experiencePoints = 0;
        this.healthPoints = 100;
        this.state = new NoviceState();
    }

    // Getterit ja setterit
    public String getName() {
        return name;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void gainExperience(int points) {
        experiencePoints += points;
        System.out.println(name + " earned " + points + " experience points.");
    }

    public void gainHealth(int points) {
        healthPoints = Math.min(100, healthPoints + points);
        System.out.println(name + " restored " + points + " health points.");
    }

    public void loseHealth(int points) {
        healthPoints = Math.max(0, healthPoints - points);
        System.out.println(name + " lost " + points + " health points.");
    }

    public void setState(State state) {
        this.state = state;
        System.out.println(name + " has advanced to " + state.getClass().getSimpleName() + " level.");
    }


    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }

    public void displayStatus() {
        System.out.println("---- Character Status ----");
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experiencePoints);
        System.out.println("Health: " + healthPoints);
        System.out.println("Current State: " + state.getClass().getSimpleName());
        System.out.println("--------------------------");
    }
}
