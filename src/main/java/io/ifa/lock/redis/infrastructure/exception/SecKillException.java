package io.ifa.lock.redis.infrastructure.exception;


public class SecKillException extends RuntimeException{

    private Integer code;

    public SecKillException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
