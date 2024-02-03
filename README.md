# project-board-admin(어드민 서비스)
## 개발 환경
* IntelliJ 2023.3.2 (Community Edition)
* Java 17
* Spring Boot 2.7.0

<br/>

## 강의 자료
> 패스트 캠퍼스 10개 프로젝트로 완성하는 백엔드 웹개발(Java/Spring) 초격차 패키지 Online
<br>* Part 3. 어드민 서비스

* https://github.com/djkeh/fastcampus-project-board-admin


## JUNIT5

``contentTypeCompatibleWith``  
테스트 페이지가 UTF-8이 포함되어 있는 HTML 타입이면 정상 따라서 어느 정도 호환 되는 타입까지 지원. 
```
.andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
```

## 어노테이션

### @Convert

### @Converter