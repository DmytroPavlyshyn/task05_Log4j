package com.pavlyshyn;

import java.io.Serializable;
import org.apache.logging.log4j.core.*; 
import org.apache.logging.log4j.core.appender.AbstractAppender; 
import org.apache.logging.log4j.core.config.plugins.*; 
import org.apache.logging.log4j.core.layout.PatternLayout; 
 
// note: class name need not match the @Plugin name. 
@Plugin(name="SMS", category="Core", elementType="appender", printObject=true) 
public final class SmsAppender extends AbstractAppender { 
    protected SmsAppender(String name, Filter filter, 
                                   Layout<? extends Serializable> layout, final boolean ignoreExceptions) { 
        super(name, filter, layout, ignoreExceptions); 
    } 
 
    @Override     //here I send SMS-message 
    public void append(LogEvent event) { 
        try { 
            ExampleSMS.send(new String( getLayout().toByteArray(event))); 
        } catch (Exception ex) {} 
    } 
 
 

 
 
    @PluginFactory 
    public static SmsAppender createAppender( 
            @PluginAttribute("name") String name, 
            @PluginElement("Layout") Layout<? extends Serializable> layout, 
            @PluginElement("Filter") final Filter filter, 
            @PluginAttribute("otherAttribute") String otherAttribute) { 
        if (name == null) { 
            LOGGER.error("No name provided for MyCustomAppenderImpl"); 
            return null; 
        } 
        if (layout == null) { 
            layout = PatternLayout.createDefaultLayout(); 
        } 
        return new SmsAppender(name, filter, layout, true); 
    } 
}