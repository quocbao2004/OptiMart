package com.Optimart.constants;

public class Permissions {
    public static final String ADMIN = "ADMIN.GRANTED";
    public static final String BASIC = "BASIC.PUBLIC";
    public static final String DASHBOARD = "DASHBOARD";
    public static final class MANAGE_PRODUCT {
        public static class Product {
            public static final String CREATE = "MANAGE_PRODUCT.PRODUCT.CREATE";
            public static final String UPDATE = "MANAGE_PRODUCT.PRODUCT.UPDATE";
            public static final String DELETE = "MANAGE_PRODUCT.PRODUCT.DELETE";
        }

        public static class ProductType {
            public static final String CREATE = "MANAGE_PRODUCT.PRODUCT_TYPE.CREATE";
            public static final String UPDATE = "MANAGE_PRODUCT.PRODUCT_TYPE.UPDATE";
            public static final String DELETE = "MANAGE_PRODUCT.PRODUCT_TYPE.DELETE";
        }
    }
    public static class System {
        public static class User {
            public static final String VIEW = "SYSTEM.USER.VIEW";
            public static final String CREATE = "SYSTEM.USER.CREATE";
            public static final String UPDATE = "SYSTEM.USER.UPDATE";
            public static final String DELETE = "SYSTEM.USER.DELETE";
        }

        public static class Role {
            public static final String VIEW = "SYSTEM.ROLE.VIEW";
            public static final String CREATE = "SYSTEM.ROLE.CREATE";
            public static final String UPDATE = "SYSTEM.ROLE.UPDATE";
            public static final String DELETE = "SYSTEM.ROLE.DELETE";
        }
    }

    public static class ManageOrder {
        public static class Review {
            public static final String UPDATE = "MANAGE_ORDER.REVIEW.UPDATE";
            public static final String DELETE = "MANAGE_ORDER.REVIEW.DELETE";
        }

        public static class Order {
            public static final String VIEW = "MANAGE_ORDER.ORDER.VIEW";
            public static final String CREATE = "MANAGE_ORDER.ORDER.CREATE";
            public static final String UPDATE = "MANAGE_ORDER.ORDER.UPDATE";
            public static final String DELETE = "MANAGE_ORDER.ORDER.DELETE";
        }
    }

    public static class Setting {
        public static class PaymentType {
            public static final String CREATE = "SETTING.PAYMENT_TYPE.CREATE";
            public static final String UPDATE = "SETTING.PAYMENT_TYPE.UPDATE";
            public static final String DELETE = "SETTING.PAYMENT_TYPE.DELETE";
        }

        public static class DeliveryType {
            public static final String CREATE = "SETTING.DELIVERY_TYPE.CREATE";
            public static final String UPDATE = "SETTING.DELIVERY_TYPE.UPDATE";
            public static final String DELETE = "SETTING.DELIVERY_TYPE.DELETE";
        }

        public static class City {
            public static final String CREATE = "CITY.CREATE";
            public static final String UPDATE = "CITY.UPDATE";
            public static final String DELETE = "CITY.DELETE";
        }
    }
}
