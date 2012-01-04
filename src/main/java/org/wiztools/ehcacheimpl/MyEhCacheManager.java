package org.wiztools.ehcacheimpl;

import org.wiztools.cachelib.Cache;
import org.wiztools.cachelib.CacheManager;

/**
 *
 * @author subwiz
 */
public class MyEhCacheManager implements CacheManager {
    
    private net.sf.ehcache.CacheManager ehCacheCacheManager =
            new net.sf.ehcache.CacheManager();

    public Cache getCache(String name) {
        net.sf.ehcache.Cache c = ehCacheCacheManager.getCache(name);
        return new MyEhCacheCache(c);
    }
    
}
