
Q1. What is Hibernate?

Hibernate is an Object Relational Mapping (ORM) framework in Java that maps Java classes to database tables automatically. It allows developers to perform database operations using Java objects instead of SQL queries. It reduces boilerplate JDBC code and supports features like caching, lazy loading, and automatic schema generation.

Q2. What is ORM?

ORM stands for Object Relational Mapping. It is a technique that maps objects in Java to relational database tables. It helps in automatically converting data between Java objects and relational data, removing the need for manual SQL code.

Q3. Why use Hibernate instead of JDBC?

Hibernate simplifies database programming by:

Eliminating repetitive SQL code.

Handling transactions automatically.

Supporting multiple databases (portability).

Providing caching for better performance.

Supporting object-oriented query languages like HQL and JPQL.

Q4. What are the main advantages of Hibernate?

No need to write SQL manually.

Database independence.

Built-in transaction management.

Automatic table creation and schema update.

Caching for improved performance.

Supports inheritance, relationships, and lazy loading.

Q5. What are the main components of Hibernate?

SessionFactory – Creates Session objects.

Session – Used for performing CRUD operations.

Transaction – Ensures ACID properties.

Configuration – Used to load configuration settings.

Query – Used for executing HQL or SQL statements.

Q6. What is the architecture of Hibernate?

Hibernate architecture includes components like Configuration, SessionFactory, Session, Transaction, Query, and the database. The flow is:
Configuration → SessionFactory → Session → Transaction → Database.

🧩 SESSION AND OBJECT STATES
Q7. What is a Session in Hibernate?

A Session is a short-lived object representing a connection between the application and the database. It is used for CRUD operations, managing entity states, and executing queries.

Q8. What is SessionFactory?

SessionFactory is a heavyweight, thread-safe object created once per application. It provides Session instances and manages second-level caching.

Q9. What is the difference between Session and SessionFactory?

SessionFactory: One per application, thread-safe, creates sessions.

Session: One per unit of work, not thread-safe, performs CRUD operations.

Q10. What are the different states of a Hibernate object?

Transient – Object not associated with any session.

Persistent – Object associated with a session; changes auto-saved.

Detached – Object was persistent but session is now closed.

Removed – Object is marked for deletion.

Q11. What is Persistent State?

An object becomes persistent when it is associated with an open session. Any modification in it is automatically reflected in the database during transaction commit.

Q12. What is Transient State?

When an object is newly created using new but not yet saved in the database or attached to a session, it is transient.

Q13. What is Detached State?

When a session is closed or cleared but the object still exists in memory, it becomes detached.

🧩 CONFIGURATION AND MAPPING
Q14. What is hibernate.cfg.xml?

It is the main configuration file where we define database connection settings, dialect, driver class, username, password, and mapping files.

Q15. What are annotations used in Hibernate?

Common annotations are:

@Entity – Marks class as entity.

@Table – Defines table name.

@Id – Marks primary key field.

@GeneratedValue – Defines primary key generation strategy.

@Column – Customizes column properties.

@Transient – Excludes a field from persistence.

@Temporal – Used for date/time mapping.

Q16. What is the use of @Entity annotation?

It tells Hibernate that this class should be mapped to a database table.

Q17. What is the use of @Table annotation?

It specifies the name of the database table that the entity maps to.

Q18. What is @Id and @GeneratedValue used for?

@Id marks the primary key of the entity, while @GeneratedValue defines how it will be generated (AUTO, IDENTITY, SEQUENCE, or TABLE).

Q19. What is @Column used for?

It is used to define properties of a column, such as name, length, nullable, and uniqueness.

Q20. What is @Transient?

It marks a field that should not be stored in the database.

🧩 RELATIONSHIP MAPPING
Q21. What is @OneToOne mapping?

It represents a one-to-one relationship between two entities, such as a User having one Profile.

Q22. What is @OneToMany and @ManyToOne?

@OneToMany represents a relationship where one entity is related to multiple others (e.g., one department → many employees).
@ManyToOne is the reverse — many employees belong to one department.

Q23. What is @ManyToMany?

It represents a relationship where multiple entities can be related to many others (e.g., students and courses). It usually uses a @JoinTable to represent the relationship.

Q24. What is @JoinColumn used for?

It specifies the foreign key column that joins two tables.

Q25. What is mappedBy used for?

It is used in bidirectional relationships to tell Hibernate which side owns the relationship.

Q26. What is the difference between unidirectional and bidirectional mapping?

