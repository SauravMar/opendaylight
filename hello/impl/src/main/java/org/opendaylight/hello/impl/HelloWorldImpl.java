package org.opendaylight.hello.impl;

import com.google.common.util.concurrent.ListenableFuture;
import org.opendaylight.yang.gen.v1.urn.Opendaylight.params.xml.ns.yang.hello.rev191119.HelloService;
import org.opendaylight.yang.gen.v1.urn.Opendaylight.params.xml.ns.yang.hello.rev191119.HelloWorldInput;
import org.opendaylight.yang.gen.v1.urn.Opendaylight.params.xml.ns.yang.hello.rev191119.HelloWorldOutput;
import org.opendaylight.yang.gen.v1.urn.Opendaylight.params.xml.ns.yang.hello.rev191119.HelloWorldOutputBuilder;

import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;

public class HelloWorldImpl implements HelloService {

    @Override
    public ListenableFuture<RpcResult<HelloWorldOutput>> helloWorld(HelloWorldInput input) {
        HelloWorldOutputBuilder helloBuilder = new HelloWorldOutputBuilder();
        helloBuilder.setGreeting("Hello " + input.getName());

        return RpcResultBuilder.success(helloBuilder.build()).buildFuture();
    }
}
