/**
 * isolate backend
 */

import axios from "axios";

const api = axios.create({
    //baseURL: "http://localhost:8080/api", //spring backend server this was for local
    baseURL: ""
});

export default api;