# 🍽️ Seneca Eats – Cafeteria Web App

Welcome to **Seneca Eats** – a smart and responsive web platform that helps **students and staff at Seneca College** effortlessly browse menus, check cafeteria hours, and navigate food services across multiple campuses.

> Built with 💻 Java + Spring Boot | Styled for 📱 mobile-first experiences | Designed to make campus life tastier 😋

---

## 🚀 Tech Stack

### 🔙 Backend
- ⚙️ **Java 17** – Core language
- 🚀 **Spring Boot 3.5.0** – Backend framework
- 🌐 **Spring MVC** – RESTful web layer
- 🧰 **SLF4J** – Logging
- 📦 **Maven** – Build and dependency management

### 🎨 Frontend
- 🧩 **Thymeleaf** – Server-side rendering engine
- 🖼️ **HTML5**, **CSS3**, **JavaScript** – UI design
- 📱 **Responsive Design** – Mobile-first UI/UX

---

## 🛠️ Features

- 🌐 **Campus Selection**: Choose between Newnham, York, and King
- 📋 **Menu Display**: View detailed menus per cafeteria
- 🕒 **Operating Hours**: Display real-time hours of operation
- 🔐 **User Authentication**: Secure login functionality
- 📱 **Responsive UI**: Works seamlessly across devices

---

## 📋 Requirements

- ✅ Java 17+
- ✅ Maven 3.6+
- ✅ Git
- ✅ Modern web browser

---

## 🔧 Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/arshnoork-31/SenecaEats.git
   cd cafeteriaapp
   ```

2. **Build and Run the Project**
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

3. **Access the Application**
   - Open your browser
   - Navigate to `http://localhost:8080`

### ⚙️ Troubleshooting

- 🔁 **Maven Wrapper**  
  Regenerate: `mvn wrapper:wrapper`

- ☕ **Java Version**  
  Must be Java 17+: `java -version`

- 🧹 **Dependencies**  
  Clean: `./mvnw clean`  
  Purge: `./mvnw dependency:purge-local-repository`

- ⚠️ **Port Issue**  
  Default: `8080`  
  Change in `application.properties`:  
  `server.port=8081`

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/seneca/cafeteria/cafeteriaapp/
│   │       ├── controllers/
│   │       │   ├── HomeController.java
│   │       │   └── LoginController.java
│   │       ├── models/
│   │       │   └── EatingPlace.java
│   │       └── CafeteriaappApplication.java
│   └── resources/
│       └── templates/
│           ├── index.html
│           ├── login.html
│           ├── about.html
│           ├── area-select.html
│           └── area-menu.html
├── README.md
└── requirements.txt
```

## 🔑 Login Credentials

For demo purposes, use the following credentials:
- Email: fl.ln@myseneca.ca
- Password: flln

## 🎨 UI/UX Features

- **Responsive Navigation**: Adapts to all screen sizes
- **Mobile-First Design**: Optimized for mobile devices
- **Clean Interface**: Intuitive and user-friendly
- **Smooth Animations**: Enhanced user experience
- **Consistent Theme**: Consistent color scheme

## 🤝 Contributing

Fork the repo, create a feature branch, commit your changes, push, and open a Pull Request.

Thank You! 👋 