package pkg.exoad.poprock.desktop.ui.java;

import javax.swing.JComponent;
import javax.swing.JLabel;

import pkg.exoad.poprock.core.debug.DebuggableMixin;
import pkg.exoad.poprock.core.Color;

@DefsEqual(
	target="Label_Type", reference={JLabel.class,JComponent.class}
) public class UXLabel
	extends
	JLabel
	implements
	DebuggableMixin
{
	public UXLabel(String rootedContent)
	{
		super(rootedContent);
	}
	
	public void setFgColor(Color colorObj)
	{
		setForeground(
			colorObj
				.asAwt()
		);
	}
}
