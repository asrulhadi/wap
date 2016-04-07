rem Batch file to execute the wap tool in Windows operating system

rem Copyright (C) 2014  Ibéria Medeiros <ibemed at gmail.com>
rem
rem
rem    This program is free software: you can redistribute it and/or modify
rem    it under the terms of the GNU General Public License as published by
rem    the Free Software Foundation, either version 2 of the License, or
rem    (at your option) any later version.
rem
rem    This program is distributed in the hope that it will be useful,
rem    but WITHOUT ANY WARRANTY; without even the implied warranty of
rem    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
rem    GNU General Public License for more details.
rem
rem    You should have received a copy of the GNU General Public License
rem    along with this program.  If not, see <http://www.gnu.org/licenses/gpl-3.0.html>.
rem
rem
rem   WAP tool v2.0.1
rem   Batch file to run WAP tool

@echo off

cls
set dir=%~dp0
rem cd %dir%
java -jar %dir%\wap.jar %* 2>nul



