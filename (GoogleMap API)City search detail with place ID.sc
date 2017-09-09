val url = "https://maps.googleapis.com/maps/api/place/details/json?placeid=ChIJ45QmUDl0ITkRcLzL7da64VU&key=AIzaSyCusQdKq6XQTPGUwXOTwXuDHhOnzDpODSo"
val result = scala.io.Source.fromURL(url).mkString
println(result)
