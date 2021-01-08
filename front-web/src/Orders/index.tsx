import { useEffect, useState } from 'react';
import './styles.css';
import StepsHeader from './StepsHeader';
import ProductsList from './ProductsList';
import OrderLocation from './OrderLocation';
import { OrderLocationData, Product } from './types';
import { fetchProducts } from '../api';


// Responsável por lidar com o carregamento das informações
function Orders() {

  const [products, setProducts] = useState<Product[]>([]);
  const [orderLocation, setOrderLocation] = useState<OrderLocationData>();


  useEffect(() => {
    // chama fetch products
    fetchProducts()
      .then(response => setProducts(response.data))
      .catch(error => console.log(error))
  }, []);

  return (
    <div className="orders-container">
      <StepsHeader />
      <ProductsList products={products} />
      <OrderLocation onChangeLocation={location => setOrderLocation(location)} />
    </div>
  )
}
export default Orders;
