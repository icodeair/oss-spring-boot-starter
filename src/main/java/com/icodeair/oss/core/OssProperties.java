package com.icodeair.oss.core;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "oss")
public class OssProperties {
    /**
     * 对象存储服务的URL
     */
    private String endpoint;

    /**
     * 区域
     */
    private String region;

    /**
     * truepath-stylenginx反向代理和S3默认支持pathStyle模式{http://endpoint/bucketname}
     * falsesupportsvirtual-hosted-style阿里云等需要配置为virtual-hosted-style模式{http://bucketname.endpoint}
     * 只是url的显示不一样
     */
    private Boolean pathStyleAccess = true;

    /**
     * Accesskey
     */
    private String accessKey;

    /**
     * Secretkey
     */
    private String secretKey;

    /**
     * 最大线程数，默认：100
     */
    private Integer maxConnections = 100;
}
