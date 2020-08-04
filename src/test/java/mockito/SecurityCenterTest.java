package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class SecurityCenterTest {
    private SecurityCenter securityCenter;

    @BeforeEach
    void setUp() {
        DoorPanel doorPanel = mock(DoorPanel.class);
        securityCenter = new SecurityCenter(doorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        Assertions.assertTrue(mockDoorPanel.verifyMockDoorPanelIsCalled());
    }
}
