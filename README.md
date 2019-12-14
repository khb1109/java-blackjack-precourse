# 기능목록
===
+ 유저 이름을 쉼표단위로 받는 기능이 필요하다.
+ 각 유저별 베팅금액을 입력받는 기능이 필요하다.
+ 랜덤으로 카드를 뽑는 함수가 필요하다.
+ 지금까지 뽑은 카드리스트를 String으로 변환하는 함수가 필요하다.
+ 지금까지 뽑은 카드의 합을 계산하는 함수가 필요하다.
+ 두장을 받자마자 21을 받을 떄 처리하는 함수가 필요하다.
+ 카드의 합을 통하여 유저에게 계속 입력을 받을지 물어보는 함수가 필요하다.
+ 딜러는 값이 16이하라면 추가로 카드를 받는 함수 필요.
+ User, Dealer의 현재 카드상태를 String으로 반환하는 함수 필요.
+ 중복되지 않는 카드를 출력하는 함수 필요.
+ 21가 가장가깝고, 카드가 가장 적은 값을 저장하는 함수 필요.
+ 21가 가장가깝고, 카드가 가장 적은 값으로 승자를 결정하는 함수 필요.
+ 승패자를 나누어 결과값을 계산하는 함수 필요.


# 입출력 클래스
## 입력클래스
+ 유저의 이름을 입력받는 함수가 필요하다.
+ 배팅금액을 입력받는 함수가 필요하다.
+ 카드를 더 받는지 물어보는 함수가 필요하다.


## 출력클래스
+ "게임의 참여할 사람의 이름을 입력하세요"를 출력하는 함수 필요.
+ User + "의 배팅금액은?"을 출력하는 함수 필요
+ "딜러와" + Users + "에게 2장을 나누었습니다."를 출력하는 함수 필요
+ User의 카드리스트를 출력하는 함수 필요.
+ User + "는 한장의 카드를 더 받으시겠습니까?" 함수 필요
+ "딜러는 16이하라 한장의 카드를 더 받았습니다" 함수 필요.
+ 결과 값이 얼마인지 출력하는 함수 필요. EX) "결과 : 21"
+ 최종수익 + 각 유저별 수익금을 출력하는 함수구현

# 카드 덱 클래스 (현재 갖고있는 카드)
+ 랜덤으로 카드를 뽑는 함수 구현 (중복을 제어할 수 있어야함)


# People 클래스 구현
+ 지금까지 뽑은 카드리스트를 String으로 변환하는 함수가 필요하다.
+ 지금까지 뽑은 카드의 합을 계산하는 함수가 필요하다.
+ User, Dealer의 현재 카드상태를 String으로 반환하는 함수 필요.

## Dealer 클래스


## Player 클래스
+ 이름을 얻을 수 있는 getter 함수 구현


# Controller 클래스
+ 게임에 시스템의 입출력함수를 연결시켜주는 함수 필요.
+ 이름을 쉼표단위로 잘라주는 함수가 필요.
+ 두장을 받자마자 21을 받을 떄 처리하는 함수가 필요하다. 
+ 카드의 합을 통하여 유저에게 계속 입력을 받을지 물어보는 함수가 필요하다.
+ 딜러가 카드를 받는 함수 필요.
+ 최종카드리스트와 합을 안내하는 함수
+ 최종수익을 안내하는 함수