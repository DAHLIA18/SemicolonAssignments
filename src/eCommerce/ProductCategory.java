package eCommerce;

import java.util.ArrayList;
import java.util.List;

enum ProductCategory {
        ELECTRONICS, GROCERIES, UTENSILS, CLOTHING
    }

    enum CardType {
        MASTER_CARD, VISA_CARD, VERVE, AMERICAN_EXPRESS
    }


    class User {
        private int age;
        private String email;
        private String homeAddress;
        private String name;
        private String password;
        private String phone;
    }


    class Customer extends User {
        private final List<BillingInformation> billingInformationList = new ArrayList<>();
        private final ShoppingCart shoppingCart = new ShoppingCart();
    }


    class Seller extends User {

    }


    class Admin extends User {

    }

    // Product class
    class Product {
        private int productId;
        private String productName;
        private double price;
        private String productDescription;
        private ProductCategory category;
    }


    class BillingInformation {
        private String receiverPhone;
        private String receiverName;
        private String deliveryAddress;
        private CreditCardInformation creditCardInformation;
    }


    class CreditCardInformation {
        private String cardCvv;
        private int expirationYear;
        private int expirationMonth;
        private String creditCardNumber;
        private String nameOnCard;
        private CardType cardType;
    }

    class Address {
        private String cityName;
        private String countryName;
        private String houseNumber;
        private String street;
        private String state;
    }


    class ShoppingCart {
        private final List<CartItem> items = new ArrayList<CartItem>();



        public void addItem(CartItem item) {
            items.add(item);
        }

        public void removeItem(CartItem item) {
            items.remove(item);
        }
    }


    class CartItem {
        private int quantity;
        private Product product;
    }

