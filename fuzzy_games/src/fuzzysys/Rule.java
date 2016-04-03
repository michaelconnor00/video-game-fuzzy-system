package fuzzysys;

/**
 * Created by Nick Taylor on 3/25/2016.
 * Holds values necessary for a Rule in the RuleBase
 */
public class Rule {



    //PRIVATE MEMBER DATA
//    private Genre myGenre;
    private TraitValue anxietyValue;
    private TraitValue attentionToDetailValue;
    private TraitValue patienceValue;
    private TraitValue reactionTimeValue;
    private TraitValue persistenceValue;
    private TraitValue excitementValue;
    private TraitValue competitiveValue;
    private TraitValue planningValue;
    private TraitValue teamworkValue;
    private Compatibility compatibilitySet;

    public Compatibility getCompatibilityMembership(double value) {
        // TODO adjust function as output
        return compatibilitySet;
    }

    public void setCompatibilitySet(Compatibility compatibilitySet) {
        this.compatibilitySet = compatibilitySet;
    }

    public Rule(){}

//    public Rule(Genre genre)
//    {
//        myGenre = genre;
//    }
//
//    public Genre getMyGenre() {
//        return myGenre;
//    }
//
//    public void setMyGenre(Genre myGenre) {
//        this.myGenre = myGenre;
//    }

    public double getAnxietyValue(double value) {
        return anxietyValue.getMembership(value);
    }

    public void setAnxietyValue(TraitValue anxietyValue) {
        this.anxietyValue = anxietyValue;
    }

    ////

    public double getAttentionToDetailValue(double value) {
        return attentionToDetailValue.getMembership(value);
    }

    public void setAttentionToDetailValue(TraitValue attentionToDetailValue) {
        this.attentionToDetailValue = attentionToDetailValue;
    }

    ////

    public double getPatienceValue(double value) {
        return patienceValue.getMembership(value);
    }

    public void setPatienceValue(TraitValue patienceValue) {
        this.patienceValue = patienceValue;
    }

    ////

    public double getReactionTimeValue(double value) {
        return reactionTimeValue.getMembership(value);
    }

    public void setReactionTimeValue(TraitValue reactionTimeValue) {
        this.reactionTimeValue = reactionTimeValue;
    }

    ////

    public double getPersistenceValue(double value) {
        return persistenceValue.getMembership(value);
    }

    public void setPersistenceValue(TraitValue persistenceValue) {
        this.persistenceValue = persistenceValue;
    }

    ////

    public double getExcitementValue(double value) {
        return excitementValue.getMembership(value);
    }

    public void setExcitementValue(TraitValue excitementValue) {
        this.excitementValue = excitementValue;
    }

    ////

    public double getCompetitiveValue(double value) {
        return competitiveValue.getMembership(value);
    }

    public void setCompetitiveValue(TraitValue competitiveValue) {
        this.competitiveValue = competitiveValue;
    }

    ////

    public double getPlanningValue(double value) {
        return planningValue.getMembership(value);
    }

    public void setPlanningValue(TraitValue planningValue) {
        this.planningValue = planningValue;
    }

    ////

    public double getTeamworkValue(double value) {
        return teamworkValue.getMembership(value);
    }

    public void setTeamworkValue(TraitValue teamworkValue) {
        this.teamworkValue = teamworkValue;
    }


// getrs for file output of rules
    public TraitValue getAnxietyLevel() {
        return anxietyValue;
    }

    public TraitValue getAttentionToDetailLevel() {
        return attentionToDetailValue;
    }

    public TraitValue getPatienceLevel() {
        return patienceValue;
    }

    public TraitValue getReactionTimeLevel() {
        return reactionTimeValue;
    }

    public TraitValue getPersistenceLevel() {
        return persistenceValue;
    }

    public TraitValue getExcitementLevel() {
        return excitementValue;
    }

    public TraitValue getCompetitiveLevel() {
        return competitiveValue;
    }

    public TraitValue getPlanningLevel() {
        return planningValue;
    }

    public TraitValue getTeamworkLevel() {
        return teamworkValue;
    }

    public Compatibility getCompatibilitySet() {
        return compatibilitySet;
    }
}


