var map = sc.textFile("/opt/spark/bin/sample.txt").flatMap(line => line.split(" ")).map(word => (word,1));
var counts = map.reduceByKey(_ + _);
counts.saveAsTextFile("/opt/spark/bin/WD_fri")


val readFile = sc.textFile("./sparksdata.txt");
val splitdata = readFile.flatMap(line => line.split(" "));
val mapdata = splitdata.map(word => (word,1));
val reducedata = mapdata.reduceByKey(_+_);
reducedata.collect;