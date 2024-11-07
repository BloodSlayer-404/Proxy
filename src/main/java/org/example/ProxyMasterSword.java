package org.example;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class ProxyMasterSword implements Item{

    private final int heroicLvl;
    private MasterSword realSword;

    /**
     * Check if the heroic level is high enough to use the Master Sword
     * @return A text indicating if the Master Sword was used or not
     */
    @Override
    public String use(){
        if (heroicLvl >= 10){
            if (realSword == null){
                realSword = new MasterSword();
            }
            return realSword.use();
        }
        return "The Master Sword looks heavy and emits a low bright... You need to do more heroic actions";
    }
}
