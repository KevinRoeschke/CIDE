/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package de.ovgu.cide.utils;

import cide.gast.ASTVisitor;
import cide.gast.IASTNode;

/**
 * For a give range finds the node covered and the node covering.
 */
public class NodeFinder extends ASTVisitor {

	/**
	 * A visitor that maps a selection to a given IASTNode. The result node is
	 * determined as follows:
	 * <ul>
	 * <li>first the visitor tries to find a node with the exact start and
	 * length</li>
	 * <li>if no such node exists than the node that encloses the range defined
	 * by start and end is returned.</li>
	 * <li>if the length is zero than also nodes are considered where the
	 * node's start or end position matches <code>start</code>.</li>
	 * <li>otherwise <code>null</code> is returned.</li>
	 * </ul>
	 */
	public static IASTNode perform(IASTNode root, int start, int length) {
		NodeFinder finder = new NodeFinder(start, length);
		root.accept(finder);
		IASTNode result = finder.getCoveredNode();
		if (result == null || result.getStartPosition() != start
				|| result.getLength() != length) {
			return finder.getCoveringNode();
		}
		return result;
	}

	private int fStart;

	private int fEnd;

	private IASTNode fCoveringNode;

	private IASTNode fCoveredNode;

	public NodeFinder(int offset, int length) {
		fStart = offset;
		fEnd = offset + length;
	}

	public boolean visit(IASTNode node) {
		int nodeStart = node.getStartPosition();
		int nodeEnd = nodeStart + node.getLength();
		if (nodeEnd < fStart || fEnd < nodeStart) {
			return false;
		}
		if (nodeStart <= fStart && fEnd <= nodeEnd) {
			fCoveringNode = node;
		}
		if (fStart <= nodeStart && nodeEnd <= fEnd) {
			if (fCoveringNode == node) { // nodeStart == fStart && nodeEnd ==
				// fEnd
				fCoveredNode = node;
				return true; // look further for node with same length as
				// parent
			} else if (fCoveredNode == null) { // no better found
				fCoveredNode = node;
			}
			return false;
		}
		return true;
	}

	/**
	 * Returns the covered node. If more than one nodes are covered by the
	 * selection, the returned node is first covered node found in a top-down
	 * traversal of the AST
	 * 
	 * @return IASTNode
	 */
	public IASTNode getCoveredNode() {
		return fCoveredNode;
	}

	/**
	 * Returns the covering node. If more than one nodes are covering the
	 * selection, the returned node is last covering node found in a top-down
	 * traversal of the AST
	 * 
	 * @return IASTNode
	 */
	public IASTNode getCoveringNode() {
		return fCoveringNode;
	}

}
