#!/bin/bash
# 需要在/etc/profile配置FLINK_HOME，添加到path
# idea需要设置换行符为Linux风格 Editor -> Code Style -> separator Unix
flink run -m yarn-cluster \
-d \
-yqu default \
-ynm DataCleanJob \
-yn 2 \
-ys 2 \
-yjm 1024 \
-ytm 1024 \
-c xuwei.tech.DataReportScala \
/data/soft/jars/DataReport/DataRportScala-1.0-SNAPSHOT-jar-with-dependencies.jar