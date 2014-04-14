package com.ibm.ws.fat.scala.sample;

import com.ibm.ws.samples.framework.AbstractSampleTest;
import componenttest.topology.impl.LibertyServer;
import componenttest.topology.utils.HttpUtils;

/**
 * Verifies that the application from the Scala sample behaves correctly
 */
public class ScalaSampleTest extends AbstractSampleTest {

    @Override
    protected String getSampleName() {
        return "ScalaSample";
    }

    @Override
    protected void runTestAgainstServer(LibertyServer server) throws Exception {
        HttpUtils.findStringInUrl(server, "/HelloScalaWeb/HelloScalaServlet", "Hello from HelloScalaServlet"); // test the response contains the last phone number
    }

}
