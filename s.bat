@echo off
rem Set WshShell = CreateObject("WScript.Shell")
Set WshShell = WScript.CreateObject("WScript.Shell")
rem cmds=WshShell.RUN("C:\WORKS\WS\WS_Android\Time_calculator\bin\p1_E_5_multiple_sources.jar", 0, True)
rem cmds=WshShell.RUN("C:\WORKS\WS\WS_Android\Time_calculator\bin\p1_E_5_multiple_sources.jar", 1, True)
rem cmds=WshShell.RUN("C:\abc.bat", 1, True)
rem WshShell.RUN("C:\abc.bat", 1, True)
rem WshShell.Run("C:\abc.bat", 1, True)
rem WshShell.Run "C:\abc.bat"
Set WshShell = Nothing
WScript.Echo "abc"
