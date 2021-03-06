/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 2002-2006
 *      Sleepycat Software.  All rights reserved.
 *
 * $Id: JarMain.java,v 1.1 2006/05/06 09:00:28 ckaestne Exp $
 */

package com.sleepycat.je.utilint;

import java.lang.reflect.Method;

/**
 * Used as the main class for the manifest of the je.jar file, and so it is
 * executed when running: java -jar je.jar.  The first argument must be the
 * final part of the class name of a utility in the com.sleepycat.je.util
 * package, e.g., DbDump.  All following parameters are passed to the main
 * method of the utility and are processed as usual.
 *
 * Apart from the package, this class is ambivalent about the name of the
 * utility specified; the only requirement is that it must be a public static
 * class and must contain a public static main method.
 */
public class JarMain {

    private static final String USAGE = "usage: java <utility> [options...]";
    private static final String PREFIX = "com.sleepycat.je.util.";

    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                usage("Missing utility name");
            }
            Class cls = Class.forName(PREFIX + args[0]);

            Method mainMethod = cls.getMethod
                ("main", new Class[] { String[].class });

            String[] mainArgs = new String[args.length - 1];
            System.arraycopy(args, 1, mainArgs, 0, mainArgs.length);

            mainMethod.invoke(null, new Object[] { mainArgs });
        } catch (Throwable e) {
            usage(e.toString());
        }
    }

    private static void usage(String msg) {
        System.err.println(msg);
	System.err.println(USAGE);
	System.exit(-1);
    }
}
