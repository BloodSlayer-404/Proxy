package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyMasterSwordTest {

    ProxyMasterSword link;

    /**
     * Check if the Proxy denies the access to the Master Sword if it doesn't have enough
     * heroic level
     */
    @Test
    void insufficientHeroicLvl(){
        link = new ProxyMasterSword(5);

        assertEquals("The Master Sword looks heavy and emits a low bright... " +
                        "You need to do more heroic actions",
                link.use());
    }

    /**
     * Check if the Proxy grants the access to the Master Sword if it has enough
     * heroic level
     */
    @Test
    void enoughHeroicLvl(){
        link = new ProxyMasterSword(15);

        assertEquals("¡The Master Sword shines with power and defeats the dark enemies!",
                link.use());
    }

}