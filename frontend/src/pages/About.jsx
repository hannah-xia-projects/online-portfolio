import Navbar from "../components/Navbar";
import HannahPic from "../assets/Hannah.jpg";

export function About() {
    return (
        <>
        <Navbar/>
            <section className="about">
                <div className="about-container">

                    <div className="about-text">
                        <h1>About Me</h1>
                        <p>
                            Hello, I'm Hannah Xia, a software developer with a passion for creating. I'm currently working as a Software Developer at the AESO, where I help build real-world applications for Alberta's Electric grid.
                        </p>

                        <p>
                            Here are some technologies I have been working with:
                        </p>
                        <ul className="techlist">
                            <li><span>Java</span></li>
                            <li><span>Java Spring</span></li>
                            <li><span>Python</span></li>
                            <li><span>React.js</span></li>
                            <li><span>Node.js</span></li>
                            <li><span>MySQL</span></li>
                        </ul>

                        <p>
                            Outside of coding, I love the arts, learning new tech tools, and spend way too much time on gambling games. Nice to meet you!
                        </p>
                    </div>

                    <div className="about-image">
                        <img src={HannahPic} alt="Hannah" />
                    </div>

                </div>


                <div className="about-cta">
                    <h2>Let's Connect</h2>
                    <p>
                        I'm always open to new opportunities, collaborations, or just a chat.
                    </p>
                    Say Hi
                </div>
            </section>
        </>
    );
}

export default About;
