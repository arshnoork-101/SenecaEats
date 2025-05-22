# 🍽️ Seneca Eats – Cafeteria Web App

Welcome to **Seneca Eats** – a smart and responsive web platform that helps **students and staff at Seneca College** effortlessly browse menus, check cafeteria hours, and navigate food services across multiple campuses.

> Built with 💻 Java + Spring Boot | Styled for 📱 mobile-first experiences | Designed to make campus life tastier 😋

---

### 🎯 Problem Statement
- Difficulty in finding food services across multiple campuses
- Lack of centralized menu information
- Inconsistent operating hours access
- Poor mobile experience for on-the-go students

### 💡 Solution
- Centralized platform for all campus food services
- Real-time menu and hours information
- Mobile-first responsive design
- User-friendly interface

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

## 🔧 Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/arshnoork-31/SenecaEats.git
   cd cafeteriaapp
   ```

2. **IDE Setup**
   - Open project in IntelliJ IDEA
   - Enable auto-import for Maven
   - Configure Java 17 SDK

3. **Build and Run**
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

4. **Access the Application**
   - Open browser
   - Navigate to `http://localhost:8080`

### ⚙️ Troubleshooting

- **Port Conflict**: Change port in `application.properties`: `server.port=8081`
- **Build Issues**: Run `./mvnw clean install -U` to force update dependencies
- **Java Version**: Ensure Java 17 is installed: `java -version`

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/seneca/cafeteria/cafeteriaapp/
│   │       ├── controllers/    # MVC Controllers
│   │       └── models/         # Data Models
│   └── resources/
│       ├── static/            # Static assets
│       └── templates/         # Thymeleaf templates
└── test/                      # Unit tests
```

## 🔑 Login Credentials

For demo purposes, use the following credentials:
- Email: demo@senecaeats.com
- Password: demo123

## 🎨 UI/UX Features

- **Responsive Navigation**: Adapts to all screen sizes
- **Mobile-First Design**: Optimized for mobile devices
- **Clean Interface**: Intuitive and user-friendly
- **Smooth Animations**: Enhanced user experience
- **Consistent Theme**: Consistent color scheme

## 🤝 Contributing

Fork the repo, create a feature branch, commit your changes, push, and open a Pull Request.

Thank You! 👋 