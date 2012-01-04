package org.wiztools.ehcacheimpl;

import net.sf.ehcache.Element;
import org.wiztools.cachelib.Cache;

/**
 *
 * @author subwiz
 */
public class MyEhCacheCache implements Cache {

    private final net.sf.ehcache.Cache ehCacheCache;
    
    public MyEhCacheCache(net.sf.ehcache.Cache ehCacheCache) {
        this.ehCacheCache = ehCacheCache;
    }

    public void put(Object key, Object value) {
        ehCacheCache.put(new Element(key, value));
    }

    public Object get(Object key) {
        return ehCacheCache.get(key).getValue();
    }

    public void remove(Object key) {
        ehCacheCache.remove(key);
    }

    public void clear() {
        ehCacheCache.removeAll();
    }
    
}
