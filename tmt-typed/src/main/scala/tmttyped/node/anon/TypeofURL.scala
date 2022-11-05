package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofURL extends StObject {
  
  /**
    * Creates a `'blob:nodedata:...'` URL string that represents the given `Blob` object and can be used to retrieve the `Blob` later.
    *
    * ```js
    * const {
    *   Blob,
    *   resolveObjectURL,
    * } = require('buffer');
    *
    * const blob = new Blob(['hello']);
    * const id = URL.createObjectURL(blob);
    *
    * // later...
    *
    * const otherBlob = resolveObjectURL(id);
    * console.log(otherBlob.size);
    * ```
    *
    * The data stored by the registered `Blob` will be retained in memory until`URL.revokeObjectURL()` is called to remove it.
    *
    * `Blob` objects are registered within the current thread. If using Worker
    * Threads, `Blob` objects registered within one Worker will not be available
    * to other workers or the main thread.
    * @since v16.7.0
    * @experimental
    */
  /* static member */
  def createObjectURL(blob: tmttyped.node.nodeBufferMod.Blob): String
  
  /**
    * Removes the stored `Blob` identified by the given ID. Attempting to revoke a
    * ID that isn’t registered will silently fail.
    * @since v16.7.0
    * @experimental
    * @param id A `'blob:nodedata:...` URL string returned by a prior call to `URL.createObjectURL()`.
    */
  /* static member */
  def revokeObjectURL(objectUrl: String): Unit
}
object TypeofURL {
  
  inline def apply(createObjectURL: tmttyped.node.nodeBufferMod.Blob => String, revokeObjectURL: String => Unit): TypeofURL = {
    val __obj = js.Dynamic.literal(createObjectURL = js.Any.fromFunction1(createObjectURL), revokeObjectURL = js.Any.fromFunction1(revokeObjectURL))
    __obj.asInstanceOf[TypeofURL]
  }
  
  extension [Self <: TypeofURL](x: Self) {
    
    inline def setCreateObjectURL(value: tmttyped.node.nodeBufferMod.Blob => String): Self = StObject.set(x, "createObjectURL", js.Any.fromFunction1(value))
    
    inline def setRevokeObjectURL(value: String => Unit): Self = StObject.set(x, "revokeObjectURL", js.Any.fromFunction1(value))
  }
}
