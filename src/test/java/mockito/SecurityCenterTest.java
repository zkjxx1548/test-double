package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class SecurityCenterTest {
    private SecurityCenter securityCenter;
    private DoorPanel doorPanel;

    @BeforeEach
    void setUp() {
        doorPanel = mock(DoorPanel.class);
        securityCenter = new SecurityCenter(doorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(doorPanel, times(1)).close();
    }
}
