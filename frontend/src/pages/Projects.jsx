import { useEffect, useState } from "react";
import { getProjects } from "../api/projectApi";

import Navbar from "../components/Navbar";
import ProjectCard from "../components/ProjectCard.jsx";

//project images
import portfolioImg from "../assets/logo-lpurp.png";
import ardsImg from "../assets/ARDS-image.png";
import challengesImg from "../assets/CodingChallenges.png";
import seng300f24Img from "../assets/seng300-f24-project.png";
import passwordManagerImg from "../assets/password-manager.webp";

export default function Projects() {

    const [projects, setProjects] = useState([]);

    const projectImages = {
        Portfolio: portfolioImg,
        "Project ARDS": ardsImg,
        "Coding Challenges": challengesImg,
        "SENG300 f24 Project": seng300f24Img,
        "Password Manager": passwordManagerImg
    };

    useEffect(() => {
        getProjects()
            .then((data) => setProjects(data))
            .catch((error) =>
                console.error("Failed to get projects:", error)
            );
    }, []);

    return (
        <>
            <Navbar/>

            <section className="projects">
                <h1>Projects</h1>

                <div className="projects-grid">
                    {projects.map((project) => (
                        <ProjectCard
                            key={project.id}
                            project={project}
                            image={projectImages[project.title]}
                        />
                    ))}
                </div>
            </section>
        </>
    )
};