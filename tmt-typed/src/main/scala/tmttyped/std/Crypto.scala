package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Basic cryptography features available in the current context. It allows access to a cryptographically strong random number generator and to cryptographic primitives. */
trait Crypto extends StObject {
  
  /* standard DOM */
  def getRandomValues[T /* <: js.typedarray.ArrayBufferView | Null */](array: T): T
  
  /** Available only in secure contexts. */
  /* standard DOM */
  val subtle: org.scalajs.dom.SubtleCrypto
}
object Crypto {
  
  @scala.inline
  def apply(getRandomValues: Any => Any, subtle: org.scalajs.dom.SubtleCrypto): Crypto = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crypto]
  }
  
  @scala.inline
  implicit class CryptoMutableBuilder[Self <: Crypto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRandomValues(value: Any => Any): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubtle(value: org.scalajs.dom.SubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
