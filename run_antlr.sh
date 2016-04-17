#!/bin/bash     
export CLASSPATH=".:/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH"
file=Hello
#read -p "Antlr Grammar file Name" file
echo "Running Antlr on the grammar"
java -jar /usr/local/lib/antlr-4.5.3-complete.jar -visitor $file.g4
javac $file*.java
echo "Enter your commands"
java org.antlr.v4.gui.TestRig $file program -gui
