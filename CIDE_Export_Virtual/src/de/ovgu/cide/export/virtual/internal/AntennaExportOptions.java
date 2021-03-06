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

package de.ovgu.cide.export.virtual.internal;

import java.util.List;
import java.util.Set;

import org.eclipse.jdt.core.dom.CompilationUnit;

import de.ovgu.cide.export.useroptions.IUserOption;
import de.ovgu.cide.features.IFeature;
import de.ovgu.cide.features.source.ColoredSourceFile;

public class AntennaExportOptions implements IPPExportOptions {
	public String getStartInstruction(Set<IFeature> features) {
		String result = "";
		for (IFeature f : features)
			result += "//#ifdef " + getFeatureToken(f) + "\n";
		return result;
	}

	public boolean inNewLine() {
		return true;
	}

	private String getFeatureToken(IFeature f) {
		String featureName = f.getName().toUpperCase();
		StringBuffer result = new StringBuffer();
		for (int idx = 0; idx < featureName.length(); idx++)
			if (Character.isLetter(featureName.charAt(idx)))
				result.append(featureName.charAt(idx));
		return result.toString();
	}

	public String getEndInstruction(Set<IFeature> features) {
		String result = "";
		for (int i = 0; i < features.size(); i++)
			result += "//#endif\n";
		return result;
	}

	public List<IUserOption> getUserOptions() {
		return null;
	}

	public PPPrettyPrinter getPrettyPrinter(ColoredSourceFile sourceFile) {
		return new PPPrettyPrinter(sourceFile.getColorManager(), sourceFile
				.getProject(), this);
	}

	public CompilationUnit refactorAST(CompilationUnit root, ColoredSourceFile source) {
		return root;
	}


}
