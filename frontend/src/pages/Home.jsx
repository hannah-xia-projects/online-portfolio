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

                <div className="sky">
                    <div className="cloud cloud1"></div>
                    <div className="cloud cloud2"></div>
                    <div className="cloud cloud3"></div>
                </div>

                <div className="scene"></div>

                <h1 className="title">Hi, I'm Hannah</h1>
                <h2 className="subtitle">Software Developer and Designer</h2>
                <p className="paragraph">
                    Building clean, functional apps with a touch of creativity.
                </p>
            </section>
        </>
    );
}