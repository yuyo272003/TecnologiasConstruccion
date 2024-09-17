import { DatabaseNotification } from "./Database";
import { EmailNotification } from "./EmailNotification";
import { NotificationManager } from "./NotificationManager";
import { PhoneNotification } from "./PhoneNotification";

const notificationManager = NotificationManager.getInstance(); 
const notificationManager2 = NotificationManager.getInstance(); 

const dbNotification = new DatabaseNotification(1);
const emailNotification = new EmailNotification('juliogm2003@hotmail.com');
const phoneNotification = new PhoneNotification('9211744806');

notificationManager.sendNotification('new user registred',dbNotification);
notificationManager2.sendNotification('confirm your email ',emailNotification);
notificationManager.sendNotification('your code access is 9558',phoneNotification)

console.log('History ',notificationManager.getNotificationHistory()) 

