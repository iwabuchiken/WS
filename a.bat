@ECHO OFF

REM ************************************
REM *
REM *	Options
REM *
REM ************************************
if "%1"=="-h" (
	call :help
	goto :end
	
) else if "%1"=="fm" (
	echo Calling fm
	call :fm

	goto :end

) else if "%1"=="fm2" (
	echo Calling fm2
	call :fm2

	goto :end

) else if "%1"=="fm3" (
	echo Calling fm3
	call :fm3

	goto :end

) else if "%1"=="b" (

	call :basic
	goto :end

) else if "%1"=="book" (
	call :book
	goto :end

) else if "%1"=="admin" (
	call :admin
	goto :end

) else if "%1"=="muse" (
	call :muse
	goto :end

) else if "%1"=="time" (
	call :time
	goto :end

) else if "%1"=="and" (
	call :and
	goto :end

) else if "%1"=="and" (
	call :and
	goto :end

) else if "%1"=="path" (
	call :path_only
	goto :end

) else if "%1"=="p" (
	call :path_only
	goto :end

) else if "%1"=="" (
	goto :set_path
REM 	goto :end

) else if "%1"=="ard" (
	goto :ard

) else (
	echo Option: %1 --^> Unknown option
	call :help
	goto :end
)


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
:set_path
ECHO Setting a var: SAKURA_HOME=C:\WORKS\PROGRAMS\sakura_x86
SET SAKURA_HOME=C:\WORKS\PROGRAMS\sakura_x86

ECHO Setting a var: JAVA_HOME=C:\WORKS\PROGRAMS\Java_7u7_i586
SET JAVA_HOME=C:\WORKS\PROGRAMS\Java_7u7_i586

ECHO Setting a var: GIT_CMD=C:\WORKS\PROGRAMS\msysgit_full_1.7.11\Git\cmd
SET GIT_CMD=C:\WORKS\PROGRAMS\msysgit_full_1.7.11\Git\cmd

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

ECHO Setting a var: WS_HOME=C:\WORKS\WS
SET WS_HOME=C:\WORKS\WS
ECHO Modifying path: %%PATH%%;%WS_HOME%;
PATH=%PATH%;%WS_HOME%;

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

ECHO Setting a var: FFMPEG_BIN=C:\WORKS\PROGRAMS\ffmpeg-r16537-gpl-static-win32\bin
SET FFMPEG_BIN=C:\WORKS\PROGRAMS\ffmpeg-r16537-gpl-static-win32\bin
ECHO Modifying path: %FFMPEG_BIN%;%%PATH%%;
PATH=%FFMPEG_BIN%;%PATH%;

ECHO Setting a var: MP4BOX_BIN=C:\WORKS\PROGRAMS\GPAC
SET MP4BOX_BIN=C:\WORKS\PROGRAMS\GPAC
ECHO Modifying path: %MP4BOX_BIN%;%%PATH%%;
PATH=%MP4BOX_BIN%;%PATH%;

ECHO Setting a var: MECAB_BIN=C:\WORKS\PROGRAMS\MeCab\bin
SET MECAB_BIN=C:\WORKS\PROGRAMS\MeCab\bin
ECHO Modifying path: %MECAB_BIN%;%%PATH%%;
PATH=%MECAB_BIN%;%PATH%;

ECHO Setting a var: QT_BIN=C:\WORKS\PROGRAMS\Qt\Qt5.0.0\5.0.0\msvc2010\bin
SET QT_BIN=C:\WORKS\PROGRAMS\Qt\Qt5.0.0\5.0.0\msvc2010\bin
ECHO Modifying path: %QT_BIN%;%%PATH%%;
PATH=%QT_BIN%;%PATH%;

ECHO Setting a var: MAVEN_BIN=C:\WORKS\PROGRAMS\apache-maven-3.0.4\bin
SET MAVEN_BIN=C:\WORKS\PROGRAMS\apache-maven-3.0.4\bin
ECHO Modifying path: %MAVEN_BIN%;%%PATH%%;
PATH=%MAVEN_BIN%;%PATH%;

ECHO Setting a var: ANT_BIN=C:\WORKS\PROGRAMS\apache-ant-1.8.4\bin
SET ANT_BIN=C:\WORKS\PROGRAMS\apache-ant-1.8.4\bin
ECHO Modifying path: %ANT_BIN%;%%PATH%%;
PATH=%ANT_BIN%;%PATH%;

ECHO Setting a var: FM_HOME=C:\WORKS\WS\WS_Android~\FM
SET FM_HOME=C:\WORKS\WS\WS_Android~\FM
ECHO Modifying path: %FM_HOME%;%%PATH%%;
PATH=%FM_HOME%;%PATH%;


