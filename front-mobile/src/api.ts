import axios from "axios";

const API_URL = 'https://sds2-brunoemf.herokuapp.com';

export default function fetchOrders() {
  return axios(`${API_URL}/orders`);
}

export function confirmDelivery(orderId: number) {
  return axios.put(`${API_URL}/orders/${orderId}/delivered`)
}