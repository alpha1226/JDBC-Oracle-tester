# JDBC-Oracle-tester
JDBC to Oracle tester, 지연 시간 측정 모듈  
  
사용법  
compile: javac -classpath ojdbc6.jar JDBC-Oracle-tester.java  
run:     javac -classpath ojdbc6.jar:. JDBC-Oracle-tester  

JDBC-Oracle-tester.java에 있는 코드중  
Line 16: conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.1:1521:ORA", "db_user_id", "db_user_password");
이 위치에 테스트할 oracle db의 정보를 입력 한 후  
compile하고나서 
run을 여러번 하여 connected Time을 측정한다.

---

Connected Time이 일정치 않거나 지연이 심하면  
https://rikroy.tistory.com/29  
이 글을 확인하여 수정한 후 재측정을 해보시면 됩니다


현재 등록되어있는 odbc는 oracle 11g용 odbc6로  
새로운 odbc가 필요하시면  
https://www.oracle.com/database/technologies/jdbc-drivers-12c-downloads.html  
여기서 다운로드 받은 후 odbc6만 대체해주시면 됩니다.