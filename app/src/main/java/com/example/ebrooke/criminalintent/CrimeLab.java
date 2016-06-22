package com.example.ebrooke.criminalintent;

import android.content.Context;

import java.security.cert.CertPathValidatorResult;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by ebrooke on 6/21/16.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if(sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }
    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id ) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
