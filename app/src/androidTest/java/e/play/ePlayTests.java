package e.play;

import android.content.Context;
import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on two Android devices.
 *
 * 
 */
@RunWith(AndroidJUnit4.class)
public class ePlayTests {

    private static final String LOG_TAG = "e.foundation";

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("e.play", appContext.getPackageName());
    }

    @Test
    public void googlePlaySuccess() {

        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(appContext);
        if (resultCode == ConnectionResult.SUCCESS) Log.d(LOG_TAG, "'Google'device");
        assertEquals(0, ConnectionResult.SUCCESS);
        assertEquals(resultCode, ConnectionResult.SUCCESS);

    }

}
