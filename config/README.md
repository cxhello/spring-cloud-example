# spring-cloud-example

```
sh startup.sh -m standalone

http://192.168.207.254:8848/nacos

java -Dserver.port=8748 -Dcsp.sentinel.dashboard.server=localhost:8748 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.8.3.jar

http://127.0.0.1:8748/

curl -sSL https://zipkin.io/quickstart.sh | bash -s
nohup java -jar zipkin.jar > zipkin.log 2>&1 &

http://192.168.207.254:9411/

http://localhost:8081/test

http://localhost:8082/test

http://localhost:8082/hi-feign

http://localhost:8080/consumer/hi-feign
```