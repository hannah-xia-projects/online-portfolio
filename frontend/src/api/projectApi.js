/**
 * this file is for project API connection from spring backend
 */

import api from "./axios";

//export function for the getProjects function
export const getProjects = async() => {
    const response = await api.get("/projects");
    return response.data;
}