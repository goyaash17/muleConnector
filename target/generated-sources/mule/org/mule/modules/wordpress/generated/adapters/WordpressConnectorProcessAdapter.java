
package org.mule.modules.wordpress.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.wordpress.WordpressConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>WordpressConnectorProcessAdapter</code> is a wrapper around {@link WordpressConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-16T08:11:18-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class WordpressConnectorProcessAdapter
    extends WordpressConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<WordpressConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, WordpressConnectorCapabilitiesAdapter> getProcessTemplate() {
        final WordpressConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,WordpressConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, WordpressConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, WordpressConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
