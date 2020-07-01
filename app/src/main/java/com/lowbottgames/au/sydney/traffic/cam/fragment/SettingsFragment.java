package com.lowbottgames.au.sydney.traffic.cam.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

import com.lowbottgames.au.sydney.traffic.cam.BuildConfig;
import com.lowbottgames.au.sydney.traffic.cam.R;

public class SettingsFragment extends PreferenceFragmentCompat {

//    private static final String TAG = SettingsActivity.class.getSimpleName();

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences);

        Context context = getContext();
        if (context != null) {
            PreferenceManager.setDefaultValues(context, R.xml.preferences, false);
        }

        Preference appVersionPreference = findPreference("app_version_preference");
        if (appVersionPreference != null) {
            appVersionPreference.setSummary(BuildConfig.VERSION_NAME);
        }

    }

}
