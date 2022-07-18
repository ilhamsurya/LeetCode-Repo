## Golang
Instalattion:
```bash
$ rm -rf /usr/local/go && tar -C /usr/local -xzf go1.18.4.linux-amd64.tar.gz
$ export PATH=$PATH:/usr/local/go/bin
$ go version
```
## Golang Migrate
Installation Golang Migrate :
```bash
$ curl -L https://packagecloud.io/golang-migrate/migrate/gpgkey | apt-key add -
$ echo "deb https://packagecloud.io/golang-migrate/migrate/ubuntu/ focal main" > /etc/apt/sources.list.d/migrate.list
$ apt-get update
$ apt-get install -y migrate
```

## SQLc ORM
Installation SQLc:
```bash
$ sudo apt update
$ sudo apt install snapd
$ sudo snap install sqlc
```