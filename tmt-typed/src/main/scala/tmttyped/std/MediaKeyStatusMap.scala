package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface is a read-only map of media key statuses by key IDs.
  * Available only in secure contexts.
  */
@js.native
trait MediaKeyStatusMap extends StObject {
  
  /* standard DOM.Iterable */
  def entries(): IterableIterator[js.Tuple2[BufferSource, MediaKeyStatus]] = js.native
  
  /* standard DOM */
  def forEach(
    callbackfn: js.Function3[/* value */ MediaKeyStatus, /* key */ BufferSource, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ MediaKeyStatus, /* key */ BufferSource, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /* standard DOM */
  def get(keyId: BufferSource): js.UndefOr[MediaKeyStatus] = js.native
  
  /* standard DOM */
  def has(keyId: BufferSource): scala.Boolean = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[BufferSource, MediaKeyStatus]]] = js.native
  
  /* standard DOM.Iterable */
  def keys(): IterableIterator[BufferSource] = js.native
  
  /* standard DOM */
  val size: Double = js.native
  
  /* standard DOM.Iterable */
  def values(): IterableIterator[MediaKeyStatus] = js.native
}
