#!/bin/bash

echo "your name is: " && whoami
echo "your working directory is: " && pwd
echo "number of processes: " && ps -ef | wc -l
echo "done"
