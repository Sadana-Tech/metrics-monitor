package com.sadana.tech.aspect;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationHandler;

public class PerformanceTrackerHandler implements ObservationHandler<Observation.Context> {

	@Override
	public boolean supportsContext(Observation.Context context) {
		return true;
	}

}
