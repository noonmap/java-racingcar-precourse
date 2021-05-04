# 자동차 경주 게임

## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 기능 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9사이에서 random값을 구한 후 random값이 4이상일 경우 전진하고, 3이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
    
## 기능 세분화 하기
- **Input**
    - 사용자 입력 → 이동 횟수
        - 임의로 10개 이하로 제한한다.
    - 사용자 입력 → 자동차 이름 (자동차 갯수 제한이 없음)
        - 쉼표로 구분한다
        - 5자 이하만 가능하다
- **Proceed**
    - 매 이동 횟수 마다 n개의 Random 숫자를 구한다.
        - n개의 Random 숫자에 대한 전진 or 정지를 판단한다.
        - no ≤ 3 이면 정지
        - no ≥ 4 이면 전진
    - n개의 자동차에 대해 전진 or 정지 동작을 수행한다.
        - 전진이면 goCnt++을 한다
    - 출력 포맷에 따라 자동차 이름과 이동 진행 상황을 출력한다.
        - 이동 진행 상황 : 각 자동차의 goCnt만큼 '-'를 출력한다.
    - 가장 goCnt가 큰 자동차를 찾는다.
        - 자동차를 goCnt에 따라 정렬한다.
        - 가장 goCnt가 큰 자동차들을 출력한다.
- **Output**
    - 가장 goCnt가 큰 자동차(1개 이상)를 출력한다.

## 기능 단위 클래스 구분하기

- MoveCountNumber
    - 이동 횟수를 의미
    - 10 이하의 정수
- CarStatus
    - Car의 STOP or FORWARD 이동 상태
- CarName
    - 5자 이내의 자동차 이름 String
- Car
    - 규칙에 따른 play
        - no ≤ 3 → STOP
        - no ≥ 4 → FORWARD, progress += "-"
    - report
        - CarName + progress("-") 출력
- Cars
    - CarNames string을 입력받은 후 ","에 따라 분리해서 Car 객체를 생성
    - 규칙에 따른 play
        - getRandomNumber()
        - Car.play()
    - winner 구하기
        - sort: progress길이에 따라 Car 정렬
        - 정렬된 Car 중 가장 Progress가 많이 진행된 자동차들을 고르기
    - report
        - 각 Car의 report
- RacingCarGame
    - 사용자 입력 : 자동차 이름
    - 사용자 입력 : 이동 횟수
    - print result
        - 가장 progress가 긴 Car들을 출력

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
