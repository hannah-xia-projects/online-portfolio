import { useEffect, useState } from "react";
import { getProjects } from "../api/projectApi";

import Navbar from "../components/Navbar";
import ProjectCard from "../components/ProjectCard.jsx";

export default function Projects() {

    const [projects, setProjects] = useState([]);

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

                <div className="project-grid">
                    {projects.map((project) => (
                        <ProjectCard
                            key={project.id}
                            project={project}
                        />
                    ))}
                </div>
            </section>
        </>
    )
};