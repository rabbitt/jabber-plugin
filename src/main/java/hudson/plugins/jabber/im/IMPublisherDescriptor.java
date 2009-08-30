package hudson.plugins.jabber.im;

public interface IMPublisherDescriptor {
    boolean isExposePresence();
    
    String getHost();
    
    /**
     * Returns the hostname. May be null in which case the host must be determined from the
     * Jabber 'service name'.
     * 
     * @deprecated Should be replaced by getHost
     */
    @Deprecated
    String getHostname();
    
    int getPort();
    
    String getUserName();
    
    String getPassword();
    
    String getCommandPrefix();
    
}