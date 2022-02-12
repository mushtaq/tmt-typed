package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeakMap[K /* <: js.Object */, V] extends StObject {
  
  /* standard es2015.collection */
  def delete(key: K): scala.Boolean = js.native
  
  /* standard es2015.collection */
  def get(key: K): js.UndefOr[V] = js.native
  
  /* standard es2015.collection */
  def has(key: K): scala.Boolean = js.native
  
  /* standard es2015.collection */
  def set(key: K, value: V): this.type = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
}
