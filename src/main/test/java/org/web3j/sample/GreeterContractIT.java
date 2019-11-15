package org.web3j.sample;

import org.junit.Test;

/**
 * Integration test to run our main application.
 */
public class GreeterContractIT {
    public static final String token = "60511bc11111f111c11f11d11111ae1111d1e11b";
    public static final String preprodToken ="2770a8bc696fc8408e7d7c331f318b916b330654";
    
    @Test
    public void testGreeterContract() throws Exception {
        Application.main(new String[]{ });
    }
}
