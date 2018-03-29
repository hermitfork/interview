#!/bin/bash
grep_name=$1
jar_path=$2
log_path=$3
if [ -z "$1" ]
then
 echo "---------------------------------------------------------------------------"
 echo "| For example: ./run.sh Artificial.jar /data/Artificial.jar /data/log.file |"
 echo "| Artificial.jar -> is jar name                                            |"
 echo "| /data/Artificial.jar -> is jar path                                      |"
 echo "| /data/log.file -> is log path                                            |"
 echo "---------------------------------------------------------------------------"
 echo "---------------------------------------------------------------------------"
else
PID=$(ps -ef | grep $grep_name | grep -v grep | grep -v /bin/bash | awk '{print $2}')
#echo $(ps -ef | grep $grep_name | grep -v grep | grep -v /bin/bash )
if [ -z "$PID" ]
then
    nohup java -jar $jar_path  >$log_path 2>&1 &
    echo "Appliction is already start,pid is $(ps -ef | grep $grep_name | grep -v grep | grep -v /bin/bash | awk '{print $2}')"
else 
    echo "Appliction is already stoppend,kill is pid $PID"
    kill $PID	
fi
fi
