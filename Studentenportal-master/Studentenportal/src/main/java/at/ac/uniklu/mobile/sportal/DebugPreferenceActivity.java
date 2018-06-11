/*
 * Copyright (c) 2014 Mario Guggenberger <mario.guggenberger@aau.at>
 *
 * This file is part of AAU Studentenportal.
 *
 * AAU Studentenportal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AAU Studentenportal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AAU Studentenportal.  If not, see <http://www.gnu.org/licenses/>.
 */

package at.ac.uniklu.mobile.sportal;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import at.ac.uniklu.mobile.sportal.util.Analytics;

public class DebugPreferenceActivity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.debug_preferences);
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Analytics.onActivityStart(this, Analytics.ACTIVITY_DEBUG_PREFERENCES);
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Analytics.onActivityStop(this);
	}
}
