/**
 * Copyright (C) 2013-2015 Stéphane Péchard.
 *
 * This file is part of PhotoBackup.
 *
 * PhotoBackup is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PhotoBackup is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package fr.s13d.photobackup;

import android.app.Application;


public class PBApplication extends Application {

    private final static String LOG_TAG = "PBApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(LOG_TAG, "Initializing app");
    }


    ///////////////
    // Constants //
    ///////////////
    public final static String PB_USER_AGENT = "PhotoBackup Android Client v" + BuildConfig.VERSION_NAME;
    public static final String PB_PICTURES_SHARED_PREFS = "PB_PICTURES_SHARED_PREFS";
    public static final String PB_STOP_SERVICE = "PB_STOP_SERVICE";

}
