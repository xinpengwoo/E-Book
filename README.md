# Technologies

+ Java 8
+ Bootstrap
+ Thymeleaf
+ Spring MVC
+ Spring Security
+ Spring Email
+ JPA / Hibernate
+ MySQL

# Installation (Linux)

1. Make clone this repo.

```bash
git clone https://github.com/xinpengwoo/E-commerce.git
cd E-commerce
```

2. Install MySQL , start server and set user and password according to [this](https://dev.mysql.com/doc/refman/8.0/en/set-password.html). (Your will need USER_NAME and USER_PASSWORD later on).

```bash
sudo apt install mysql-server
sudo systemctl start mysql
```

You can quickly check server's current status via:

```bash
sudo service mysql status
```

Create database `bookstoredatabase`:

```bash
sudo mysql -u YOURUSERNAME -p
> [sudo] password: 
> Enter password:
mysql> CREATE DATABASE bookstoredatabase;
mysql> quit
```

Finally install one MySQL visual tool, [workbench](https://dev.mysql.com/downloads/workbench/) is recommended. 

3. Set up your [gmail app password](https://support.google.com/mail/answer/185833?hl=en-GB) to use smtp service, fill the configuration in `./bookstore/src/main/resources/application.properties`

4. Use your favriote IDE open bookstore / adminportal, run each spring boot application.

# Demo

> The related book info is not real, just for demo purpose.

## adminportal

![e032d1359105d4cbdaffd1753516659](assets\e032d1359105d4cbdaffd1753516659.png)

![e543418335cbd978e42322412c6f192](assets\e543418335cbd978e42322412c6f192.png)

![afbf158646b38ca45cfd7ec43a0d6c6](assets\afbf158646b38ca45cfd7ec43a0d6c6.png)

## bookstore

![14d2ee3af380d9f589dc6a4798c94d7](assets\14d2ee3af380d9f589dc6a4798c94d7.png)

![c887e88a91b842a5f687c07c7cb906a](assets\c887e88a91b842a5f687c07c7cb906a.png)

![1ed183127e55e032d7f123fd5d8284d](assets\1ed183127e55e032d7f123fd5d8284d.png)

![b5c85df919b0526b4b970451617a9f0](assets\b5c85df919b0526b4b970451617a9f0.png)

![bb7fc38e59616b9881f53c6a4a6dc48](assets\bb7fc38e59616b9881f53c6a4a6dc48.png)

![283a09615977517fed6e0c02c4ab245](assets\283a09615977517fed6e0c02c4ab245.png)

![74a752eb3909de1808c44e62303e1d2](assets\74a752eb3909de1808c44e62303e1d2.png)

![74196bef21e305af80073babc8a15e9](assets\74196bef21e305af80073babc8a15e9.png)

<img src="assets\095f5d4903a4175bbc02370755eecbb.png" alt="095f5d4903a4175bbc02370755eecbb" style="zoom:67%;" />

<img src="assets\df39a27cdcf3cb23f36da55de5046a0.png" alt="df39a27cdcf3cb23f36da55de5046a0" style="zoom: 67%;" />

#ER-Diagram
![797c2003181e9fed9f6e5edf9bceb5c](assets\797c2003181e9fed9f6e5edf9bceb5c.png)
