@echo off
set RABBIT_ADDRESSES=localhost:5672
set STORAGE_TYPE=mysql
set MYSQL_USER=zipkin
set MYSQL_PASS=zipkin
set MYSQL_HOST=localhost
java -jar ./zipkin-server-2.21.7-exec.jar

