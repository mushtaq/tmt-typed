package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a standard abstraction for writing streaming data to a destination, known as a sink. This object comes with built-in backpressure and queuing. */
@js.native
trait WritableStream[W] extends StObject {
  
  /* standard DOM */
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: Any): js.Promise[Unit] = js.native
  
  /* standard DOM */
  def close(): js.Promise[Unit] = js.native
  
  /* standard DOM */
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
  
  /* standard DOM */
  val locked: scala.Boolean = js.native
}
