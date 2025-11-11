For	                      Commands	                                          Work

	                        driverquery	                                        Lists All Installed Drivers	
	                        powershell start cmd -v runAs 	                    Run the Command Prompt as an Administrator	cd\  start from c drive
	                        chdir or cd	                                        Changes the Current Working Directory to the Specified Directory	cd /d d:  for change drive
	                        systeminfo	                                        Shows Your PC's Details	cd.. one folder back
Java	
	                        For Run Java Program
  Compile Program                   C:\Users\Your Name>javac Main.java
  Run Java Program                  C:\Users\Your Name>java Main
                          Hello World

Appium
                          abd.exe devices for Command line
                          DesiredCapabilities dc = new DesiredCapabilities();                            Open Appium and Coonect
                          dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, ""Appium"");            For Verify : abd.exe devices
                          dc.setCapability(MobileCapabilityType.PLATEFORM_NAME, ""Android"");            then use Eclipse
                          dc.setCapability(MobileCapabilityType.PLATEFORM_VERSION, ""5.1"");
                          dc.setCapability(MobileCapabilityType.DEVICE_NAME, ""Android"");
                          dc.setCapability(MobileCapabilityType.APP, ""F\\Google Drive\\Trainning Material\\Appium\\APK Files\\IndiaMART.apk"");

Commands - SQL + Jenkins + Appium
CMD
cd /d d:  	for change drive
cd\  		start from c drive
cd.. 		one folder back
dir  		To know file and folder name avilable in current directory
cls  		To clear Command Prompt

Give folder permission - change access to Administrator[Extenal Drive] -> Run Command Prompt as Administrator
	takeown /F "F:\WindowsApps" /R /D Y
	icacls "F:\WindowsApps" /grant administrators:F /T
✅ What this does:
takeown changes ownership to the Administrators group (recursively)
icacls gives Full Control permissions to Administrators

takeown /F "E:\Applications" /R /D Y
icacls "E:\Applications" /grant administrators:F /T
__________________________________________
Jenkins - Manually Start
Jenkins.war path: 	cd C:\Users\Shivam Parashar\OneDrive\Jenkins\
					cd C:\Users\Shivam Parashar\Jenkins
To Start Jenkins: 	java -jar jenkins.war
Pstgre Password : Password 
__________________________________________
To satrt server - 			appium
For app web version - 		appium --allow-cors
To clean aommand prompt - 	cls
_________________________________________
mysql --version
mysqld --console
mysql -u root -p
MYSQL password : Password@1213
clear cmd - system cls
C:\Program Files\MySQL\MySQL Server 8.0\bin
C:\ProgramData\MySQL\MySQL Server 8.0

mysqld --defaults-file="C:\\ProgramData\MySQL\MySQL Server 8.0\\my.ini" --init-file=c:\\mysql-init.txt --console

Common:
Location file : 	cd bqurious
File Run : 			java -jar startBqClient.jar 

Location -> Devices -> Billing Contract -> Create Bill
Bill > Bill Item 

agar kabhi ye error aye to follow these steps :
i- Launch chrome://flags/#allow-insecure-localhost on Chrome
ii- Look for the option "Allow invalid certificates for resources loaded from localhost." and enable the option.
iii- Relaunch Chrome
iv- Access BQ Platform and try Recording/Local Execution.


