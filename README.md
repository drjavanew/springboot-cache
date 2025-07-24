
#  🚀 Spring Boot Cache Demo
This project demonstrates how to implement caching in a Spring Boot application using **Ehcache** and **JSR-107 (JCache)**. It’s designed to help developers reduce database load, improve performance, and manage cache configurations with ease.
## 🧰 Features

- ✅ Custom cache configuration using `EhcacheCachingProvider`
- 🔧 Externalized settings via `application.properties`
- ⏱️ Fine-grained control over heap/offheap memory and expiration policies
- 🧪 Easy integration with Spring’s `@Cacheable` annotations

## 📦 Technologies

- Java 17+
- Spring Boot
- Ehcache 3.x
- JCache (JSR-107)
- Maven

## ⚙️ Configuration
All cache settings are externalized in `application.properties`:

```properties
cache.name=posts
cache.heap.size=50
cache.offheap.size=10
cache.offheap.unit=MB
cache.expiry.ttl.minutes=1
cache.expiry.idle.minutes=5
```

## 🛠️ How It Works

The cache is configured in `CacheConfig.java`:

- **Heap and Offheap Memory**: Controls how much data is stored in fast-access memory.
- **Expiry Policy**: Defines how long data lives in the cache
    - *Time to Live (TTL)*: Maximum lifespan of cached data
    - *Time to Idle (TTI)*: Duration data stays alive without access
- **JCache Integration**: Uses `JCacheCacheManager` to plug into Spring’s caching system.

Spring annotations like `@Cacheable` can be used in your services to cache method results.


## 🏁 Getting Started
Clone the repo and run the app:
```bash
git clone https://github.com/drjavanew/springboot-cache.git
cd springboot-cache
./mvnw spring-boot:run 
```

## 📈 Monitoring
You can monitor cache performance using:
- Spring Boot Actuator + Micrometer
- JMX (Java Management Extensions)
- Custom logging or profiling tools
  Track metrics like hit/miss rates, eviction counts, and memory usage.