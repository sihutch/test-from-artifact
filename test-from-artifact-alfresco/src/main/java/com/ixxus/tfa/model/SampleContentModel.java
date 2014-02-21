package com.ixxus.tfa.model;

import org.alfresco.service.namespace.QName;

/**
 * 
 * TODO: Change the name to something other than SampleContentModel
 *
 */
public class SampleContentModel {
    public final static String NAMESPACE_URI = "http://www.ixxus.co.uk/model/test-from-artifact/1.0";
    public final static String NAMESPACE_PREFIX = "tfa";

    public static final class SampleAspect {
        public static final QName ASPECT = tfa("sampleAspect");

        private SampleAspect() {
        }

        public static final class Prop {
            private Prop() {
            }
            
            public static final QName SAMPLE_ASPECT_PROPERTY = tfa("sampleAspectProperty");
        }
    }

    public static final class SampleType {
    	public static final QName TYPE = tfa("sampleType");

    	private SampleType() {
    	}

    	public static final class Prop {
            private Prop() {
            }
            
            public static final QName SAMPLE_TYPE_PROPERTY = tfa("sampleTypeProperty");
        }
    }
    
    public static QName tfa(final String qname) {
        return QName.createQName(NAMESPACE_URI, qname);
    }
}