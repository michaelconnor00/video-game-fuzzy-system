package fuzzysys;

/**
 * Created by Nick Taylor on 3/25/2016.
 * Holds values necessary for a Rule in the RuleBase
 */
public class Rule {

    //PRIVATE MEMBER DATA
    Genre myGenre;
    TraitValue anxietyValue;
    TraitValue attentionToDetailValue;
    TraitValue patienceValue;
    TraitValue reactionTimeValue;
    TraitValue persistenceValue;
    TraitValue excitementValue;
    TraitValue competitiveValue;
    TraitValue planningValue;
    TraitValue teamworkValue;


    public Rule(Genre genre)
    {
        myGenre = genre;
    }
}
