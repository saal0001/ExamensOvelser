package ovelse17;

import java.util.ArrayList;

public class Election {

    private ArrayList<Candidate> candidateList = new ArrayList<>();
   private ArrayList<Candidate> sameParty = new ArrayList<>();

    public Election() {
    }


    public void add(Candidate candidate) {
        candidateList.add(candidate);
    }


    public int getTotalVotes() {
        int sum = 0;
        for (Candidate candidate : candidateList) {
            sum += candidate.getVote();
        }
        return sum;
    }

    public ArrayList getMemberFromSameParty(Candidate candidate) {
        sameParty.clear();
        for (Candidate candidate1 : candidateList) {
            if (candidate1.getParty().contains(candidate.getParty()))
                sameParty.add(candidate1);
        }
        return sameParty;
    }


}
