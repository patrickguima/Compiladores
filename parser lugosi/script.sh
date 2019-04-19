#!/bin/bash
javacc Lugosi.jj
javac *.java
java Lugosi test.lug