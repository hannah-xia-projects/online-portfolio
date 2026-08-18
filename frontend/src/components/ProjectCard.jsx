import "./ProjectCard.css";

export default function ProjectCard({ project }) {
    return (
        <div className="project-card">
            <div className="project-content">
                <h2>{project.title}</h2>

                {/*<img*/}
                {/*    src={project.imageUrl}*/}
                {/*    alt={project.title}*/}
                {/*    className={t.description}*/}
                {/*    />*/}

                <div className="project-image">

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
                    {project.hasFrontend && <span>✅ Frontend</span>}
                    {project.hasBackend && <span>✅ Backend</span>}
                </div>

                <div className="project-links">
                    <a
                        href={project.githubURL}
                        target="_blank"
                        rel="noopener noreferrer"
                    >
                        GitHub
                    </a>
                </div>
            </div>
        </div>
    );
}