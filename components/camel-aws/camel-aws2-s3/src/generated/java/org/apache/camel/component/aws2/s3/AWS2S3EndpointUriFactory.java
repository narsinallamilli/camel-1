/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.s3;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class AWS2S3EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = "://bucketNameOrArn";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(63);
        props.add("customerAlgorithm");
        props.add("fileName");
        props.add("useCustomerKey");
        props.add("streamMode");
        props.add("bucketNameOrArn");
        props.add("customerKeyId");
        props.add("prefix");
        props.add("useAwsKMS");
        props.add("initialDelay");
        props.add("pojoRequest");
        props.add("customerKeyMD5");
        props.add("proxyPort");
        props.add("bridgeErrorHandler");
        props.add("awsKMSKeyId");
        props.add("delimiter");
        props.add("amazonS3Client");
        props.add("greedy");
        props.add("maxMessagesPerPoll");
        props.add("scheduledExecutorService");
        props.add("repeatCount");
        props.add("moveAfterRead");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("proxyHost");
        props.add("backoffIdleThreshold");
        props.add("trustAllCertificates");
        props.add("lazyStartProducer");
        props.add("delay");
        props.add("includeBody");
        props.add("startScheduler");
        props.add("accessKey");
        props.add("deleteAfterWrite");
        props.add("region");
        props.add("exceptionHandler");
        props.add("backoffMultiplier");
        props.add("destinationBucket");
        props.add("amazonS3Presigner");
        props.add("partSize");
        props.add("scheduler");
        props.add("multiPartUpload");
        props.add("storageClass");
        props.add("useFixedDelay");
        props.add("doneFileName");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("policy");
        props.add("maxConnections");
        props.add("timeUnit");
        props.add("autoCreateBucket");
        props.add("destinationBucketSuffix");
        props.add("proxyProtocol");
        props.add("secretKey");
        props.add("uriEndpointOverride");
        props.add("exchangePattern");
        props.add("keyName");
        props.add("includeFolders");
        props.add("useDefaultCredentialsProvider");
        props.add("destinationBucketPrefix");
        props.add("autocloseBody");
        props.add("pollStrategy");
        props.add("overrideEndpoint");
        props.add("deleteAfterRead");
        props.add("operation");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("secretKey");
        secretProps.add("accessKey");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "aws2-s3".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "bucketNameOrArn", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

