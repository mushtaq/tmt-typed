package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DhKeyAlgorithm extends KeyAlgorithm {
  
  var generator: js.typedarray.Uint8Array
  
  var prime: js.typedarray.Uint8Array
}
object DhKeyAlgorithm {
  
  @scala.inline
  def apply(generator: js.typedarray.Uint8Array, name: java.lang.String, prime: js.typedarray.Uint8Array): org.scalajs.dom.crypto.DhKeyAlgorithm = {
    val __obj = js.Dynamic.literal(generator = generator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.DhKeyAlgorithm]
  }
  
  @scala.inline
  implicit class DhKeyAlgorithmMutableBuilder[Self <: org.scalajs.dom.crypto.DhKeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerator(value: js.typedarray.Uint8Array): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrime(value: js.typedarray.Uint8Array): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
  }
}
