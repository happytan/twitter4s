package t4s.internal.http

class RequestMethod {
	var _name: String = ""
	def setName(name: String) {
		_name = name
	}
	override def toString = "RequestMethod{name='" + _name + "'}"
	
	override def hashCode = _name.hashCode
	override def equals(other: Any): Boolean = other match {
		case that: RequestMethod => println("this._name:" + this._name + " that._name:" + that._name); this._name == that._name
		case _ => println("bb"); false
	}
}

object RequestMethod {
	
	val GET = RequestMethod("GET")
	val POST = RequestMethod("POST")
	val DELETE = RequestMethod("DELETE")
	val HEAD = RequestMethod("HEAD")
	val PUT = RequestMethod("PUT")
	
	def apply(name: String) = {
		var requestMethod =  new RequestMethod()
		requestMethod.setName(name)
		requestMethod
	}
}
