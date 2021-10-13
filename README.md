# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 구현 사항
- 자동차 이름(Name) => 원시값과 문자열 포장
    - 이름 길이 검증 테스트

- 자동차 움직인 거리(Distance) => 원시값과 문자열 포장
    - 1씩 증가하기 테스트

- 자동차(Car)
    - 자동차가 전진하면 거리는 1씩 증가하는 테스트
    
- 자동차들(Cars) => 일급 콜렌션 활용
    - 가장 멀리 간 거리 값 구하기 테스트
    - 가장 멀리 간 자동차가 1대일 경우 테스트
    - 가장 멀리 간 자동차가 2대 이상 일 경우 테스트
    - 이름이 중복된 자동차가 있는 경우 테스트
  
- 입력 관련(input)
    - 자동차 입력 검증(이름 사이에 ,가 있는지)
    - 시도할 횟수 검증(1이상 인지)
    - 사용자의 잘못된 입력 값 검증 
    - 입력을 통한 Car, Cars 객체 생성 테스트
  
- 경기장(RacingStadium)
    - 입력된 라운드(시도) 및 자동차들 세팅
    - 라운드당 자동차들이 전진한 값 렌더링
    - 최종 우승자 렌더링
  

  
