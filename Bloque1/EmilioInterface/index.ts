class Product {
    private id: number
    private name: string
    private price: number
    private discount: number

    constructor(id:number,name:string, price:number){
        this.id = id
    }


    getId() {
        return this.id
    }

    getName(): string {
        return this.name
    }

    getPrice(): number {
        return this.price
    }

    getDiscount(): number {
        return this.discount
    }

    getPriceWithDiscount(): number{
        return this.price * (1- this.discount / 100)
    }

    applyDiscount(discount: number): number {
        this.discount = discount
        return this.getPriceWithDiscount()
    }
}

interface NotificationService {
    sendNotification(message: string): void
}

class EmailNotificationService implements NotificationService{
    sendNotification(message: string) {
        console.log(message)
    }
}

class SmsNotificationService implements NotificationService{
    private phoneNumber: string

    constructor(phoneNumber: string){
        this.phoneNumber = phoneNumber
    }

    sendNotification(message: string): void {
        console.log(`${message}, mensaje enviado a ${this.phoneNumber}`)
    }
}

class ShoppingCart {
    private products: Product[]
    private notificationService: NotificationService

    constructor(notificationService: NotificationService){
        this.notificationService = notificationService
        this.products = []
    }

    addProduct(...newProducts: Product[]){
        newProducts.forEach(product => this.products.push(product))
            
    }

    showProducts(): void {
        console.log("Tu carrito: ")
        this.products.forEach((product,index) => {
            if(product.getDiscount() > 0){
                console.log(`${index + 1}. ${product.getName()}, Precio original: $${product.getPrice()}MXN, Precio con descuento: $${product.getPriceWithDiscount()}MXN`)
            } else {
                console.log(`${index+ 1}. ${product.getName()}, por: ${product.getPrice()}MXN`)
            }
        })
    }

    checkout(){
        this.notificationService.sendNotification("New")
        this.showProducts
    }   
}