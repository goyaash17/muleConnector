
package org.mule.modules.wordpress.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.wordpress.WordpressConnector;


/**
 * A <code>WordpressConnectorCapabilitiesAdapter</code> is a wrapper around {@link WordpressConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-16T08:11:18-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class WordpressConnectorCapabilitiesAdapter
    extends WordpressConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
