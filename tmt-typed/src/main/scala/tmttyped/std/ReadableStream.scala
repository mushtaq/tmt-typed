package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface represents a readable stream of byte data. The Fetch API offers a concrete instance of a ReadableStream through the body property of a Response object. */
@js.native
trait ReadableStream[R] extends StObject {
  
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: js.Any): js.Promise[Unit] = js.native
  
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  
  val locked: scala.Boolean = js.native
  
  def pipeThrough[T](transform: ReadableWritablePair[T, R]): org.scalajs.dom.experimental.ReadableStream[T] = js.native
  def pipeThrough[T](transform: ReadableWritablePair[T, R], options: StreamPipeOptions): org.scalajs.dom.experimental.ReadableStream[T] = js.native
  
  def pipeTo(dest: WritableStream[R]): js.Promise[Unit] = js.native
  def pipeTo(dest: WritableStream[R], options: StreamPipeOptions): js.Promise[Unit] = js.native
  
  def tee(): js.Tuple2[
    org.scalajs.dom.experimental.ReadableStream[R], 
    org.scalajs.dom.experimental.ReadableStream[R]
  ] = js.native
}
