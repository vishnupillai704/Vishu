#QUERY/FIND DOCUMENTS

1)db.movies.find()
2)db.movies.find({writer:"Quentin tarantino"})
3)db.movies.find({actors:"Brad Pitt"})
4)db.movies.find({franchise:"The Hobbit"})
5)db.movies.find({year:{$lt:2000}})
6)db.movies.find({year:{$gt:2010}})

#UPDATE DOCUMENTS

1)db.movies.update({title:"The Hobbit:An Unexpected Journey"},{$set:{synopsis:"A reluctant hobbit, 
Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of 
dwarves to reclaim their mountain home - and the gold within it - from the 
dragon Smaug."}})

2)db.movies.update({year:2013},{$set:{synopsis:"The dwarves, 
along with Bilbo Baggins and Gandalf the Grey, continue their quest to reclaim 
Erebor, their homeland, from Smaug. Bilbo Baggins is in possession of a 
mysterious and magical ring."}})

3)db.movies.update({title:Pulp Fiction},{$Set:{actors:["Sameul L. Jackson","John Travolta","Uma thurman"]}})

#TEXT SEARCH

1)db.movies.createIndex({synopsis:"text"})
  db.movies.find({$text:{$search:"bilbo"}})

2)db.movies.find({$text:{$search:"Gandalf"}})

3)db.movies.find({$text:{$search:"bilbo -Gandalf"}})

4)db.movies.find({$text:{$search:"dwarves or hobbit"}})

5)db.movies.find({$text:{$search:"gold and dragon"}})

#DELETE DOCUMENTS

1)db.movies.remove({title:"Pee Wee Herman's Big Adventure"})

2)db.movies.remove({title:"Avatar"})

#QUERYING RELATED COLLECTIONS

1)db.users.find()

2)db.posts.find()

3)db.posts.find({username:"GoodGuyGreg"})

4)db.posts.find({username:"ScumbagSteve"})

5)db.comments.find()

6)db.comments.find({username:"GoodGuyGreg"})

7)db.comments.find({username:"ScumbagSteve"})

8)db.comments.createIndex({post:"text})
  db.comments.find({$text:{$search:"Reports a bug in your code"}})
