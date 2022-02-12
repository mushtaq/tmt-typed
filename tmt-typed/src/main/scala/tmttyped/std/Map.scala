package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map[K, V] extends StObject {
  
  /* standard es2015.collection */
  def clear(): Unit = js.native
  
  /* standard es2015.collection */
  def delete(key: K): scala.Boolean = js.native
  
  /**
    * Returns an iterable of key, value pairs for every entry in the map.
    */
  /* standard es2015.iterable */
  def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
  
  /* standard es2015.collection */
  def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], Unit], thisArg: Any): Unit = js.native
  
  /* standard es2015.collection */
  def get(key: K): js.UndefOr[V] = js.native
  
  /* standard es2015.collection */
  def has(key: K): scala.Boolean = js.native
  
  /** Returns an iterable of entries in the map. */
  /* standard es2015.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
  
  /**
    * Returns an iterable of keys in the map
    */
  /* standard es2015.iterable */
  def keys(): IterableIterator[K] = js.native
  
  /* standard es2015.collection */
  def set(key: K, value: V): this.type = js.native
  
  /* standard es2015.collection */
  val size: Double = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
  
  /**
    * Returns an iterable of values in the map
    */
  /* standard es2015.iterable */
  def values(): IterableIterator[V] = js.native
}
