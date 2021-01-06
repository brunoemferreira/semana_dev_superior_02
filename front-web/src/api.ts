import axios from "axios";

const API_URL = 'https://sds2-brunoemf.herokuapp.com'

export function fetchProducts() {
  return axios(`${API_URL}/products`);
}