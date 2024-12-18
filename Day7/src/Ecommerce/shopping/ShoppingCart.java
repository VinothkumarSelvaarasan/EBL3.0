package com.wecp.shopping;

import java.util.ArrayList;
import java.util.List;
import com.wecp.exceptions.*;

public class ShoppingCart {
    private List<Item> cart = new ArrayList<>();

    public void addItem(Item item, Boolean isItemValid) throws InvalidItemException,
     DuplicateItemException, 
     NullItemException, 
     InvalidQuantityException {
        if (!isItemValid) {
            throw new InvalidItemException("Item is invalid.");
        }

        if (item == null) {
            throw new NullItemException("Item cannot be null.");
        }

        if (item.getQuantity() <= 0) {
            throw new InvalidQuantityException("Quantity must be greater than zero.");
        }

        if (cart.contains(item)) {
            throw new DuplicateItemException("Item already exists in the cart.");
        }

        cart.add(item);
    }

    public void removeItem(Item item) throws EmptyCartException, NullItemException {
        if (cart.isEmpty()) {
            throw new EmptyCartException("Cart is empty.");
        }

        if (item == null) {
            throw new NullItemException("Item cannot be null.");
        }

        // Remove item from the cart
        cart.remove(item);
    }

    public void checkout(boolean isUserAuthorized, boolean isCheckoutSuccess) 
    throws InsufficientStockException,
     CheckoutFailureException, 
     UnauthorizedAccessException {
        if (!isUserAuthorized) {
            throw new UnauthorizedAccessException("User is not authorized to checkout.");
        }

        for (Item item : cart) {
            if (item.getQuantity() <= 0) {
                throw new InsufficientStockException("Insufficient stock for item: " + item.getName());
            }
        }

        if (!isCheckoutSuccess) {
            throw new CheckoutFailureException("Checkout failed due to an unspecified reason.");
        }

        cart.clear();
    }

    public List<Item> getCart() {
        return cart;
    }
}
