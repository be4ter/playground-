### 개발환경

- framework : spring boot 2.0.6.RELEASE
- java sdk version : 1.8
- was : tomcat core 8.5.34
- deply format : war
- DB : MySQL 5.7.22
- Mapper : mybatis-starter:1.3.2
- build tool : gradle

### db와 잘 연결됬는지 확인 하는 방법
- postman으로 get 요청

 get : http://ec2-13-209-88-209.ap-northeast-2.compute.amazonaws.com:8080/playground-0.0.1-SNAPSHOT/test

 post : http://ec2-13-209-88-209.ap-northeast-2.compute.amazonaws.com:8080/playground-0.0.1-SNAPSHOT/test/{contents}
 
### 배포하는 법

git clone 후 프로젝트 폴더에서
```
./gradlew build

build/libs 에서
cp war파일 ~/tomcat/webapps
```
