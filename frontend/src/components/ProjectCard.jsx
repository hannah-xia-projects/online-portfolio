import "./ProjectCard.css";
import { FaGithub } from "react-icons/fa"; //import the github symbol for the link

export default function ProjectCard({ project, image }) {
    return (
        <div className="project-card">
            <div className="project-content">
                <h2>{project.title}</h2>

                <div className="project-image">
                    <img
                        src={image}
                        alt={project.title}
                    />
                </div>

                <p>{project.description}</p>

                <div className="project-tech">
                    {project.techStack?.map((tech) => (
                        <span key={tech} className="tech-badge">
                        {tech}
                    </span>
                    ))}
                </div>

                <div className="project-tech">
                    {project.languages?.map((language) => (
                        <span key={language} className="tech-badge">
                    {language}
                        </span>
                        ))}
                </div>

                <div className="project-features">
                    {project.hasFrontend && <span className="feature-badge">✦ Frontend</span>}
                    {project.hasBackend && <span className="feature-badge">✦ Backend</span>}
                </div>

                <div className="project-links">
                    <a
                        href={project.githubURL}
                        target="_blank"
                        rel="noopener noreferrer"
                        className="github-link"
                    >
                        <FaGithub />
                        <span>GitHub</span>
                    </a>
                </div>
            </div>
        </div>
    );
}