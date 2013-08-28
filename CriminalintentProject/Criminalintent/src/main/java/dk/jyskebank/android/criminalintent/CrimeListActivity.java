package dk.jyskebank.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jb3579 on 28/08/13.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
