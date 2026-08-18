import { useEffect, useState } from "react";
//import { handleSubmit } from "../api/contactApi";
import { FaGithub, FaLinkedin, FaEnvelope } from "react-icons/fa";
import api from "../api/axios";

import Navbar from "../components/Navbar";

export default function Contact() {
    //set up the directly message function
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [message, setMessage] = useState("");

    const handleSubmit = async (e) => {
        e.preventDefault();

        await api.post("/contact", {
            name,
            email,
            message,
        })

        //reset setName, etc again
        setName("");
        setEmail("");
        setMessage("");

        alert("Message sent!")
    };

    return (
        <>
            <Navbar/>

            <section className="contact">
                <h1>Contact</h1>
            </section>

        </>
    )
};