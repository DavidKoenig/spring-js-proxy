# Spring JS Proxy

## Intro
Example project for using Spring Boot as a CORS compatible proxy for a JavaScript frontend framework.
The frontend calls are forwarded to the JS framework and API calls go to the Spring Boot Controllers.
This can be helpful to use Spring Boot as a frontend-backend to hide calls to the real backend and
gain an extra layer for security reasons.
Currently Vue is used as JS frontend framework example.

## How to use
1. Go to the `ui` folder, run npm run build.
2. Run `mvn clean install` on root project --> this will copy `dist` folder from `ui` to `resources/static`
3. Run Spring Boot application with `mvn spring-boot:run`. 
4. Application is available at port `8080` by default. 