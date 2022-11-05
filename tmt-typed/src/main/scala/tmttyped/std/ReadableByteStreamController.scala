package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableByteStreamController extends StObject {
  
  /* standard DOM */
  val byobRequest: ReadableStreamBYOBRequest | Null = js.native
  
  /* standard DOM */
  def close(): Unit = js.native
  
  /* standard DOM */
  val desiredSize: Double | Null = js.native
  
  /* standard DOM */
  def enqueue(chunk: js.typedarray.ArrayBufferView): Unit = js.native
  
  /* standard DOM */
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
}
