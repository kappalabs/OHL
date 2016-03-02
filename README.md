OHunterLibrary (OHL)
====================

This library exists only for purposes of communication between server [OHS](https://github.com/kappalabs/OHS) and client [OHC](https://github.com/kappalabs/OHC) in O-Hunter project.

Build
-----
This library does not depend on any other libraries. For compability with Android, use **JDK 1.7** to build it.

If possible, use [NetBeans IDE](https://netbeans.org/) to simply load and build this project.

Alternatively, you can use ant:

Just ```$ ant```, or with the path to JDK:
```
$ ant -Dplatforms.JDK_1.7.home=/usr/lib/jvm/java-7-oracle/
```

Documentation
-------------
Several possible ways can be found:
 - Use [NetBeans IDE](https://netbeans.org/) to generate javadoc.
 - Use [Javadoc Tool](http://www.oracle.com/technetwork/java/javase/documentation/index-jsp-135444.html) to generate the documentation.
 - Use ```$ ant``` to build and generate javadoc at the same time.

Links
-----
 - OHunterClient
    - https://github.com/kappalabs/OHC
 - OHunterServer
    - https://github.com/kappalabs/OHS
