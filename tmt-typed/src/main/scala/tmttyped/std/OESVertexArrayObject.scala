package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OESVertexArrayObject extends StObject {
  
  /* standard DOM */
  val VERTEX_ARRAY_BINDING_OES: GLenum = js.native
  
  /* standard DOM */
  def bindVertexArrayOES(): Unit = js.native
  def bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  
  /* standard DOM */
  def createVertexArrayOES(): WebGLVertexArrayObjectOES | Null = js.native
  
  /* standard DOM */
  def deleteVertexArrayOES(): Unit = js.native
  def deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  
  /* standard DOM */
  def isVertexArrayOES(): GLboolean = js.native
  def isVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): GLboolean = js.native
}
