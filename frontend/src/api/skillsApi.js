import api from "./axios";

export const getSkills = async() => {
    const res = await api.get("/skills");
    return res.data;
};