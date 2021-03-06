package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;

public interface IActivityLifeManager extends IService {
    boolean isForeground();

    void register(C13220c cVar);

    void unregister(C13220c cVar);
}
