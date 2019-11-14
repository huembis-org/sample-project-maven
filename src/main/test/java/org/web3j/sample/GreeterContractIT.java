package org.web3j.sample;

import org.junit.Test;

/**
 * Integration test to run our main application.
 */
public class GreeterContractIT {
    public static final String token = "60511bc11111f111c11f11d11111ae1111d1e11b";
    @Test
    public void testGreeterContract() throws Exception {
        Application.main(new String[]{ });
    }
}
