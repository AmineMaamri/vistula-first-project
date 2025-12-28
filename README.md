# Vistula Spring Project - Task 1

## Project Description
This is my submission for Task 1. I created a simple Spring Boot application to practice using Controllers and Thymeleaf.

The app does two main things:
1.  **Main Page (`/`)**: Returns a simple text message to show the backend is working.
2.  **Greeting Page (`/greeting`)**: Returns a real HTML page with a welcome message and the Vistula logo.

## How to Run
1.  Open the project in IntelliJ IDEA.
2.  Run the `VistulaFirstProjectApplication` class.
3.  Go to your browser and type `http://localhost:8080/`.

## Endpoints
| HTTP Method | URL | Description |
| :--- | :--- | :--- |
| **GET** | `/` | Shows a raw text response confirming the app is running. |
| **GET** | `/greeting` | Shows the dynamic HTML page with the logo. |

---

## Screenshots

### 1. Browser Test - Main Page
Here you can see the simple text response running on localhost.
![Main Page](screenshot1.jpg)

### 2. Browser Test - Greeting Page
This is the HTML page rendered by Thymeleaf. It shows my custom "Hi there" message and the logo loaded from the static folder.
![Greeting Page](screenshot2.jpg)

### 3. Postman Test - Main Page
I tested the root endpoint in Postman to make sure the status code is 200 OK and the text is correct.
![Postman Root](Screenshot3_Postman_Root.png)

### 4. Postman Test - Greeting Page
Testing the greeting endpoint in Postman shows the raw HTML code that the server sends back.
![Postman Greeting](Screenshot4_Postman_Greeting.png)

---

## Made By
**Name:** Amine Maamri 74436

**Course:** Java Programming
**Task:** 1 - Spring Boot Web Application