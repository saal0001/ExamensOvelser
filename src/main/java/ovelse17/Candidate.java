package ovelse17;

public class Candidate {
    private String name;
    private String party;
    private int vote;

    public Candidate(String name, String party, int vote) {
        this.name = name;
        this.party = party;
        this.vote = vote;

    }

    public int getVote(){
        return vote;
    }

    public String getParty(){
        return party;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", party='" + party + '\'' +
                ", vote=" + vote +
                '}';
    }
}