REM *********************
REM *
REM *	Commands
REM *
REM *********************
ECHO.
ECHO start C:\WORKS\PROGRAMS\FreeMind\FreeMind.exe
start C:\WORKS\PROGRAMS\FreeMind\FreeMind.exe
ECHO cd C:\WORKS\WS\Rails
ECHO start C:\WORKS\WS\WS_Android\Time_calculator\bin\p1_E_5_multiple_sources.jar
start C:\WORKS\WS\WS_Android\Time_calculator\bin\p1_E_5_multiple_sources.jar
ECHO C:"\Program Files"\"Microsoft Visual Studio 9.0"\VC\bin\vcvars32.bat
ECHO C:\WORKS\PROGRAMS\MuseScore\bin\mscore.exe
ECHO start C:\WORKS\PROGRAMS\eclipse_3-7\eclipse.exe
start C:\WORKS\PROGRAMS\eclipse_3-7\eclipse.exe
REM ECHO pushd C:\WORKS\WS\WS_Android~\FM ^& gitk
ECHO start C:\WORKS
start C:\WORKS
ECHO start C:\Users\IwabuchiKen\AppData\Local\Google\Chrome\Application\chrome.exe
start C:\Users\IwabuchiKen\AppData\Local\Google\Chrome\Application\chrome.exe

goto :end

REM ************************************
REM *
REM *	Functions: show_fm
REM *
REM ************************************
:fm
	echo pushd C:\WORKS\WS\WS_Android~\FM ^& gitk
	echo g p origin master
	echo g pull git^@github.com:iwabuchiken/FM.git
	echo g c -a -m "W"
	echo g c -a -m "W" ^&^& g p origin master
	echo pushd C:\WORKS\WS\WS_Android~\FM ^&^& g c -a -m "W" ^&^& g p origin master
	goto :end

REM ************************************
REM *
REM *	Functions: fm2
REM *
REM ************************************
:fm2
	echo pushd C:\WORKS\WS\WS_Android~\FM
	pushd C:\WORKS\WS\WS_Android~\FM
REM 	echo g a .
REM 	echo g a C:\WORKS\WS\WS_Android~\FM
REM 	g a C:\WORKS\WS\WS_Android~\FM
	echo g c -a -m "W"
REM 	g c -a -m "W"
	echo g p origin master
REM 	g p origin master
	goto :end

:fm3
	echo pushd C:\WORKS\WS\WS_Android~\FM ^&^& g a . ^&^& g c -a -m "W" ^&^& g p origin master
	pushd C:\WORKS\WS\WS_Android~\FM && g a . && g c -a -m "W" && g p origin master
	
	goto :end
REM ************************************
REM *
REM *	Functions: show_help
REM *
REM ************************************
:help
	echo ^<Syntax^>
	echo 	a [Option]
	echo ^<Options^>
	echo 	-h	Show help (this)
	echo 	admin	Show ADMIN-related commands
	echo 	and	Show Android-related commands
	echo 	ard	Show Arduino-related commands
	echo 	b	Show basic commands
	echo 	book	Execute bookmarks-related operations

	echo 	fm	Show FM-related commands
	echo 	muse	Show MuseScore-related commands
	echo 	p
	echo 	path	Set paths only (No apps started)
	echo 	time	Show TimeCalculater-related commands
	
	goto :end
REM ************************************
REM *
REM *	Functions: show basic commands
REM *
REM ************************************
:basic
	ECHO C:\WORKS\PROGRAMS\FreeMind\FreeMind.exe
	ECHO C:\WORKS\WS\WS_Android\Time_calculator\bin\p1_E_5_multiple_sources.jar
	ECHO java -jar C:\WORKS\WS\WS_Android\Time_calculator\bin\p1_E_5_multiple_sources.jar
	ECHO C:\WORKS\PROGRAMS\MuseScore\bin\mscore.exe	
	ECHO C:\Users\IwabuchiKen\AppData\Local\Google\Chrome\Application\chrome.exe
	ECHO C:\WORKS\PROGRAMS\processing-2.0b8\processing.exe
	ECHO C:\WORKS\PROGRAMS\arduino-1.0.4\arduino.exe
	ECHO C:\WORKS\PROGRAMS\eclipse_3-7\eclipse.exe
	ECHO C:\WORKS\PROGRAMS\pleiades-e3.6-ultimate_20110326\eclipse\eclipse.exe
	goto :end

REM ************************************
REM *
REM *	Functions: show basic commands
REM *
REM ************************************
:book
	echo pushd C:\WORKS\WS\ADMIN_USB_1\bookmarks
	echo git add .
	echo g c -m "W"
	echo g p origin master
	
	goto :end

:admin
	echo pushd C:\WORKS\WS\ADMIN_USB_1 ^& gitk
	echo g p origin master
	echo g pull git@github.com:iwabuchiken/ADMIN_USB_1.git
	echo g c -a -m "W"
	echo g c -a -m "W" ^&^& g p origin master
	goto :end

