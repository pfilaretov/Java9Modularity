package com.red30tech.database.api;

public interface Database {
   void create(String key, Object value);

   Object get(String key);

   void update(String key, Object value);

   void delete(String key);
}
