/**
    Copyright 2010 Christian K�stner

    This file is part of CIDE.

    CIDE is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.

    CIDE is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with CIDE.  If not, see <http://www.gnu.org/licenses/>.

    See http://www.fosd.de/cide/ for further information.
*/

package de.ovgu.cide.typing.jdt.checks;

import cide.gast.IASTNode;
import de.ovgu.cide.features.source.ColoredSourceFile;
import de.ovgu.cide.typing.jdt.JDTTypingProvider;
import de.ovgu.cide.typing.model.IEvaluationStrategy;

/**
 * checks colors between a local type reference in a file and the import
 * declaration
 * 
 * @author ckaestne
 * 
 */
public class TypeImportedCheck extends AbstractJDTTypingCheck {

	private final IASTNode targetImportDeclaration;
	private final String name;

	public TypeImportedCheck(ColoredSourceFile file,
			JDTTypingProvider typingProvider, IASTNode source,
			IASTNode targetImportDeclaration, String name) {
		super(file, typingProvider, source);
		this.targetImportDeclaration = targetImportDeclaration;
		this.name = name;
	}

	public boolean evaluate(IEvaluationStrategy strategy) {
		return strategy.implies(file.getFeatureModel(), file.getColorManager()
				.getColors(source), file.getColorManager().getColors(
				targetImportDeclaration));
	}

	public String getErrorMessage() {
		return "Type used for which the import declaration is not present in some variants: "
				+ name;
	}

	public String getProblemType() {
		return "de.ovgu.cide.typing.jdt.importtypereference";
	}

}
