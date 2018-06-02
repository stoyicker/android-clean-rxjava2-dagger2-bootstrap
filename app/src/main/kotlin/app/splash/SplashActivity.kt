package app.splash

import android.os.Bundle
import android.os.Handler

/**
 * A simple activity that acts as a splash screen.
 *
 * Note how, instead of using the content view to set the splash, we just set the splash as
 * background in the theme. This allows it to be shown without having to wait for the content view
 * to be drawn.
 */
internal class SplashActivity : LoggedInCheckCoordinator.ResultCallback, AppCompatActivity() {
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        scheduleContentOpening()
    }

    override fun onPause() {
        handler.removeCallbacksAndMessages(null)
        super.onPause()
    }

    /**
     * Schedules the app content to be shown.
     */
    private fun scheduleContentOpening() {
        handler = Handler()
        handler.postDelayed({
            // TODO Start your app here
            println("App started")
        }, SHOW_TIME_MILLIS)
    }

    private companion object {
        const val SHOW_TIME_MILLIS = 500L
    }
}
