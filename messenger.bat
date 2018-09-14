@ echo off
:A
Cls
echo MESSENGER
set /p n=User:
set /p m=Message:
msg %n% console %m%
Pause
Goto A