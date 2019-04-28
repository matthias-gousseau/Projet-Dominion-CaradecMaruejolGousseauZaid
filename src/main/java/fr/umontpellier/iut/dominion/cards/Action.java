package fr.umontpellier.iut.dominion.cards;


public abstract class Action extends Card {
    /**
     * Constructeur
     *
     * @param name Le nom de la carte.
     * @param cost Le coût de la carte.
     * @param nbAction Le(s) nombre d'action(s) de la carte.
     */
    private int numberOfAction;

    public Action(String name, int cost , int nbAction) {
        super(name, cost);
        this.numberOfAction = nbAction;
    }

    public int getNumberOfAction() {
        return numberOfAction;
    }

}