import api from "./axios";

export const getSkills = async() => {
    const res = await api.get("/api/skills");
    return res.data;
};