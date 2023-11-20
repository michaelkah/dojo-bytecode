# Coding Dojo by LV 1871: Java bytecode assembly

## IntelliJ

* Compiler: Build > Recompile
* Decompiler: View > Show Decompiled Class
* Bytecode-Viewer: View > Show Bytecode
* Compiler-Settings: Settings > Build, Execution, Deployment > Compiler > Java Compiler > Additional command line parameters: ```-g:none```
* Round Trip:
  * Java
  * Compiler
  * Decompiler
  * Diff
  * Compiler

## Vorbereitung: Java 8 einstellen

Alle hier gezeigten Kommandos benutzen die Bash, nicht Command Prompt oder Windows Power Shell.

```shell
which java
```
```shell
which javac
```
```shell
export PATH=/c/Programme/AdoptOpenJDK/jdk-8-hotspot/bin:$PATH # Pfad entsprechend der eigenen Maschine anpassen!
```
```shell
java -version
```
```shell
javac -version
```

## JDK: javac und javap

```shell
javac -g:none -d out src/Main.java
```
```shell
java -cp out Main
```
```shell
javap -c -p -s -l -v out/Main.class
```

## Chasm

Disassembler:
```shell
java -jar lib/chasm.jar out/Main.class src/Main.chasm
```

Assembler:
```shell
java -jar lib/chasm.jar src/Main.chasm out/Main.class 
```

Links:
* [Chasm - Java assembler and disassembler using S-expressions](https://github.com/minad/chasm)
* [List of Java bytecode instructions - Wikipedia
  ](https://en.wikipedia.org/wiki/List_of_Java_bytecode_instructions)
* [The Java Virtual Machine Instruction Set - Oracle](https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-6.html)
