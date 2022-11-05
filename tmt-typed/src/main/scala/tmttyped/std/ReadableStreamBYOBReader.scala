package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamBYOBReader
  extends StObject
     with ReadableStreamGenericReader {
  
  /* standard DOM */
  def read(view: js.typedarray.ArrayBufferView): js.Promise[ReadableStreamReadResult[js.typedarray.ArrayBufferView]] = js.native
  
  /* standard DOM */
  def releaseLock(): Unit = js.native
}
