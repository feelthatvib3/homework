#!/bin/bash

processes=ps -ef | wc- l
result=$(expr $processes - 1)

echo -n "your name is: "
whoami
echo -n "your working directory is: "
pwd
echo -n "number of processes: "
result
echo "done"
