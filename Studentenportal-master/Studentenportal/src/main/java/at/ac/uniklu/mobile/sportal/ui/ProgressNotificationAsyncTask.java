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

package at.ac.uniklu.mobile.sportal.ui;

public abstract class ProgressNotificationAsyncTask extends AsyncTask implements ProgressNotificationToggle {
	
	protected ProgressNotificationToggle mToggle;
	
	public ProgressNotificationAsyncTask(ProgressNotificationToggle toggle) {
		mToggle = toggle;
	}

	@Override
	void onExecuteInternal() {
		progressNotificationOn();
		super.onExecuteInternal();
	}
	
	@Override
	void onExecutionFinishedInternal() {
		super.onExecutionFinishedInternal();
		progressNotificationOff();
	}
	
	@Override
	public void progressNotificationOn() {
		if(mToggle != null) mToggle.progressNotificationOn();
	}
	@Override
	public void progressNotificationOff() {
		if(mToggle != null) mToggle.progressNotificationOff();
	}
}
