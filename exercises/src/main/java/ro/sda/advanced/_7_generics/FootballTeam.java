package ro.sda.advanced._7_generics;

public class FootballTeam extends Team<FootballTeam> {
    public FootballTeam(String name) {
        super(name);
    }

}
