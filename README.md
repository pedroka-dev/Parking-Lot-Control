# Introduction
A PoC (Proof of Concept) App developed in Java, using MVC + DAO + Serialization patterns to create an app that can log entries and exits of cars in an hypothetical parking lot. 

All vehicle's information that can be used for identification, such as owner and technical details, will be stored on the database as well. The user of the App can register new Vehicles (and its brand, model and versions) and owners (Natural Person or Legal Person) at any time.


<details>
<summary>Introdução (Português)</summary>
  
Um App PoC (Proof of Concept) desenvolvido em Java, usando os padrões de MVC + DAO + Serialização para criar um aplicativo que possa registrar saidas e entradas de carros em um hipotético estacionamento. 
  
Todas as informações do veículo que podem ser usado como idenfticação, como dono e detalhes tecnicos, também serão armazenados em uma database . O usuário da App pode registrar novos Veículos (e sua marca, modelo e versão) e donos (Pessoa Fìsica ou Pessoa Jurídica) a qualquer momento.
</details>
  
---

# Main Goals
  - By default, Java OOP will be used for development. 
  - The basic architeture will be based on: Data Acess Objet(DAO), Model View Controller (MVC), Proper Serialization and Deserialization
  - The class registration must be completely develop, allowing: inclusion,consultion,alteration and exclusion of Serialized Data.
  - There must be a screen that shows which vehicles are curently in the parking lot
  - No vehicle can enter the parking lot without previously being registered
  - The same screen must cast entries and exits through
  - Entries and exits will be registered using the car plate
  - There must be some kind of function to empty the entire list of parked vehicles

<details>
<summary> Objetivos principais (Português)</summary>
  
  - Por padrão, será usado Java POO para o desenvolvimento.
  - A arquitetura básica ai ser baseada em: Data Acess Objet(DAO), Model View Controller (MVC), Serialização e Deserialização apropriada.
  - O registro de classes de ser desenvolvida por completo, permitindo: inclusão,consulta, alteração e exclusão de dados Serializados.
  - Deve haver uma tela que mostra quais veículos estão atualmente no estacionamento.
  - Nenhum veículo pode entrar o estacionamento sem previamente ser registrado.
  - A mesma tela deve lançar entradas e saídas.
  - Entradas e saídas devem ser registradas usando a placa do carro.
  - Deve haver algum tipo de funcionalidade para apagar toda a lista de veículos estacionados.
</details>

---

# Class Diagram
![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Expecifications/Classes%20Diagram%20PNG.PNG?raw=true)

# MVC Pattern
![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Expecifications/mvc%20pattern.png?raw=true)

---

# App Screenshots
![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20mainmenu%20database.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20mainmenu%20parking.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20register%20brand.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20register%20model.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20register%20versions.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20register%20owner.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20register%20vehicle.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20register%20exitentry.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20list%20brands.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20list%20models.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20list%20versions.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20list%20owner.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20list%20vehicles.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20list%20entrylog.JPG)

![alt text](https://github.com/pedro-ca/Parking-Lot-Control/blob/master/Screenshots/parkinglot%20list%20exitlog.JPG)
