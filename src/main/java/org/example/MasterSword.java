package org.example;

public class MasterSword implements Item{

    /**
     * The action when the Master Sword is activated with its full power
     * @return A text indicating that the Master Sword is activated
     */
    @Override
    public String use(){
        return "¡The Master Sword shines with power and defeats the dark enemies!";
    }
}
