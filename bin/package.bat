@echo off
rem /**
rem  * Copyright &copy; 2012-2016 邯郸市众翔信息科技有限公司 All rights reserved.
rem  *
rem  * Author: Vayne@163.com
rem  */
echo.
echo [��Ϣ] ������̣�����war���ļ���
echo.
pause
echo.

cd %~dp0
cd..

call mvn clean package -Dmaven.test.skip=true

cd bin
pause