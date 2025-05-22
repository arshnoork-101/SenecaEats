# 🍽️ SenecaEats - Cafeteria Web App

![Java](https://img.shields.io/badge/Java-17-orange)

> Built with 💻 Java + Spring Boot | Styled for 📱 mobile-first experiences | Designed to make campus life tastier 😋

## 🎯 Key Benefits
- 📱 **Mobile-First Design**: Access menus on any device
- 🕒 **Real-Time Updates**: Get instant menu changes
- 🎨 **Intuitive Interface**: Clean, modern design
- 🔒 **Secure Authentication**: Safe login system

## 🚀 Features

- Food menu management
- Order processing
- User authentication and authorization
- Image upload and management using Cloudinary
- Responsive web interface using Thymeleaf
- Database persistence with JPA/Hibernate

## 🛠️ Tech Stack

### 🔙 Backend
- ⚙️ **Java 17** – Core language
- 🚀 **Spring Boot 3.2.3** – Backend framework
- 🌐 **Spring MVC** – RESTful web layer
- 🧰 **SLF4J** – Logging
- 📦 **Maven** – Build and dependency management

### 🎨 Frontend
- 🧩 **Thymeleaf** – Server-side rendering engine
- 🖼️ **HTML5**, **CSS3**, **JavaScript** – UI design
- 📱 **Responsive Design** – Mobile-first UI/UX

## 📋 Prerequisites

- Java 17 or higher
- Maven
- Cloudinary account (for image upload functionality)

## 🚀 Getting Started

1. Clone the repository:
```bash
git clone https://github.com/arshnoork-101/SenecaEats.git
cd SenecaEats
```

2. Configure Cloudinary:
   - Create a `application.properties` file in `src/main/resources/`
   - Add your Cloudinary credentials:
   ```properties
   cloudinary.cloud-name=your_cloud_name
   cloudinary.api-key=your_api_key
   cloudinary.api-secret=your_api_secret
   ```

3. Build the project:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

The application will be available at `http://localhost:8080`

## 🔑 Demo Credentials

For testing purposes, use the following credentials:
- Email: fl.ln@myseneca.ca
- Password: flln

## 📁 Project Structure

```
src/main/java/com/seneca/cafeteria/cafeteriaapp/
├── controllers/    # REST controllers
├── models/        # Entity classes
├── repositories/  # Data access layer
├── services/      # Business logic
└── CafeteriaappApplication.java  # Main application class
```

## 🔧 Configuration

The application uses the following key configurations:
- H2 Database for development
- Thymeleaf for templating
- Spring Security for authentication
- Cloudinary for image management

## 🤝 Contributing

We welcome contributions! Here's how you can help:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👥 Authors

- Arsh Noor - Initial work

## 🙏 Acknowledgments

- Seneca College
- Spring Boot Team
- Cloudinary

---

<div align="center">
Made with ❤️ for Seneca College
</div> 