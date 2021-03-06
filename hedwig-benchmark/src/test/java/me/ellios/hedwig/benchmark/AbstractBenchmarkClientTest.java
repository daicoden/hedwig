package me.ellios.hedwig.benchmark;

import me.ellios.hedwig.benchmark.thrift.client.OioThriftBenchmarkClient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Say something?
 * User: George
 * Date: 13-3-5
 * Time: 上午11:47
 */

public class AbstractBenchmarkClientTest {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractBenchmarkClientTest.class);

    @Test
    public void testOut() throws Exception {
        OioThriftBenchmarkClient client = new OioThriftBenchmarkClient("",2);
        client.out(0,0,32,23,32);
        client.out(0,200,32,23,32);
        client.out(200,1000,0,2000003,3000002);
        client.out(1000,5000,100, 0,32);
    }
}
