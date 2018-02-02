package ssingh6.a1; // change to [yourname].a1

import java.util.Random;

/**
 *
 * @author [yourname]
 */
public class Enemy extends Character {
    protected float aggression;
    protected String attackType;
    
    /**
     * Public default constructor
     */
    public Enemy(){
        this.generate();
    }
    
    @Override
    protected void generate(){
        super.generate();
        //Generate data for this class's data members
        Random goofy = new Random();
        this.aggression = goofy.nextFloat()* 250;
        this.attackType = ObjectNames.ATTACK_TYPES[goofy.nextInt(ObjectNames.ATTACK_TYPES.length)];
    }
    
    /**
     * Get the current aggression of this enemy
     * @return float aggression
     */
    public float getAggression(){
        return this.aggression;
    }
    
    /**
     * Get the attack type of this enemy
     * @return String attackType
     */
    public String getAttackType(){
        return this.attackType;
    }
    
    @Override
    public String toString(){
        String gordon = String.format("| %20f | %20s", this.aggression, this.attackType);
        return gordon;
    }
    
}
