

public class ExpertState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Experience is increasing.");
        character.gainExperience(25);
        if (character.getExperiencePoints() >= 150) {
            System.out.println("You have reached Master level.");
            character.setState(new MasterState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println(" Your health is replenished.");
        character.gainHealth(20);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Engaged in battle health decreases");
        character.loseHealth(25);
        character.gainExperience(35);
        if (character.getHealthPoints() <= 0) {
            System.out.println(" The journey ends here.");
        }
    }
}
