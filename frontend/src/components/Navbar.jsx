import { Link } from "react-router-dom";
import "./Navbar.css"; //navbar styling

export default function Navbar() {
    return (
        <nav className="navbar">
            <div className="nav-links">
                <Link to="/">Home</Link>
                <Link to="/about">About</Link>
                <Link to="/skills">Skills</Link>
                <Link to="/projects">Projects</Link>
                <Link to="/contact">Contact</Link>
            </div>
        </nav>
    );
}