import { Product, EmailNotificationService, SMSNotificationService, ShoppingCart } from './index'; 

const mouse = new Product(1, 'Mouse', 500);
const laptop = new Product(2, 'Laptop', 15000); 
const monitor = new Product(3, 'Monitor', 3500); 

const cart = new ShoppingCart(new EmailNotificationService());
const cart2 = new ShoppingCart(new SMSNotificationService('9211744806'));
