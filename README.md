### 모든 코드들은 [스프링 부트와 AWS로 혼자 구현하는 웹 서비스](http://www.yes24.com/Product/Goods/83849117)를 기반으로 짰습니다.

+ 01장 IntelliJ로 스프링 부트 시작하기
  - IntelliJ 소개
  - IntelliJ 설치하기
  - IntelliJ 커뮤니티에서 프로젝트 생성하기
  - 그레이들 프로젝트를 스프링 부트 프로젝트로 변경하기
  - IntelliJ에서 깃과 깃허브 사용하기

+ 02장 스프링 부트에서 테스트 코드를 작성하자
  - 테스트 코드 소개
  - [Hello Controller 테스트 코드 작성](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/test/java/com/lgh/springbootwebservice/web/HelloControllerTest.java)
  - lombok 소개 및 설치
  - [Hello Controller 코드를 lombok으로 전환하기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/test/java/com/lgh/springbootwebservice/web/HelloControllerTest.java)

+ 03장 스프링 부트에서 JPA로 데이터베이스 다뤄보자
  - JPA소개
    - Spring Data JPA
    - 실무에서 JPA
    - 요구사항 분석
  - [프로젝트에 Spring Data JPA 적용하기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/build.gradle)
  - [Spring Data JPA 테스트 코드 작성하기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/test/java/com/lgh/springbootwebservice/web/domain/posts/PostsRepositoryTest.java)
  - [등록/수정/조회 API 만들기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/java/com/lgh/springbootwebservice/service/PostsService.java)
  - JPA Auditing으로 생성시간/수정시간 자동화하기
    - [LocalDate 사용](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/java/com/lgh/springbootwebservice/web/domain/BaseTimeEntity.java)
    - [Auditing 테스트 코드 작성하기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/test/java/com/lgh/springbootwebservice/web/domain/posts/PostsRepositoryTest.java)

+ 04장 머스테치로 화면 구성하기
  - 서버 템플릿 엔진과 머스테치 소개
    - 머스테치란
    - 머스테치 플러그인 설치
  - [기본 페이지 만들기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/resources/templates/index.mustache)
  - [게시글 등록 화면 만들기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/resources/templates/posts-save.mustache)
  - [전체 조회 화면 만들기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/resources/templates/index.mustache)
  - 게시글 수정, 삭제 화면 만들기
    - [게시글 수정](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/resources/templates/posts-update.mustache)
    - [게시글 삭제](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/resources/templates/posts-update.mustache)

+ 05장 스프링 시큐리티와 OAuth 2.0으로 로그인 기능 구현하기
  - 스프링 시큐리티와 스프링 시큐리티 Oauth2 클라이언트
  - 구글 서비스 등록
  - [구글 로그인 연동하기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/java/com/lgh/springbootwebservice/config/auth/dto/OAuthAttributes.java)
    - [스프링 시큐리티 설정](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/java/com/lgh/springbootwebservice/config/auth/SecurityConfig.java)
    - [로그인 테스트](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/resources/templates/index.mustache)
  - [어노테이션 기반으로 개선하기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/java/com/lgh/springbootwebservice/config/auth/LoginUserArgumentResolver.java)
  - [세션 저장소로 데이터베이스 사용하기](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/resources/application.properties)
  - 네이버 로그인
    - 네이버 API 등록
    - [스프링 시큐리티 설정 등록](https://github.com/Tublanx/springboot-webservice/blob/b44d63df56ee691e168e89a86d846e46da27c339/src/main/java/com/lgh/springbootwebservice/config/auth/dto/OAuthAttributes.java)
  - 기존 테스트에 시큐리티 적용하기