In unidirectional mapping, only one entity knows about the relationship.
In bidirectional mapping, both entities are aware of each other and reference each other using mappedBy.

🧩 CRUD OPERATIONS
Q27. What methods are used for CRUD operations in Hibernate?

save() – Inserts a new record.

persist() – Saves an entity but returns void.

update() – Updates an existing record.

merge() – Merges state of detached entity.

delete() – Deletes an entity.

get() / load() – Fetches entity from DB.

Q28. What is the difference between save() and persist()?

save() returns the generated ID and is Hibernate-specific, while persist() is a JPA standard method and does not return anything.

Q29. What is the difference between get() and load()?

get() immediately hits the database and returns the real object or null if not found.
load() returns a proxy object and hits the database only when a property is accessed (lazy loading).

Q30. What is the difference between update() and merge()?

update() updates a detached object but throws an exception if another instance with the same ID exists in session.
merge() copies the state of a detached object into a persistent object safely.

Q31. Can we use merge() to insert a record?

Yes, if the entity does not exist in the database, merge() will insert it.

🧩 HQL, JPQL, AND SQL
Q32. What is HQL?

HQL (Hibernate Query Language) is an object-oriented query language that uses entity names and properties instead of table names and columns.

Q33. What is JPQL?

JPQL (Java Persistence Query Language) is the JPA standard query language similar to HQL but vendor-independent.

Q34. What is Native SQL in Hibernate?

Native SQL allows developers to execute real SQL queries directly on the database using Hibernate.

Q35. Why use Native SQL when we have Hibernate?

We use it for complex queries, stored procedures, or database-specific operations that are not easily achievable using HQL.

Q36. What is the Criteria API?

Criteria API is used to build dynamic and type-safe queries in an object-oriented way. It avoids writing query strings manually.

Q37. How to compare dates in HQL?

You can compare using operators or between:
from User where joinDate > :date
from User where joinDate between :start and :end

🧩 CACHING AND PERFORMANCE
Q38. What is caching in Hibernate?

Caching stores frequently accessed data in memory to reduce database hits and improve performance.

Q39. What are the types of cache in Hibernate?

First-level cache – Enabled by default at Session level.

Second-level cache – Shared across sessions at SessionFactory level.

Query cache – Caches query results.

Q40. What is first-level cache?

It is automatically enabled and works within a single session. It ensures that the same entity is not fetched multiple times from the database during one session.

Q41. What is second-level cache?

It is an optional cache shared among multiple sessions. It requires a provider such as Ehcache, Infinispan, or OSCache.

🧩 ADVANCED CONCEPTS
Q42. What is lazy loading?

Lazy loading delays fetching related data until it is actually accessed. This improves performance by avoiding unnecessary queries.

Q43. What is eager loading?

Eager loading fetches related entities immediately when the main entity is loaded.

Q44. What is cascading in Hibernate?

Cascade operations automatically propagate actions like persist, remove, or merge from parent to child entities.

Q45. What is orphanRemoval?

When orphanRemoval=true, if a child entity is removed from the parent’s collection, it is automatically deleted from the database.

Q46. What is dirty checking?

Hibernate automatically detects changes made to persistent entities and updates them in the database on transaction commit.

Q47. What is flush and clear in Hibernate?

flush() synchronizes in-memory state with the database.
clear() removes all entities from the session cache.

Q48. What is difference between flush and commit?

flush() writes data to the database but does not end the transaction.
commit() finalizes the transaction.

Q49. What is optimistic locking?

It ensures that no other transaction has modified the same data during an update. Implemented using the @Version annotation.

Q50. What are inheritance strategies in Hibernate?

Single Table Strategy

Joined Strategy

Table per Class Strategy

Q51. What is the difference between openSession() and getCurrentSession()?

openSession() always opens a new Session object every time it’s called. You must close it manually using session.close().

getCurrentSession() returns the current session bound to the context (usually transaction scope). It automatically closes when the transaction ends.

Example:

Session session = sessionFactory.getCurrentSession(); // Auto managed
Transaction tx = session.beginTransaction();
tx.commit(); // session auto-closes


Use getCurrentSession() when you have a transaction-based environment (like Spring or JPA).

Q52. How does Hibernate handle transactions?

Hibernate uses the Transaction interface to manage database transactions.

Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();
session.save(user);
tx.commit();
session.close();


If an error occurs, tx.rollback() is used. Transactions ensure atomic operations — either all succeed or all fail.

Q53. What are the different types of caching in Hibernate?

First-Level Cache – Default, associated with the Session.

Second-Level Cache – Shared cache for SessionFactory (e.g., EhCache, Infinispan).

