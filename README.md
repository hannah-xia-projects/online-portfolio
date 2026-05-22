# Online Portfolio Project (Spring Boot + React)
## Fullstack Project

A personal project to build my online portfolio.

---

## Tech Stack
- Backend: Spring Boot (Java)
- Frontend: React (Vite)

---

### Set Up The Backend
```
cd backend
./mvnw spring-boot:run
```

### Set Up The Frontend
```
cd frontend
npm install
npm run dev
```

---

## Project Structure
```
online-portfolio/
│
├── backend/                                    # Spring Boot (Java)
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/hannah/backend/
│   │   │   │   ├── controller/
│   │   │   │   │   └── TaskController.java
│   │   │   │   ├── service/
│   │   │   │   │   └── TaskService.java
│   │   │   │   ├── model/
│   │   │   │   │   └── Task.java
│   │   │   │   ├── repository/                 # empty (for later)
│   │   │   │   └── BackendApplication.java
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/                               # leave as is
│   ├── pom.xml
│   └── mvnw / mvnw.cmd
│
├── frontend/                                   # React (Vite)
│   ├── src/
│   │   ├── components/                     
│   │   ├── pages/                          
│   │   ├── App.jsx
│   │   └── main.jsx
│   ├── public/
│   ├── package.json
│   └── vite.config.js
│
├── README.md
└── .gitignore
```