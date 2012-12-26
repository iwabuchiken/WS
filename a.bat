@ECHO OFF
REM ************************************
REM *
REM *	Set vars
REM *
REM ************************************

REM *********************
REM *	1. Git
REM *	2. nbp_new
REM *	3. Python
REM *	4. Java
REM *	5. Sakura
REM *	
REM *********************
ECHO Setting a var: SAKURA_HOME=C:\WORKS\PROGRAMS\sakura_x86
SET SAKURA_HOME=C:\WORKS\PROGRAMS\sakura_x86

ECHO Setting a var: JAVA_HOME=C:\WORKS\PROGRAMS\Java_7u7_i586
SET JAVA_HOME=C:\WORKS\PROGRAMS\Java_7u7_i586

ECHO Setting a var: GIT_CMD=C:\WORKS\PROGRAMS\msysgit_full\msysgit\cmd
SET GIT_CMD=C:\WORKS\PROGRAMS\msysgit_full\msysgit\cmd

ECHO Setting a var: NBP_NEW=C:\WORKS\WS\G_nbp_new
SET NBP_NEW=C:\WORKS\WS\G_nbp_new

ECHO Setting a var: PYTHON_HOME=C:\WORKS\PROGRAMS\Python27
SET PYTHON_HOME=C:\WORKS\PROGRAMS\Python27
ECHO Modifying path: %%PATH%%;%PYTHON_HOME%;
PATH=%PATH%;%PYTHON_HOME%;

ECHO Setting a var: ADB_HOME=C:\WORKS\PROGRAMS\Android\android-sdk\platform-tools
SET ADB_HOME=C:\WORKS\PROGRAMS\Android\android-sdk\platform-tools
ECHO Modifying path: %%PATH%%;%ADB_HOME%;
PATH=%PATH%;%ADB_HOME%;

REM ************************************
REM *
REM *	Set path
REM *
REM ************************************

REM *********************
REM *	1. Git
REM *	2. nbp_new
REM *	3. Python
REM *	4. Java
REM *	5. Sakura
REM *	
REM *********************
ECHO Modifying path: %%PATH%%;%SAKURA_HOME%;
PATH=%PATH%;%SAKURA_HOME%;

ECHO Modifying path: %%PATH%%;%JAVA_HOME%;
PATH=%PATH%;%JAVA_HOME%;

ECHO Modifying path: %%PATH%%;%GIT_CMD%;
PATH=%PATH%;%GIT_CMD%;

ECHO Modifying path: %%PATH%%;%NBP_NEW%;
PATH=%PATH%;%NBP_NEW%;

ECHO Setting a var: C:\WORKS\PROGRAMS\Java_7u7_i586\bin
SET JAVA_HOME_BIN=C:\WORKS\PROGRAMS\Java_7u7_i586\bin
ECHO Modifying path: %%PATH%%;%JAVA_HOME_BIN%;
PATH=%PATH%;%JAVA_HOME_BIN%;

ECHO Setting a var: C:\WORKS\PROGRAMS\sqlite3
SET SQLITE3_HOME=C:\WORKS\PROGRAMS\sqlite3
ECHO Modifying path: %%PATH%%;%SQLITE3_HOME%;
PATH=%PATH%;%SQLITE3_HOME%;

ECHO Setting a var: RUBY_HOME_BIN=C:\WORKS\PROGRAMS\RailsInstaller\Ruby1.9.3\bin
SET RUBY_HOME_BIN=C:\WORKS\PROGRAMS\RailsInstaller\Ruby1.9.3\bin
ECHO Modifying path: %RUBY_HOME_BIN%;%%PATH%%;
PATH=%RUBY_HOME_BIN%;%PATH%;

ECHO Setting a var: MINGW_BIN=C:\WORKS\PROGRAMS\MinGW\bin
SET MINGW_BIN=C:\WORKS\PROGRAMS\MinGW\bin
ECHO Modifying path: %MINGW_BIN%;%%PATH%%;
PATH=%MINGW_BIN%;%PATH%;

ECHO Setting a var: VC2008_BIN=C:\Program Files\Microsoft Visual Studio 9.0\VC\bin
SET VC2008_BIN=C:\Program Files\Microsoft Visual Studio 9.0\VC\bin
ECHO Modifying path: %VC2008_BIN%;%%PATH%%;
PATH=%VC2008_BIN%;%PATH%;

ECHO Setting a var: SUBVERSION_BIN=C:\WORKS\PROGRAMS\Subversion_Client
SET SUBVERSION_BIN=C:\WORKS\PROGRAMS\Subversion_Client
ECHO Modifying path: %SUBVERSION_BIN%;%%PATH%%;
PATH=%SUBVERSION_BIN%;%PATH%;

ECHO C:"\Program Files"\"Microsoft Visual Studio 9.0"\VC\bin\vcvars32.bat

REM *********************
REM *
REM *	Commands
REM *
REM *********************
ECHO C:\WORKS\PROGRAMS\FreeMind\FreeMind.exe

ECHO cd C:\WORKS\WS\Rails

REM *********************
REM *
REM *	End
REM *
REM *********************
