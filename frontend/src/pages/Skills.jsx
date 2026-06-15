import { useEffect, useState } from "react";
import { getSkills } from "../api/skillsApi";

import Navbar from "../components/Navbar";

export default function Skills() {
    //uses api, get skills from api Spring Backend
    const [skills, setSkills] = useState([]);

    useEffect(() => {
        async function fetchSkills() {
            try {
                const data = await getSkills();
                setSkills(data);
            } catch (error) {
                console.error(error);
            }
        }

        fetchSkills();
    }, []);

    const levelMap = {
        Beginner: 40,
        Intermediate: 70,
        Advanced: 100
    };

    return (
        <>
            <Navbar/>

            <section className="skills">
                <h1>Top Skills</h1>

                <div className="skills-container">
                    {skills.map((skill, index) => (
                        <div key={index} className="skill-card">
                            <h3>{skill.name}</h3>
                            <p className="skill-level">{skill.level}</p>

                            <div className="progress-bar">
                                <div className="progress-fill" style={{ width: `${levelMap[skill.level]}%` }}>
                                </div>
                            </div>

                        </div>
                    ))}
                </div>
            </section>
        </>
    )
};