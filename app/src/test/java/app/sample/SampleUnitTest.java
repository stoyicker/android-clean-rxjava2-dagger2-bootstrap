package app.sample;

public final class SampleUnitTest {
    private Queue mDependency;
    private Object mSubject;

    @Before
    public void beforeTest() {
        mDependency = mock(Queue.class);
        mSubject = new Object();
    }

    @Test
    public void testHappyPath() {
        verifyNoMoreInteractions(mDependency, mSubject);
    }
}
