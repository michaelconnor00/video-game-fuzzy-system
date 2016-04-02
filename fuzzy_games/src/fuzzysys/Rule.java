package fuzzysys;

/**
 * Created by Nick Taylor on 3/25/2016.
 * Holds values necessary for a Rule in the RuleBase
 */
public class Rule {



    //PRIVATE MEMBER DATA
    private Genre myGenre;
    private TraitValue anxietyValue;
    private TraitValue attentionToDetailValue;
    private TraitValue patienceValue;
    private TraitValue reactionTimeValue;
    private TraitValue persistenceValue;
    private TraitValue excitementValue;
    private TraitValue competitiveValue;
    private TraitValue planningValue;
    private TraitValue teamworkValue;


    public Rule(Genre genre)
    {
        myGenre = genre;
    }

    public Genre getMyGenre() {
        return myGenre;
    }

    public void setMyGenre(Genre myGenre) {
        this.myGenre = myGenre;
    }

    public TraitValue getAnxietyValue() {
        return anxietyValue;
    }

    public void setAnxietyValue(TraitValue anxietyValue) {
        this.anxietyValue = anxietyValue;
    }

    public TraitValue getAttentionToDetailValue() {
        return attentionToDetailValue;
    }

    public void setAttentionToDetailValue(TraitValue attentionToDetailValue) {
        this.attentionToDetailValue = attentionToDetailValue;
    }

    public TraitValue getPatienceValue() {
        return patienceValue;
    }

    public void setPatienceValue(TraitValue patienceValue) {
        this.patienceValue = patienceValue;
    }

    public TraitValue getReactionTimeValue() {
        return reactionTimeValue;
    }

    public void setReactionTimeValue(TraitValue reactionTimeValue) {
        this.reactionTimeValue = reactionTimeValue;
    }

    public TraitValue getPersistenceValue() {
        return persistenceValue;
    }

    public void setPersistenceValue(TraitValue persistenceValue) {
        this.persistenceValue = persistenceValue;
    }

    public TraitValue getExcitementValue() {
        return excitementValue;
    }

    public void setExcitementValue(TraitValue excitementValue) {
        this.excitementValue = excitementValue;
    }

    public TraitValue getCompetitiveValue() {
        return competitiveValue;
    }

    public void setCompetitiveValue(TraitValue competitiveValue) {
        this.competitiveValue = competitiveValue;
    }

    public TraitValue getPlanningValue() {
        return planningValue;
    }

    public void setPlanningValue(TraitValue planningValue) {
        this.planningValue = planningValue;
    }

    public TraitValue getTeamworkValue() {
        return teamworkValue;
    }

    public void setTeamworkValue(TraitValue teamworkValue) {
        this.teamworkValue = teamworkValue;
    }
}


