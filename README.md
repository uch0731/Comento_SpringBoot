# Comento BackEnd SpringBoot


## HomeWork3 
SpringBoot 환경설정 & 테스트

1. 개발환경 세팅

   * JDK-11 사용, SpringBoot 2.7.13 사용

   * Eclipse 2021-09 (4.21.0) 사용 

   * MySql 8.0.21 사용
  
   * myBatis 2.3.1


2. 테스트

   * Mybatis 사용해서 입력받은 년도의 총 로그인 횟수 출력하기

## HomeWork4 
SQL 활용해서 API 개발

API 가이드 문서 작성

1. SQL
   
    * 월별 접속자 수

      ex) 4월
    
       SELECT COUNT(*) AS totCnt

        FROM statistc.requestinfo

        Where (SUBSTR(requestinfo.createDate, 3, 2)) = 04;
    
     
    * 일자별 접속자 수

      ex) 4월4일

      SELECT COUNT(*) AS totCnt
    
      FROM statistc.requestinfo
    
      Where (SUBSTR(requestinfo.createDate, 3, 4)) = 0404;
    
   
    * 평균 하루 로그인 수

      SELECT COUNT(requestinfo.createDate) / COUNT(DISTINCT SUBSTR(requestinfo.createDate, 3, 4)) AS averageLogin
      
      FROM statistc.requestinfo;
    
   
    * 휴일을 제외한 로그인 수 ( 해당 문제에서는 휴일을 포함합니다.)
    
           *** API 구축시에는 추가 구현 필요 : 쿼리 + @(별도의 db생성 or 공공API 활용) )**
    
    * 부서별 월별 로그인 수

      ex) 4월 부서 ppp

      SELECT COUNT(*) AS totCnt
    
      FROM requestinfo LEFT JOIN user ON requestinfo.userID = user.userID

      where (SUBSTR(requestinfo.createDate, 3, 2)) = '04' and hr_organ = 'ppp';
