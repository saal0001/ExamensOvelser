package ovelse17;

public class Main {

    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("saka","sakas party",2000);
        Candidate candidate2 = new Candidate("anas","sakas party",3100);
        Candidate candidate3 = new Candidate("mo","sakas party",500);
        Candidate candidate4 = new Candidate("shabnam","sakas party",300);
        Candidate candidate5 = new Candidate("rikke","SF",300);
        Candidate candidate6 = new Candidate("svin","LA",300);

        Election election = new Election();

        election.add(candidate1);
        election.add(candidate2);
        election.add(candidate3);
        election.add(candidate4);
        election.add(candidate5);
        election.add(candidate6);

        System.out.println(election.getTotalVotes());

        System.out.println(election.getMemberFromSameParty(candidate2));


    }
}
