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

### @EnableConfigurationProperties(ProjectProperties.class)
### @AutoConfigureWebClient(registerRestTemplate = true)
### @RestClientTest(ArticleCommentManagementService.class)
### @Nested
### MockRestServiceServer

## SemanticTag
인터넷의 발전으로 방대한 양의 웹문서가 생기면서, 제각기 일관적이지 않게 생성된 문서 구조로 우리는 웹에서 원하는 정보를 찾을 때 점점 어려움을 겪게 되었습니다.

시맨틱 태그 (Semantic Tag)는 포함된 콘텐츠의 특정 의미를 정의하고 목적을 갖는 태그입니다. 기존 HTML <div> 태그의 기능과 마찬가지로 block element이면서 사이트의 구조(레이아웃)을 설계하기 위해 존재합니다. 시맨틱 태그의 요소로는 `<header>`, `<nav>`, `<article>`, `<section>`, `<footer>`, `<main>` 등이 존재합니다. 이러한 시맨틱 태그 요소는 콘텐츠를 논리적 섹션으로 구성하고 각 부분의 역할과 기능을 전달하는 데 도움이 됩니다.

다시 말해, 시맨틱 태그는 HTML의 구조를 설계하는데 있어 태그에 의미를 부여함으로써 웹사이트의 구조를 파악하기 쉽도록 도와주기 위해 만들어진 것입니다.

HTML5 이전에는 `<div>`, `<span>`과 같이 콘텐츠 보유 역할은 하지만, 포함된 콘텐츠의 유형이나 해당 콘텐츠가 페이지에서 수행하는 역할에 대해서는 별도로 표시하지 않는 태그를 사용했습니다. 구조를 구분하기 위해 <div> 태그에 id또는 클래스 등으로 구분하며 구조를 설계했으나, HTML5에서는 시맨틱 태그의 등장으로 좀 더 명시적이면서 직관적인 구조의 설계가 가능해진 것 입니다.


[Reference1](https://www.w3schools.com/html/html5_semantic_elements.asp)  
[Reference2](https://seo.tbwakorea.com/blog/what-is-semantic-tag/)

## 어노테이션

### @Convert

### @Converter

### @ResponseStatus

### @ResponseBody

### @JsonInclude(JsonInclude.Include.NON_NULL)

### @ControllerAdvice

## AdminLTE
Bootstrap 기반의 Admin 사이트를 쉽게 개발하게 해주는 템플릿이다.  
여러 javascript 라이브러리를 사용하여 만들어져 있고, 관리자 사이트에 필요한 다양한 차트 등을 제공한다.  
제공되는 무료 소스를 이용하여 header, content, footer 영역으로 분리, 개발할 수 있는 형태를 만든다.

[adminlte.io](https://adminlte.io/)

## MeterRegistry


## WebSocket

[spring.io/guides/gs/messaging-stomp-websocket](https://spring.io/guides/gs/messaging-stomp-websocket/)  
[adminlte.io/docs/3.2/javascript/direct-chat.html](https://adminlte.io/docs/3.2/javascript/direct-chat.html)