package io.ifa.lock.redis.domain;

/**
 * Created by shmily
 */
public interface SecKillService {

    String querySecKillProductInfo(String productInfo);

    void orderProductMockDiffUser(String productId);
}
