#ATLANTA POPULATION
QUESTIONS

1. use db.zipcodes.find() to filter results to only the results where city is ATLANTA
and state is GA.
2. use db.zipcodes.aggregate with $match to do the same as above.
3. use $group to count the number of zip codes in Atlanta.
4. use $group to find the total population in Atlanta.

ANSWERS

1)db.zipcodes.find({},{city:"ATLANTA",state:"GA"})
2)db.zipcodes.find({$match:{city:"ATLANTA",state:"GA"}})
3)db.zipcodes.aggregate({$group:{_id:"$city"}},{$count:"ATLANTA"})
4)db.zipcodes.aggregate({$match:{city:"ATLANTA"}},{$group:{_id:"$pop",total:{$sum:"$pop"}}})

#POPULATION BY STATE
QUESTIONS

1. use aggregate to calculate the total population for each state
2. sort the results by population, highest first
3. limit the results to just the first 3 results. What are the top 3 states in 
population?

ANSWERS

1)db.zipcodes.aggregate({$group:{_id:{state:"$state",total:{$sum:"$pop"}}}})
2)db.zipcodes.aggregate([{$group:{_id:"$state", TotPopulation:{$sum:"$pop"}}}, {$sort:{TotPopulation:-1}}])
3)db.zipcodes.aggregate([{$group:{_id:"$state", TotPopulation:{$sum:"$pop"}}}, {$sort:{TotPopulation:-1}},{$limit:3}])
  THE TOP THREE STATES ARE-IL,NY,NY

#POPULATION BY CITY

QUESTIONS

1. use aggregate to calculate the total population for each city (you have to use
city/state combination). You can use a combination for the _id of the $group: {
city: '$city', state: '$state' }
2. sort the results by population, highest first
3. limit the results to just the first 3 results. What are the top 3 cities in
population?
4. What are the top 3 cities in population in Texas?

ANSWERS

1)db.zipcodes.aggregate({$group:{_id:{city:"$city",state:"$state",Total:{$sum:"$pop"}}}})
2)db.zipcodes.aggregate([{$group:{_id:"$city",Total:{$sum:"$pop"}}},{$sort:{Total:-1}}])
3)db.zipcodes.aggregate([{$group:{_id:"$city",Total:{$sum:"$pop"}}},{$sort:{Total:-1}},{$limit:3}])
4)Top three cities are: CHICAGO, BROOKLYN, HOUSTON

#bonus

QUESTIONS

1. Write a query to get the average city population for each state.
2. What are the top 3 states in terms of average city population

ANSWERS

1)db.zipcodes.aggregate({$group:{_id:{state:"$state",avg:{$avg:"$pop"}}}})
2)db.zipcodes.aggregate({$group:{_id:{state:"state",avg:{$avg:"$pop"}}}},{$sort:{$pop:-1}})
