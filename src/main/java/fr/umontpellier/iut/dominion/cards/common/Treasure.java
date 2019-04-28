package fr.umontpellier.iut.dominion.cards.common;


import fr.umontpellier.iut.dominion.Player;
import fr.umontpellier.iut.dominion.cards.Card;

public abstract class Treasure extends Card {
        /**
         * Constructeur
         *
         * @param name le nom de la carte.
         * @param cost le coût de la carte.
         * @param tpoint le(s) treasure points de la carte.
         */
        private int treasurePoints;

        public Treasure(String name, int cost , int tpoint) {
            super(name, cost);
            this.treasurePoints= tpoint;
        }

        /*@Override
        public int getTreasureValue(Player p) {
            return treasurePoints;
        }*/
    }

