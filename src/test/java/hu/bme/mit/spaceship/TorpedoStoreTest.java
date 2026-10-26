package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.NullEnum;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void fire_Empty_Fail() {
        // Arrange
        TorpedoStore store = new TorpedoStore(0);

        // Act & Assert
        // Azt várjuk, hogy az IllegalArgumentException kivétel megérkezzen
        assertThrows(IllegalArgumentException.class, () -> {
            store.fire(1);
        });
        
        // Ellenőrizzük, hogy a torpedók száma továbbra is 0 maradt
        assertEquals(0, store.getTorpedoCount());
    }

    @Test
    void fireLaser_Single() {
        // Arrange
        GT4500 ship = new GT4500();

        // Act
        boolean result = ship.fireLaser(FiringMode.ALL);

        // Assert
        // A feladat alap kódjában a lézer általában nincs implementálva, 
        // így false visszatérést várunk. Ha nálatok működik, írd át true-ra!
        assertFalse(result); 
    }
}
