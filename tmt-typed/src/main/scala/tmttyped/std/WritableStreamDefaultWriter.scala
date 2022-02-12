package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface is the object returned by WritableStream.getWriter() and once created locks the < writer to the WritableStream ensuring that no other streams can write to the underlying sink. */
@js.native
trait WritableStreamDefaultWriter[W] extends StObject {
  
  /* standard DOM */
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: Any): js.Promise[Unit] = js.native
  
  /* standard DOM */
  def close(): js.Promise[Unit] = js.native
  
  /* standard DOM */
  val closed: js.Promise[Unit] = js.native
  
  /* standard DOM */
  val desiredSize: Double | Null = js.native
  
  /* standard DOM */
  val ready: js.Promise[Unit] = js.native
  
  /* standard DOM */
  def releaseLock(): Unit = js.native
  
  /* standard DOM */
  def write(): js.Promise[Unit] = js.native
  def write(chunk: W): js.Promise[Unit] = js.native
}
