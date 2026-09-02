import { useEffect, useState } from "react";
import { getProjects } from "../api/projectApi";

import Navbar from "../components/Navbar";
import ProjectCard from "../components/ProjectCard.jsx";

//project images
import portfolioImg from "../assets/logo-lpurp.png";

export default function Projects() {

    const [projects, setProjects] = useState([]);

    const projectImages = {
        Portfolio: portfolioImg,
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