package app;

import android.view.View;

/**
 * An application that can contain test-specific code, like mock injection.
 */
public final class AndroidTestApplication extends MainApplication {
    /**
     * Use this to pass a stub home component should you want one in your test.
     */
    public OneArgProducer<View, HomeComponent> mStubHomeComponentProducer;

    /**
     * Gives back the component provided, if any, or otherwise the default implementation.
     * @param activityRootView The root view of the activity this component injects.
     * @return A component that can be used to perform injection.
     */
    @Override
    public HomeComponent buildHomeComponent(final View activityRootView) {
        final HomeComponent ret;
        if (mStubHomeComponentProducer != null) {
            ret = mStubHomeComponentProducer.produce(activityRootView);
        } else {
            ret = super.buildHomeComponent(activityRootView);
        }
        return ret;
    }
}
