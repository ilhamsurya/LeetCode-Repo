## MySQL

[installation](https://www.digitalocean.com/community/tutorials/how-to-install-mysql-on-ubuntu-18-04)
Start mysql console
```bash
/usr/bin/mysql -u root -p
```
Change max connections
```bash
show variables like "max_connections";
```
```bash
set global max_connections = 1000;
```
Username:
```bash
root
```
Password:
```bash
Password123#@!
```
