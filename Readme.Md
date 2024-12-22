# Modern Blogging Platform

A full-stack blogging platform built with Spring Boot and React, featuring secure JWT authentication and comprehensive blog management capabilities.

## Project Structure

```
blogging-frontend/
├── node_modules/
├── public/
├── src/
├── .gitignore
├── eslint.config.js
├── index.html
├── package-lock.json
├── package.json
├── README.md
└── vite.config.js

Server/
└── Blogger/
    ├── .mvn/
    ├── src/
    ├── target/
    ├── .gitignore
    ├── mvnw
    ├── mvnw.cmd
    └── pom.xml
```

## Features

- User authentication with JWT
- Secure endpoints for blog management
- Responsive frontend design
- CRUD operations for blog posts
- User profile management

## Technology Stack

### Backend
- Java Spring Boot
- Spring Security with JWT
- Spring Data JPA
- Maven
- MongoDB for Database

### Frontend
- React
- Vite
- Node.js
- Modern JavaScript (ES6+)

## Getting Started

### Prerequisites
- Java 17 or higher
- Node.js 14 or higher
- Maven
- MongoDB Atlas Account

### Backend Setup
1. Navigate to the Server/Blogger directory
```bash
cd Server/Blogger
```

2. Install dependencies
```bash
mvn install
```

3. Run the application
```bash
mvn spring-boot:run
```

The server will start on `http://localhost:8080`

### Frontend Setup
1. Navigate to the blogging-frontend directory
```bash
cd blogging-frontend
```

2. Install dependencies
```bash
npm install
```

3. Start the development server
```bash
npm run dev
```

The application will be available on `http://localhost:5173`

## API Endpoints

### Authentication
- POST `/api/auth/signup` - Register a new user
- POST `/api/auth/login` - Login user

### Blog Operations
- GET `/api/blogs` - Get all blogs
- GET `/api/blogs/{id}` - Get specific blog
- POST `/api/blogs` - Create new blog
- PUT `/api/blogs/{id}` - Update blog
- DELETE `/api/blogs/{id}` - Delete blog

### User Operations
- GET `/api/users/profile` - Get user profile
- PUT `/api/users/profile` - Update user profile

## Security

- JWT-based authentication
- Password encryption
- Protected API endpoints
- CORS configuration

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Contact

Your Name - [Vaibhavg4651@gmail.com](mailto:Vaibhavg4651@gmail.com)

Project Link: [https://github.com/Vaibhavg4651/Blogging-website](https://github.com/Vaibhavg4651/Blogging-website)