package app;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

/**
 * A test runner to use a different Application class in the instrumentation tests.
 */
public final class AndroidTestApplicationAndroidJUnitRunner extends AndroidJUnitRunner {
    @Override
    public Application newApplication(
            final ClassLoader cl, final String className, final Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, AndroidTestApplication.class.getName(), context);
    }
}
