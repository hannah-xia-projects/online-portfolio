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
                <div className="contact-container">
                    <div className="contact-info">
                        <h2> Get In Touch </h2>

                        <p>
                            I'm currently seeking software development opportunities. Feel free to reach out through any of the methods below!
                        </p>

                        <a
                            href="https://github.com/hannah-xia-projects"
                            target="_blank"
                            rel="noopener noreferrer">
                            <FaGithub />
                            GitHub
                        </a>

                        <a
                            href="https://www.linkedin.com/in/hannax/"
                            target="_blank"
                            rel="noopener noreferrer">
                            <FaLinkedin />
                            LinkedIn
                        </a>

                        <a
                            href="mailto:hannahxia95@gmail.com">
                            <FaEnvelope />
                            Email
                        </a>
                    </div>

                    <form className="contact-form"
                          onSubmit={handleSubmit}>
                        <h2>Send A Message</h2>
                        <input type="text"
                               placeholder="Name"
                               value={name}
                               onChange={(e) => setName(e.target.value)}
                               required
                        />

                        <input type="email"
                               placeholder="Email"
                               value={email}
                               onChange={(e) => setEmail(e.target.value)}
                               required
                        />

                        <textarea
                               placeholder="Message"
                               rows="6"
                               value={message}
                               onChange={(e) => setMessage(e.target.value)}
                               required
                        />

                        <button type="submit">
                            Send Message
                        </button>

                    </form>
                </div>

            </section>

        </>
    )
};