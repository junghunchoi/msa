accounts

docker build . -t junghunchoi/accounts:s4

docker compose up -d으로 도커 compose 실행 -d는 로그 안봄 처리
docker compose down 을 통해 멈추고 실행중인 컨테이너를 삭제한다.

docker push junghunchoi/loans:s4
docker push junghunchoi/accounts:s4

15개의 msa 원칙

1. 앱과 코드베이스는 1:1로 연결되어야한다.
- 다른 레포에 업로드하고 관리할 수 있어야한다?

---
application.yml 파일을 설정해서 record 클래스에 할당한 후 세부내용을 볼 수 있따.

---
profile을 통해 환경별로 변수를 따로 설정할 수 있다.

application.yml 을 환경에 따라 여러개의 파일을 생성한 후 개별 파일에 CONFIG.PROFILE을 통해
환경별로 인수값을 가져온다.