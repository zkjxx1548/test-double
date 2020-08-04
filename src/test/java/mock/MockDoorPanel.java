package mock;

public class MockDoorPanel extends DoorPanel{
    private boolean isCalled = false;

    @Override
    public void close() {
        isCalled = true;
        super.close();
    }

    boolean verifyMockDoorPanelIsCalled() {
        return isCalled;
    }
}
