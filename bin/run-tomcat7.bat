@echo off
rem /**
rem  * Copyright &copy; 2012-2016 邯郸市众翔信息科技有限公司 All rights reserved.
rem  *
rem  * Author: Vayne@163.com
rem  */
title %cd%
echo.
echo [��Ϣ] ʹ��Tomcat7������й��̡�
echo.
rem pause
rem echo.

cd %~dp0
cd..

set MAVEN_OPTS=%MAVEN_OPTS% -Xms256m -Xmx512m -XX:PermSize=128m -XX:MaxPermSize=256m
call mvn tomcat7:run

cd bin
pause