Query Cache – Stores results of queries.

Example:
First-level cache ensures that if the same entity is fetched twice in one session, Hibernate won’t hit the database again.

Q54. What is the First-Level Cache?

It is the default cache in Hibernate, enabled automatically. It works at the Session level.
Example:

User u1 = session.get(User.class, 1);
User u2 = session.get(User.class, 1); // No DB hit (from cache)


It improves performance by avoiding duplicate queries during one session.

Q55. What is the Second-Level Cache?

It is a shared cache across sessions. It stores entities so that multiple sessions can reuse them. You must enable it in configuration.
Example:

<property name="hibernate.cache.use_second_level_cache">true</property>
<property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.EhCacheRegionFactory</property>


This is especially useful in read-heavy applications.

Q56. What is Query Cache in Hibernate?

The Query Cache stores the results of executed queries. It works with the second-level cache.
To enable it:

Query q = session.createQuery("from User");
q.setCacheable(true);


This avoids executing the same query multiple times.

Q57. How to call stored procedures using Hibernate?

You can use the @NamedStoredProcedureQuery annotation or createStoredProcedureQuery() method.
Example:

StoredProcedureQuery query = session.createStoredProcedureQuery("getUsers", User.class);
query.execute();
List<User> users = query.getResultList();


This helps reuse complex database logic within Hibernate.

Q58. What is Lazy Loading in Hibernate?

Lazy loading means data is loaded only when it is actually needed.
Example:

@OneToMany(mappedBy="department", fetch=FetchType.LAZY)
private List<Employee> employees;


This improves performance by delaying data loading until accessed.

Q59. What is Eager Loading in Hibernate?

Eager loading means related entities are loaded immediately with the parent entity.

@OneToMany(mappedBy="department", fetch=FetchType.EAGER)
private List<Employee> employees;


Use it carefully, as it can cause unnecessary database joins.

Q60. What is the N+1 Select Problem in Hibernate?

It occurs when Hibernate executes one query for the parent entity and then one additional query per child record.
Example:
Fetching all departments causes an additional query for each department’s employees.
To fix this, use fetch joins or batch fetching.

from Department d join fetch d.employees

Q61. What is cascading in Hibernate?

Cascading allows operations performed on a parent to propagate to its child entities.
Example:

@OneToMany(mappedBy="dept", cascade=CascadeType.ALL)
private List<Employee> employees;


If you delete or save the Department, all associated Employees will also be affected.

Q62. What happens if you delete a parent entity having children?

If cascade = CascadeType.REMOVE or CascadeType.ALL is set, then child entities are automatically deleted.
If not, Hibernate throws a ConstraintViolationException because foreign keys still exist.

Q63. What is difference between save() and merge()?

save() – Inserts a new record; cannot update detached objects.

merge() – Copies the state of a detached object into a persistent one.
Use merge() when you need to reattach and update a previously detached object.

Q64. Can we save or update record using merge() method?

Yes ✅
merge() can perform both insert and update depending on whether the entity exists in the database.

Q65. What is difference between get() and load()?

get() – Hits the database immediately; returns null if record not found.

load() – Returns a proxy; throws ObjectNotFoundException if entity not found.

Q66. What is difference between persist() and save()?

save() returns the generated identifier.

persist() does not return anything and follows JPA standards.
Both insert new records, but persist() is preferred in JPA-compliant code.

Q67. What is difference between HQL and Native SQL?

HQL (Hibernate Query Language) – Object-oriented, works with entities and properties.

Native SQL – Real SQL queries written for specific databases.
Use HQL for portability, Native SQL for performance or DB-specific features.

Q68. How to delete all records of a table using Hibernate?

Using HQL:

Query q = session.createQuery("delete from User");
int count = q.executeUpdate();


This executes a bulk delete operation without fetching individual entities.

Q69. How to handle bi-directional relationships properly?

Always define mappedBy on the inverse (child) side to avoid duplicate foreign keys and infinite recursion.
Example:

@OneToMany(mappedBy="department")
private List<Employee> employees;


and in Employee

@ManyToOne
@JoinColumn(name="dept_id")
private Department department;

Q70. Real-world scenario: You have a Department with multiple Employees. How will you delete the department safely?

If cascading is enabled (cascade=CascadeType.ALL), simply call session.delete(department);

If not, first delete all employees, then delete the department.
Example:

for(Employee e : dept.getEmployees()) {
    session.delete(e);
}
session.delete(dept);


This prevents foreign key constraint violations.

