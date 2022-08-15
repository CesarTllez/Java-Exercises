package src.main.java.co.org.mycompany.javaexercises.Model.Inheritance;

public class SoccerPlayer extends Person {

    private String team;

    public SoccerPlayer(){
        super();
    }

    /**
     * 
     * @param fullName
     * @param age
     * @param idCard
     * @param team
     */
    public SoccerPlayer(String fullName, byte age, int idCard, String team) {
        super(fullName, age, idCard);
        this.team = team;
    }

    @Override
    public String introduceOneself() {
        return super.introduceOneself()+" Also, I play in "+team+" team.";
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

}
