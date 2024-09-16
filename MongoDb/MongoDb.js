/*
    It is a non relational database. we store data in the momery in the form of key value pairs as we do in json objects
    basically data will be stored in the form of json objects.
    MongoDb will be little bit faster than SQL in some cases where we only focus on fetching data on some conditions. 
    Non Relational databases are slightly cheaper than relational databases.
    Thease are easily scalable horizontally. 

    examples : cassendra, dynamo db and mongodb.

    commands: 

    create database : we won't create databases in mongoDB we will write command "use DB_NAME", if DB exists
    it will use the same db which existed before or else it will create a db with the provided name 
    and insert data with in that db.

    Show collections: Collections are nothing but data containers with in the database, It is similar to tables
    in SQL databases.
    Here every collection is a json Object.

        Here the command is "show collections"
    
    Create Collections: Here in mongoDB schema of the collection is dynamic, so we will just pass the name 
    of the collection.

        command db.createCollection("collectionName"); 

    Insert Data : 
        command is db.collectionName.insertOne( Object ) this will insert one object with in that collection

        db.collectionName.insertMany(Array[Objects]) this will insert multiple objects which are given with in that
        collection

    Fetch records: 
        command which is used to fetch records from the collection is  "db.collectionName.find()"
        ->here the parameter of find function is an object which is the filter for the records if u dont pass the fiter  it will
        fetch all the records.

    updata records:
        command which is used to update the record is an filter is "db.collectionName.updateOne({where we want to update},{$set:{what we want to update}})";
        and for more records to be updated the command is
         ->"db.collectionName.updateMany({where u update},{$set:{what u update})";

    delete records:
        command which is used to delete the record is and filter is "db.collectionName.delete({});
    
    ->in filters there are more operations can be performed such as
        $eq: Values are equal
        $ne: Values are not equal
        $gt: Value is greater than another value
        $gte: Value is greater than or equal to another value
        $lt: Value is less than another value
        $lte: Value is less than or equal to another value
        $in: Value is matched within an array
        $and: Returns documents where both queries match
        $or: Returns documents where either query matches
        $nor: Returns documents where both queries fail to match
        $not: Returns documents where the query does not match
            
    Mangoose: is a mangodb framwork which is allowing us to give data restrictions.

    
*/

const x = {
    "key1" : 1,
    "key2" : "Jayaram",
    "key3" : [1,2,3,4,5,6],
    "key4" : {
        "inkey41": 1,
        "inkey42": 2
    }
}
console.log("I am x")
console.log(x.key4.inkey42)