# Online Portfolio Project (Spring Boot + React)
## Fullstack Project

A personal project to build my online portfolio.

---

## Tech Stack
- Backend: Spring Boot (Java)
- Frontend: React (Vite)

---

### Set Up The Backend

1. If you want to run this portfolio code, you would need to create a file ```application-local.properties``` and put it in resource package under src/main.
In there you must have this inside:
```aiignore
EMAIL_USERNAME=your-email@example.com
EMAIL_PASSWORD=your-app-password
```
- This will set up the backend so it can send emails directly to you if someone fills out the contact form
- **NEVER COMMIT THIS FILE TO GIT!**

2. Run these commands on terminal to build backend:

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
│   │   │   │   ├── controller/                 # API layer
│   │   │   │   |   |── ContractController.java
│   │   │   │   |   |── ProjectController.java
│   │   │   │   |   |── SkillController.java
│   │   │   │   │   └── TaskController.java
│   │   │   │   ├── service/                    # the logic
│   │   │   │   |   |── ProjectService.java
│   │   │   │   |   |── SkillService.java
│   │   │   │   |   |── ContactService.java
│   │   │   │   │   └── TaskService.java
│   │   │   │   ├── model/                      # contains data
│   │   │   │   |   |── Project.java
│   │   │   │   |   |── Skill.java
│   │   │   │   |   |── Contact.java
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