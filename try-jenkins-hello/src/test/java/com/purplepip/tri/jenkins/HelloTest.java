package com.purplepip.tri.jenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    @Test
    void testMessage() {
        assertEquals("Hello, me", new Hello().getMessage("me"));
    }
}
