package com.syfri.digitalplan.service.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Redis服务
 * by li.xue 2018/05/03
 */
@Service
public class RedisService {

	@Autowired
	private RedisTemplate redisTemplate;

	/*写入缓存.*/
	public boolean set(final String key, Object value){
		boolean result = false;
		try{
			ValueOperations<Serializable,Object> operations = redisTemplate.opsForValue();
			operations.set(key, value);
			result = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}

	/*写入缓存失效时间.*/
	public boolean set(final String key, Object value, Long expireTime) {
		boolean result = false;
		try {
			ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
			operations.set(key, value);
			redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/*读取缓存.*/
	public Object get(final String key){
		ValueOperations<Serializable,Object> operations = redisTemplate.opsForValue();
		Object result = operations.get(key);
		return result;
	}

	/*判断缓存中是否存在.*/
	public boolean exists(final String key){
		return redisTemplate.hasKey(key);
	}

	/*通过key删除value.*/
	public void remove(final String key) {
		if (exists(key)) {
			redisTemplate.delete(key);
		}
	}

	/*批量删除key.*/
	public void removePattern(final String pattern) {
		Set<Serializable> keys = redisTemplate.keys(pattern);
		if (keys.size() > 0)
			redisTemplate.delete(keys);
	}
}
