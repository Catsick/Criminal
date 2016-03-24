  package com.example.bonnie.crimeactivity;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.UUID;

  public class CrimeActivity extends SingleFragmentActivity {
      {

          public static final String EXTRA_CRIME_ID =
                  "com.bignerdranch.android.criminalintent.crime_id";

      public static Intent newIntent(Context packageContext, UUID crimeId) {
          Intent intent = new Intent(packageContext, CrimeActivity.class);
          intent.putExtra(EXTRA_CRIME_ID, crimeId);
          return intent;
      }
      @Override
      protected Fragment createFragment() {
          UUID crimeId = (UUID) getIntent()
                  .getSerializableExtra(EXTRA_CRIME_ID);
          UUID crimeId = (UUID) getArguments().getSerializable(ARG_CRIME_ID);
      }
  }