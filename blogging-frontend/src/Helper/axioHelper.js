import axios from 'axios';
import Cookies from 'js-cookie';

export const getAuthToken = () => {
    return Cookies.get('token');
};

export const setAuthHeader = (token) => {
    if (token !== null) {
      Cookies.set('token', token, { expires: 1 });
    } else {
      Cookies.remove('token', { path: '/' });
    }
};

axios.defaults.baseURL = 'http://localhost:8080/api/v1';
axios.defaults.headers.post['Content-Type'] = 'application/json';

export const request = (method, url, data) => {

    let headers = {};
    if (getAuthToken() !== null && getAuthToken() !== "null") {
        headers = {'Authorization': `Bearer ${getAuthToken()}`};
    }

    return axios({
        method: method,
        url: url,
        headers: headers,
        data: data});
};