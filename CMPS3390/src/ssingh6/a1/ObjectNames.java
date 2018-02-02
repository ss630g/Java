package ssingh6.a1;

/**
 * Interface given to be used when creating the different classes
 * of Objects
 * @author Jason Forsythe
 * Modified by: Simran Preet Singh
 */
public interface ObjectNames {

    /**
     * Names used to randomly generate 3d objects
     */
    public static final String[] OBJECT_3D_NAMES = {
        " Tree ", " Bush ", " Tresure Chest ", " Door ", " Window ", " Wall ",
        " Fence "," Gate "
    };
    
    /**
     * Names used to randomly generate pickups
     */
    public static final String[] PICK_UP_NAMES = {
        " Apple ", " Potion ", " Health Pack ", " Wood ", " Stone ", " Coal ",
        " Arrows ", " Iron ", " Siver ", " Gold ", " Dimond "
    };
    
    /**
     * Names used to randomly generate characters
     */
    public static final String[] CHARACTER_NAMES = {
        " Steve ", " Alex ", " Villager "
    };
    
    /**
     * Names used to randomly generate enemies
     */
    public static final String[] ENEMY_NAMES = {
        " Spider ", " Skeleton ", " Creeper ", " Goo "
    };
    
    /**
     * Names used to randomly generate attack types
     */
    public static final String[] ATTACK_TYPES = {
        " Melee ", " Ranged ", " Spell "
    };
}
