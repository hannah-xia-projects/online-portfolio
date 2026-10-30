import api from "../api/axios";

//function for handling any message submission in the contact form
const handleSubmit = async() => {
    await api.post("/api/contact", {
        name,
        email,
        message,
    });
};