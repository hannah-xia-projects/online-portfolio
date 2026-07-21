import { NavLink } from "react-router-dom";
import "./Navbar.css"; //navbar styling
import logo from "../assets/logo-lpurp.png";

export default function Navbar() {
    return (
        <nav className="navbar">

            <div className="logo">
                <img src={logo} alt="Logo" />
            </div>

            <div className="nav-links">
                <NavLink to="/">Home</NavLink>
                <NavLink to="/about">About</NavLink>
                <NavLink to="/skills">Skills</NavLink>
                <NavLink to="/projects">Projects</NavLink>
                <NavLink to="/contact">Contact</NavLink>
            </div>
        </nav>
    );
}