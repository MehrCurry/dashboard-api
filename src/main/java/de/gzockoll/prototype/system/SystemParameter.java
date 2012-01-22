package de.gzockoll.prototype.system;

import java.beans.PropertyChangeListener;

public interface SystemParameter {
	String getName();

	String getUnit();

	double getMaxValue();

	void addPropertyChangeListener(PropertyChangeListener l);

	void removePropertyChangeListener(PropertyChangeListener l);
}
