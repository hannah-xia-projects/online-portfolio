import Navbar from "../components/Navbar";

export default  function Home() {
    return (
        <>
        <Navbar/>

            <section className="home">
                <h1>Hi, I'm Hannah</h1>
                <h2>Software Developer</h2>

                <p>
                    I build applications with modern technologies like React, Node.js, and APIs.
                </p>
            </section>
        </>
    );
}