:muse
	echo C:\WORKS\PROGRAMS\MuseScore\bin\mscore.exe
	echo pushd C:\WORKS\WS\WS_Android\musescore ^& gitk
	echo g p origin master
	echo g pull git@github.com:iwabuchiken/musescore.git
	echo g c -a -m "W"
	echo g c -a -m "W" ^&^& g p origin master
	echo C:\WORKS\PROGRAMS\MuseScore\bin\mscore.exe
	goto :end

:time
	echo pushd C:\WORKS\WS\WS_Android\Time_calculator
REM 	pushd C:\WORKS\WS\WS_Android\Time_calculator
	echo makejar.bat p1 E_5_multiple_sources.java
REM 	makejar.bat p1 E_5_multiple_sources.java
	goto :end

:and
	echo adb devices
	echo adb start-server
	echo adb kill-server
	goto :end

:ard
	echo pushd C:\WORKS\WS\Arduino
	echo gitk
	echo.
	echo C:\WORKS\PROGRAMS\arduino-1.0.4\arduino.exe
	
	goto :end
	
:path_only
ECHO Setting a var: SAKURA_HOME=C:\WORKS\PROGRAMS\sakura_x86
SET SAKURA_HOME=C:\WORKS\PROGRAMS\sakura_x86

ECHO Setting a var: JAVA_HOME=C:\WORKS\PROGRAMS\Java_7u7_i586
SET JAVA_HOME=C:\WORKS\PROGRAMS\Java_7u7_i586

ECHO Setting a var: GIT_CMD=C:\WORKS\PROGRAMS\msysgit_full_1.7.11\Git\cmd
SET GIT_CMD=C:\WORKS\PROGRAMS\msysgit_full_1.7.11\Git\cmd

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

ECHO Setting a var: WS_HOME=C:\WORKS\WS
SET WS_HOME=C:\WORKS\WS
ECHO Modifying path: %%PATH%%;%WS_HOME%;
PATH=%PATH%;%WS_HOME%;

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

ECHO Setting a var: FFMPEG_BIN=C:\WORKS\PROGRAMS\ffmpeg-r16537-gpl-static-win32\bin
SET FFMPEG_BIN=C:\WORKS\PROGRAMS\ffmpeg-r16537-gpl-static-win32\bin
ECHO Modifying path: %FFMPEG_BIN%;%%PATH%%;
PATH=%FFMPEG_BIN%;%PATH%;

ECHO Setting a var: MP4BOX_BIN=C:\WORKS\PROGRAMS\GPAC
SET MP4BOX_BIN=C:\WORKS\PROGRAMS\GPAC
ECHO Modifying path: %MP4BOX_BIN%;%%PATH%%;
PATH=%MP4BOX_BIN%;%PATH%;

ECHO Setting a var: MECAB_BIN=C:\WORKS\PROGRAMS\MeCab\bin
SET MECAB_BIN=C:\WORKS\PROGRAMS\MeCab\bin
ECHO Modifying path: %MECAB_BIN%;%%PATH%%;
PATH=%MECAB_BIN%;%PATH%;

ECHO Setting a var: QT_BIN=C:\WORKS\PROGRAMS\Qt\Qt5.0.0\5.0.0\msvc2010\bin
SET QT_BIN=C:\WORKS\PROGRAMS\Qt\Qt5.0.0\5.0.0\msvc2010\bin
ECHO Modifying path: %QT_BIN%;%%PATH%%;
PATH=%QT_BIN%;%PATH%;

ECHO Setting a var: MAVEN_BIN=C:\WORKS\PROGRAMS\apache-maven-3.0.4\bin
SET MAVEN_BIN=C:\WORKS\PROGRAMS\apache-maven-3.0.4\bin
ECHO Modifying path: %MAVEN_BIN%;%%PATH%%;
PATH=%MAVEN_BIN%;%PATH%;

ECHO Setting a var: ANT_BIN=C:\WORKS\PROGRAMS\apache-ant-1.8.4\bin
SET ANT_BIN=C:\WORKS\PROGRAMS\apache-ant-1.8.4\bin
ECHO Modifying path: %ANT_BIN%;%%PATH%%;
PATH=%ANT_BIN%;%PATH%;

ECHO Setting a var: FM_HOME=C:\WORKS\WS\WS_Android~\FM
SET FM_HOME=C:\WORKS\WS\WS_Android~\FM
ECHO Modifying path: %FM_HOME%;%%PATH%%;
PATH=%FM_HOME%;%PATH%;

ECHO Setting a var: MYSQL_HOME_BIN=C:\WORKS\PROGRAMS\xampp\mysql\bin
SET MYSQL_HOME_BIN=C:\WORKS\PROGRAMS\xampp\mysql\bin
ECHO Modifying path: %MYSQL_HOME_BIN%;%%PATH%%;
PATH=%MYSQL_HOME_BIN%;%PATH%;


	goto :end
REM *********************
REM *
REM *	End
REM *
REM *********************
:end
rem exit 0
