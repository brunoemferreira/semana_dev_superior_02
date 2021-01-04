<h1 align="center" style="color:DarkOrange;font-size:50px;font-weight:bold">Semana DevSuperior 2.0</h1>
<p align="center">De 04/01 à 10/01/2021</p>

<p align="center">
  <a href="#sobre">Sobre o Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#modeloconceitual">Modelo Conceitual</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#padraocamadasadotado">Padrão de camadas adotado</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#ferramentas">Ferramentas Utilizadas</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#backend">Back end</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#database">Banco de Dados</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#frontend">Front end</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#mobile">Mobile</a>
</p>
<!-- ************************************* Baadges ********************************************* -->
<div align="center">
<p>Inserir aqui os Badges </p>
</div>
<!-- ************************************* Sobre *********************************************** -->
<h2 id="sobre"> 🚀 Sobre o Projeto</h2>

Inserir aqui a Descrição do Projeto.
<!-- ************************************* Modelo Conceitual ********************************** -->
<h2 id="modeloconceitual"> 🗺️ Modelo Conceitual</h2>

<h1 align="center">
    <img alt="Logo" src="./images/modelo-conceitual.png" width="500px" />
</h1>

<!-- ********************************* Padrões de Camadas ************************************** -->
<h2 id="padraocamadasadotado"> 🛡️ Padrão de camadas adotado</h2>

<h1 align="center">
    <img alt="Logo" src="./images/camadas.png" width="500px" />
</h1>
<!-- ************************************* Ferramentas Utilizadas ************************** -->
<h2 id="ferramentas"> 🛠️ Ferramentas Utilizadas</h2>

- [JDK11]('https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html')
- [STS - Spring Tools Suite]('https://spring.io/tools')
- [Postman]('https://www.postman.com/downloads/')
- [Postgres 12 e pgAdmin]('https://www.postgresql.org/download/')
- [Heroku CLI]('https://devcenter.heroku.com/articles/heroku-cli')
- [NPM]('https://www.npmjs.com/')
- [VS Code]('https://code.visualstudio.com/download')
- [Git]('https://git-scm.com/downloads')

<hr>
<!-- ************************************* Back End ******************************************** -->
<h2 id="backend"> 🧰 Back end</h2>

<h4> 🔨 Tecnologias</h4>

* Java
* PostGreSQL ( Banco de Dados )

<h4> ⚙️ Dependências</h4> 

* Spring Boot
  * Starter Web 
  * Starter Data JPA
  * Starter Validation
  * Starter Security
  * Starter Test
* H2
* PostGreSQL

<h3> 🎲 Rodando o Back end</h3>

```bash
# Clone este repositório
$ git clone https://github.com/brunoemferreira/pitu.git

# Acesse a pasta backend
$ cd backend

# execute o comando
$ yarn start
ou
$ npm start

# O servidor inciará na porta:3000
```

<hr>
<h2 id="database"> 🗄️ Banco de Dados ( PostgreSQL )</h2>

<h4> 🔨 Scripts para Popular as Tabelas </h4>

```sql
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Pizza Bacon', 49.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/pizza_bacon.jpg', 'Pizza de bacon com mussarela, orégano, molho especial e tempero da casa.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Pizza Moda da Casa', 59.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/pizza_moda.jpg', 'Pizza à moda da casa, com molho especial e todos ingredientes básicos, e queijo à sua escolha.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Pizza Portuguesa', 45.0, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/pizza_portuguesa.jpg', 'Pizza Portuguesa com molho especial, mussarela, presunto, ovos e especiarias.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Risoto de Carne', 52.0, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/risoto_carne.jpg', 'Risoto de carne com especiarias e um delicioso molho de acompanhamento.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Risoto Funghi', 59.95, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/risoto_funghi.jpg', 'Risoto Funghi feito com ingredientes finos e o toque especial do chef.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Macarrão Espaguete', 35.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_espaguete.jpg', 'Macarrão fresco espaguete com molho especial e tempero da casa.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Macarrão Fusili', 38.0, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_fusili.jpg', 'Macarrão fusili com toque do chef e especiarias.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Macarrão Penne', 37.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_penne.jpg', 'Macarrão penne fresco ao dente com tempero especial.');

INSERT INTO tb_order (status, latitude, longitude, address, moment) VALUES (0, -23.561680, -46.656139, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T10:00:00Z');
INSERT INTO tb_order (status, latitude, longitude, address, moment) VALUES (1, -22.946779, -43.217753, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T15:00:00Z');
INSERT INTO tb_order (status, latitude, longitude, address, moment) VALUES (0, -25.439787, -49.237759, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T16:00:00Z');
INSERT INTO tb_order (status, latitude, longitude, address, moment) VALUES (0, -23.561680, -46.656139, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T12:00:00Z');
INSERT INTO tb_order (status, latitude, longitude, address, moment) VALUES (1, -23.561680, -46.656139, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T08:00:00Z');
INSERT INTO tb_order (status, latitude, longitude, address, moment) VALUES (0, -23.561680, -46.656139, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T14:00:00Z');
INSERT INTO tb_order (status, latitude, longitude, address, moment) VALUES (0, -23.561680, -46.656139, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T09:00:00Z');

INSERT INTO tb_order_product (order_id, product_id) VALUES (1 , 1);
INSERT INTO tb_order_product (order_id, product_id) VALUES (1 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (2 , 2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (2 , 5);
INSERT INTO tb_order_product (order_id, product_id) VALUES (2 , 8);
INSERT INTO tb_order_product (order_id, product_id) VALUES (3 , 3);
INSERT INTO tb_order_product (order_id, product_id) VALUES (3 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (4 , 2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (4 , 6);
INSERT INTO tb_order_product (order_id, product_id) VALUES (5 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (5 , 6);
INSERT INTO tb_order_product (order_id, product_id) VALUES (6 , 5);
INSERT INTO tb_order_product (order_id, product_id) VALUES (6 , 1);
INSERT INTO tb_order_product (order_id, product_id) VALUES (7 , 7);
INSERT INTO tb_order_product (order_id, product_id) VALUES (7 , 5);
```

<hr>
<!-- ************************************** Front End ****************************************** -->
<h2 id="frontend"> 🔩 Front end</h2>

<h4> 🔨 Tecnologias</h4>

* React
* JavaScript
* TypeScript

<h4> ⚙️ Dependências</h4> 

- 

<h3> 🎲 Rodando o Front end</h3>

```bash
# Clone este repositório
$ git clone https://github.com/brunoemferreira/pitu.git

# Acesse a pasta backend
$ cd backend

# Execute o comando para instalar as dependências
$ yarn install
ou
$ npm install

# execute o comando
$ yarn start
ou
$ npm start

# O servidor inciará na porta:3000
```

<hr>
<!-- ***************************************** Mobile ****************************************** -->
<h2 id="mobile"> 📱 Mobile</h2>

<h4> 🔨 Tecnologias</h4>

* React Native

<h4> ⚙️ Dependências</h4> 

- 

<h3> 🎲 Rodando o Mobile</h3>

```bash
# Clone este repositório
$ git clone https://github.com/brunoemferreira/pitu.git

# Acesse a pasta backend
$ cd backend

# execute o comando
$ yarn start
ou
$ npm start

# O servidor inciará na porta:3000
```

<hr>



