## Problems with lazy initialization approach

- Not thread safe
- suppose two calls to getInstance() are made at virtually the same time
- it can create two instance at the same time

