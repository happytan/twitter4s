package t4s.internal.http

class RequestMethod private(private val _name: String) {
	
	def name() = _name
	
	override def hashCode = _name.hashCode
	override def equals(other: Any): Boolean = other match {
		case that: RequestMethod => (that canEqual this) && this._name == that._name
		case _ =>  false
	}
	def canEqual(other: Any): Boolean = other match {
		case othe: RequestMethod => true
		case _ => false
	}
        override def toString = "RequestMethod{name='" + _name + "'}"
}

object RequestMethod {
	
	val GET = RequestMethod("GET")
	val POST = RequestMethod("POST")
	val DELETE = RequestMethod("DELETE")
	val HEAD = RequestMethod("HEAD")
	val PUT = RequestMethod("PUT")
	
	def apply(name: String) = {
		var requestMethod =  new RequestMethod(name)
		requestMethod
	}
}
