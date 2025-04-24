package org.howard.edu.lspfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * used chatgpt for debugging, and for helping run the test code
 */
public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    @DisplayName("Test adding a valid item")
    void testAddValidItem() {
        cart.addItem("Book", 15.99);
        assertEquals(1, cart.getCartSize());
    }

    @Test
    @DisplayName("Test adding item with zero price (expect exception)")
    void testAddItemWithZeroPrice() {
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("Book", 0));
    }

    @Test
    @DisplayName("Test adding item with negative price (expect exception)")
    void testAddItemWithNegativePrice() {
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("Book", -5.0));
    }

    @Test
    @DisplayName("Test applying discount code SAVE10")
    void testApplyDiscountSave10() {
        cart.applyDiscountCode("SAVE10");
        assertEquals(10.0, cart.getDiscountPercentage());
    }

    @Test
    @DisplayName("Test applying discount code SAVE20")
    void testApplyDiscountSave20() {
        cart.applyDiscountCode("SAVE20");
        assertEquals(20.0, cart.getDiscountPercentage());
    }

    @Test
    @DisplayName("Test applying invalid discount code (expect exception)")
    void testApplyInvalidDiscountCode() {
        assertThrows(IllegalArgumentException.class, () -> cart.applyDiscountCode("SAVE50"));
    }

    @Test
    @DisplayName("Test total cost without discount")
    void testTotalCostNoDiscount() {
        cart.addItem("Book", 10.0);
        cart.addItem("Pen", 5.0);
        assertEquals(15.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test total cost with discount")
    void testTotalCostWithDiscount() {
        cart.addItem("Book", 20.0);
        cart.addItem("Pen", 10.0);
        cart.applyDiscountCode("SAVE10");
        assertEquals(27.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test total cost with empty cart")
    void testTotalCostEmptyCart() {
        assertEquals(0.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test removing existing item")
    void testRemoveExistingItem() {
        cart.addItem("Book", 10.0);
        cart.removeItem("Book");
        assertEquals(0, cart.getCartSize());
    }

    @Test
    @DisplayName("Test removing non-existent item")
    void testRemoveNonExistentItem() {
        cart.removeItem("Book");  // should not crash
        assertEquals(0, cart.getCartSize());
    }

    @Test
    @DisplayName("Test cart size after multiple add/remove operations")
    void testCartSizeTracking() {
        cart.addItem("Book", 10.0);
        cart.addItem("Pen", 5.0);
        cart.removeItem("Book");
        assertEquals(1, cart.getCartSize());
    }
}
