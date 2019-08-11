package com.softserve.rybka.hw3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task13Test {
    @Test
    public void belongRange(){
        assertTrue("Not in range", Task13.belongRange(4.2f));
    }
}