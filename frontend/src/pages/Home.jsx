import Navbar from "../components/Navbar";

export default  function Home() {
    return (
        <>
        <Navbar/>

            <section className="home">

                <div className="petal"></div>
                <div className="petal"></div>
                <div className="petal"></div>
                <div className="petal"></div>
                <div className="petal"></div>

                <h1 className="title">Hi, I'm Hannah</h1>
                <h2 className="subtitle">Software Developer and Designer</h2>
                <p className="paragraph">
                    Building clean, functional apps with a touch of creativity.
                </p>
            </section>
        </>
    );
}