# KAKAO 쇼핑 api

## Description
- 이 레포지토리는 카카오 테크 캠퍼스 실습 api 레포지토리를 포크하여 HTTPS 프로토콜을 지원하는 환경에서 배포하기 위한 레포지토리 입니다.

## 배포 환경
- 배포는 Cloudtype 서비스를 이용하여 진행했습니다.

### 배포 주소
- https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/

### Cloudtype 프로젝트 배포 환경 설정
- Java 버전 : v11
- Build command
  ```
  ./gradlew clean build
  ```
- Start command
  ```
  cp -r images build/libs; java -jar -Dspring.profiles.active=local build/libs/kakao-1.0.jar
  ```
  - cp -r images build/libs; 명령은 이미지 폴더를 빌드가 완료된 jar 파일이 존재하는 build/libs 디렉토리로 복사하여 서버가 제공할 이미지 셋을 적절한 디렉토리로 옮겨주는 명령이다.
  - 세미콜론은 한 줄의 명령어 라인에서 여러 명령을 실행할 때, 각 명령을 구분하기 위함이다.
  - java -jar -Dspring.profiles.active=local build/libs/kakao-1.0.jar 명령은 빌드 후 생성된 jar 파일을 실행하는 명령이다.
- Include files in build
  ```
  images
  ```
  - 빌드 시 images 디렉토리를 추가하여 컴퓨팅 환경에서 이용할 수 있도록 하는 옵션이다.

## 사진 접근하는 법
- https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/images/1.jpg
- ...
- https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/images/15.jpg

## API 문서
- http://localhost:8080/docs/api-docs.html
- https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/docs/api-docs.html

## 사용자 시나리오 API PDF 문서
- http://localhost:8080/docs/api-pdf.pdf
- https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/docs/api-pdf.pdf
- https://github.com/codingspecialist/kakao-shop-api/blob/master/backup-data-v2/api-pdf.pdf

## 배포된 서버 주소
- host : https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app
- 이메일 중복 체크(POST) https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/check
- 회원가입(POST) https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/join
- 로그인(POST) https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/login
- 전체 상품 목록 조회 (GET) https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/products
- 개별 상품 상세 조회 (GET) https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/products/{id}
- 장바구니 담기 (POST) https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/carts/add
- 장바구니 조회 (GET) https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/carts
- 주문(POST) - 주문버튼 클릭 : 장바구니 업데이트 https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/carts/update
- 결제(POST) - 결재버튼 클릭 : 주문하기 https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/orders/save
- 주문 결과 확인(GET) https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/orders/{id}

## 데이터 초기화
- admin@nate.com 으로 로그인 (비번 meta1234!)
- http://localhost:8080/admin/reset (post 요청)
- https://port-0-kakao-shop-api-ac2nlldpiesx.sel3.cloudtype.app/admin/reset (post 요청)

## 로컬에서 실행 파일 만들기
```text
host : localhost:8080

1. git clone https://github.com/Heo-Donghyuk/kakao-shop-api.git
2. 다운 받은 프로젝트 폴더(kakao-shop-api) 내부로 들어가서 git bash를 열어주세요. Mac 사용자는 터미널을 이용해서 해당 경로로 가세요.
3. ./gradlew clean build
4. 윈도우 사용자는 git bash를 이용하여 터미널을 열고 3번 명령어를 실행해주세요.
5. cd build/libs
6. 위 경로에 kakao-1.0.jar파일이 생성됩니다
7. jar 파일 동일 경로에 images 폴더를 카피 한뒤 아래 명령어로 실행해주세요
8. images폴더는 kakao-shop-api/images 경로에 있습니다.
9. java -jar -Dspring.profiles.active=local kakao-1.0.jar
```


