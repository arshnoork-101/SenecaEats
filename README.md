# 🍽️ SenecaEats - Campus Food Service Platform

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.3-brightgreen)
![License](https://img.shields.io/badge/License-MIT-blue)
![Status](https://img.shields.io/badge/Status-Active-success)

> Built with 💻 Java + Spring Boot | Styled for 📱 mobile-first experiences | Designed to make campus life tastier 😋

</div>

## 📋 Table of Contents
- [Overview](#-overview)
- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Getting Started](#-getting-started)
- [Demo Credentials](#-demo-credentials)
- [Project Structure](#-project-structure)
- [Contributing](#-contributing)
- [License](#-license)

## 🌟 Overview

SenecaEats is a modern, user-friendly platform designed to revolutionize how students and staff at Seneca College interact with campus food services. Our platform brings together all campus cafeterias, food courts, and dining options into one seamless experience.

### 🎯 Key Benefits
- 📱 **Mobile-First Design**: Access menus and place orders on any device
- 🕒 **Real-Time Updates**: Get instant notifications about menu changes and special offers
- 🎨 **Intuitive Interface**: Clean, modern design that's easy to navigate
- 🔒 **Secure Authentication**: Safe and reliable user authentication system

## ✨ Features

### 🍔 Food Service Management
- Comprehensive menu management system
- Real-time order processing
- Special dietary requirement indicators
- Daily specials and promotions

### 👤 User Experience
- Personalized user profiles
- Order history tracking
- Favorite items list
- Customizable preferences

### 🔒 Security
- Secure user authentication
- Role-based access control
- Data encryption
- Session management

## 🛠️ Tech Stack

### Backend
- **Java 17**: Core programming language
- **Spring Boot 3.2.3**: Application framework
- **Spring Data JPA**: Data persistence
- **H2 Database**: Development database
- **Maven**: Build automation

### Frontend
- **Thymeleaf**: Server-side templating
- **Bootstrap**: Responsive design
- **JavaScript**: Dynamic interactions
- **CSS3**: Modern styling

### DevOps
- **Git**: Version control
- **GitHub**: Code repository
- **Maven**: Dependency management

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- Git

### Installation Steps

1. **Clone the Repository**
```bash
git clone https://github.com/arshnoork-101/SenecaEats.git
cd SenecaEats
```

2. **Configure Environment**
   - Create `application.properties` in `src/main/resources/`
   - Add your Cloudinary credentials:
   ```properties
   cloudinary.cloud-name=your_cloud_name
   cloudinary.api-key=your_api_key
   cloudinary.api-secret=your_api_secret
   ```

3. **Build and Run**
```bash
mvn clean install
mvn spring-boot:run
```

4. **Access the Application**
   - Open your browser
   - Navigate to `http://localhost:8080`

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

## 🤝 Contributing

We welcome contributions! Here's how you can help:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### 📝 Pull Request Process
1. Update the README.md with details of changes
2. Update the documentation
3. Ensure all tests pass
4. Follow the existing code style

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- **Arsh Noor** - *Initial work* - [GitHub Profile](https://github.com/arshnoork-101)

## 🙏 Acknowledgments

- Seneca College for inspiration and support
- Spring Boot Team for the amazing framework
- All contributors who have helped shape this project

---

<div align="center">
Made with ❤️ for Seneca College
</div> 