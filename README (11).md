
# ***E-commerce API***

- The aim of the project is to perform the basic CRUD operations with some validations and mappings.
- Spring initializer was used to create a spring boot application project.


## **Frameworks and Languages used :**

- Java
- Spring Boot

## **Dependency used :**

- Spring web
- Spring Boot Dev Tool
- Lombok
- Validations
- MySQL Driver

## **Data Flow :**

## **Model :** 

- It consists of a  ___Userclass___ , ___OrdersClass___  , ___AddressClass___ and ___ProductClass___ which consists of Entity's used to model our data application.
- By using Lombok dependency , ___@Data___ , ___@AllArgsConstructor___ , ___@NoArgsConstructor___ is used to create getters and setters as well as default and parameterized constructors.

## **Controller :**

- It consists of ___UserController___ , ___OrderController___, ___ProductController___ and ___AddressController___ class which basically control the flow of data.
- ___@RestController___ annotation is used to make the RestaurantController class as controller layer.
- ___@GetMapping , @PostMapping , @PutMapping , @DeleteMapping___ annotations are used to perform the CRUD operations.




- ### **API Reference :**

### **User Controller :**

#### ***Get User By Id***

```http
  http://localhost:8080/getUserById/{userId}
```

#### ***Add Users***

```http
  http://localhost:8080/createUsers
```

### **Address Controller :**

#### ***Add Address***

```http
  http://localhost:8080/createAddress
```

### **Order Controller :**

#### ***Add Orders***

```http
  http://localhost:8080/createOrders
```

#### ***Get Order By Id***

```http
  http://localhost:8080/getOrderById/{orderId}
```

### **Product Controller :**

#### ***Add Product***

```http
  http://localhost:8080/createProducts
```

#### ***Get All products***

```http
  http://localhost:8080/getAllProducts
```

#### ***Get product by category***

```http
  http://localhost:8080/getProductByCategory?category={category}
```

#### ***Delete Product By Id***

```http
  http://localhost:8080/deleteById/{productId}
```

## **Service :** 

- It consists of ___UserService___ , ___OrderService___ ,  ___ProductService___ and ___AddressService___ class which helps us to write the business functionalities.
- ___@Service___ annotation is used to make the class as a service layer.

## **Repository :**
- It consists of ___IProductDao___ , ___IUserDao___ , ___IOrderDao___ and ___IAddressDao___ which is used to manage or datas.
- ___@Repository___ annotation is used to make the class repository layer.



## **Documentation :**

***[SWAGGER](http://localhost:8080/swagger-ui/index.html#/)***


## **Summary :**

- In this project , I had created the RestApi's performing various ___CRUD operations___ such as fetch , save , delete and update users.
- The RestApi's are tested by using ___Postman___ which is a client used to test our Api's.
- The data's were stored in the ___MySQL database___ which is ___persistent database___.

