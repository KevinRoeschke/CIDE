/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 2002-2006
 *      Sleepycat Software.  All rights reserved.
 *
 * $Id: SecondaryKeyCreator.java,v 1.1 2006/05/06 08:59:33 ckaestne Exp $
 */

package com.sleepycat.je;

/**
 * Javadoc for this public method is generated via
 * the doc templates in the doc_src directory.
 */
public interface SecondaryKeyCreator {

    /**
     * Javadoc for this public method is generated via
     * the doc templates in the doc_src directory.
     */
    public boolean createSecondaryKey(SecondaryDatabase secondary,
				      DatabaseEntry key,
				      DatabaseEntry data,
				      DatabaseEntry result)
	throws DatabaseException;
}
