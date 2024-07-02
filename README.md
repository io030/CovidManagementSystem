# CovidManagementSystem
코로나 환자 관리용 자바 프로그램 프로젝트 CovidManagementSystem, Java 11, Eclipse IDE 

dat 폴더 속에서 각종 데이터들을 txt파일로 저장하여 관리함

관리자, 의사, 간호사, 환자로 이용자를 분리하여 각 기능을 구현

1. 환자가 상태 정보를 입력하면 담당 의료진이 환자의 상태 정보를 조회 할 수있는 프로그램
2. 담당 의료진이 환자의 상태를 확인후 진료하며 EMR조회 및 작성을 할 수 있는 프로그램
3. 환자의 퇴원 및 병실 관리와 정보(환자 정보, 의료진 정보) 조회할 수 있는 프로그램
4. 환자가 자신의 의무기록, 처방약 정보를 조회 할 수 있는 프로그램
5.관리자가 병원 정보및 의료진의 업무 정보를 수정 할 수있는 프로그램 

개요
- 기존 격리 상황에서 격리 환자의 상태(체온, 혈압, 맥박, 산소포화도) 측정하여 수기로 작성하고 사진 촬영 후 전송하면 의료진이 문서화 작업을 하는 과정을 단순화하고 관리의 효율성을 증가시키고자 한다.

Language
- Java 11

Development tool
- Eclipse

프로젝트 참여 인원
- 팀장: 임동균
- 팀원: 5명
 
개발 기간
- 2022.09.22 ~ 2023.10.23

|담당 기능|내용|
|:--|---|
|더미 데이터 생성|의사,간호사,이용자들의 모든 정보를 더미로 생성해서 입력한다. 계층마다 데이터값 종류와 범위를 조절하여 반복문과 랜덤을 통해 생성한다.|
|회원가입|아직 회원에 등록되지 않은 이용자를 회원으로 등록한다. 이용자의 개인정보와 아이디 및 패스워드를 입력받는다.|
|회원탈퇴|회원 가입한 이용자들이 자신의 모든 정보를 삭제한 후 회원 자격을 삭제한다.|
|로그인|회원 가입한 이용자가 자신의 아이디와 패스워드를 입력하여 로그인한다. 로그인한 정보는 계속해서 값을 전달하며 유지된다.|
|병원 정보 조회|해당 병원의 위치와 이름,전화번호 그리고 규모와 이용시설 정보를 조회할 수 있다.|
|병원 정보 관리|병원의 위치,이름,전화번호,규모,이용시설 정보를 수정할 수 있다.|

<details>
    <summary>구현기능 화면</summary>

![image](https://github.com/io030/CovidManagementSystem/assets/114460492/191c3c3f-6ad0-48ad-8ac6-9ea8ec8c0bec)

![image](https://github.com/io030/CovidManagementSystem/assets/114460492/da8e86ca-182e-4284-b677-4fce2873a819)

![image](https://github.com/io030/CovidManagementSystem/assets/114460492/c247e88e-b341-4a75-b7ba-bbda0d6be55b)

![image](https://github.com/io030/CovidManagementSystem/assets/114460492/e5ed595f-d222-41c7-bc9f-8049b1e43299)

![image](https://github.com/io030/CovidManagementSystem/assets/114460492/5f4c742a-fa19-4c2d-9c87-0c55e7c59320)

![image](https://github.com/io030/CovidManagementSystem/assets/114460492/760eada6-7974-4b03-98eb-a7c1235e51f8)

![image](https://github.com/io030/CovidManagementSystem/assets/114460492/8cd41f65-b420-48fe-b56d-8a7e21c82d54)

![image](https://github.com/io030/CovidManagementSystem/assets/114460492/9d228c77-2470-4095-a131-3ef6609e742c)

</details>
