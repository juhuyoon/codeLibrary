#Command Line Prompts for quick and easy mongoDB access  
Main Documentation and additional formats: https://docs.mongodb.com/manual/reference/mongo-shell/  
More References: https://docs.mongodb.com/manual/reference/command/

### Basic Prompts
First run 'mongod' on your command line to initialize your database.
Then run mongo on a separate command line to navigate through the databases stored in your computer. 

```
mongo
```

To show databases:

```
show dbs
```

To select a database to use:

```
use <dbname>
```

To authenticate and logout to access the database if set:

```
// Authenticate
db.auth("username", "password");

//Logout
db.logout()

To see the collections within the database:

```
show collections
db.getCollectionNames();
```

Or creating a collection in the database:

```
db.createCollection("<dbname>")
```

Inputting information/document within the collection format:

```
// Insert single document

db.<collectionName>.insert({field1: "value", field2: "value"})

// Insert multiple documents

db.<collectionName>.insert([{field1: "value1"}, {field1: "value2"}])
db.<collectionName>.insertMany([{field1: "value1"}, {field1: "value2"}])
```


Saving or updating an existing document or inserting a new one:
Note: the _id must match. If not, the document is 

```
db.<collectionName>.save({"_id": new ObjectId("jhgsdjhgdsf"), field1: "value", field2: "value"});
```

Deleting documents from the collection:

```
To delete one:
db.<collectionName>.deleteOne()

To delete multiple documents:
db.<collectionName>.deleteMany()

To completely remove the collection
db.collection.drop()





Display Collection Records in the database:

```
db.<collectionName>.find();
// to show in JSON format
db.<collectionName>.find().pretty();

// Retrieve limited number of records; Following command will print 10 results;

db.<collectionName>.find().limit(10);

// Retrieve records by id

db.<collectionName>.find({"_id": ObjectId("someid")});

// Retrieve values of specific collection attributes by passing an object having 
// attribute names assigned to 1 or 0 based on whether that attribute value needs 
// to be included in the output or not, respectively.

db.<collectionName>.find({"_id": ObjectId("someid")}, {field1: 1, field2: 1});
db.<collectionName>.find({"_id": ObjectId("someid")}, {field1: 0}); // Exclude field1

// Collection count

db.<collectionName>.count();

