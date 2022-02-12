package tmttyped.rsocketCore

import tmttyped.node.bufferMod.global.Buffer
import tmttyped.rsocketCore.rsocketencodingMod.Encoders
import tmttyped.rsocketTypes.reactiveSocketTypesMod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketbinaryframingMod {
  
  @JSImport("rsocket-core/RSocketBinaryFraming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializeFrame(buffer: Buffer): Frame = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrame")(buffer.asInstanceOf[js.Any]).asInstanceOf[Frame]
  @scala.inline
  def deserializeFrame(buffer: Buffer, encoders: Encoders[Any]): Frame = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrame")(buffer.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[Frame]
  
  @scala.inline
  def deserializeFrameWithLength(buffer: Buffer): Frame = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrameWithLength")(buffer.asInstanceOf[js.Any]).asInstanceOf[Frame]
  @scala.inline
  def deserializeFrameWithLength(buffer: Buffer, encoders: Encoders[Any]): Frame = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrameWithLength")(buffer.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[Frame]
  
  @scala.inline
  def deserializeFrames(buffer: Buffer): js.Tuple2[js.Array[Frame], Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrames")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[Frame], Buffer]]
  @scala.inline
  def deserializeFrames(buffer: Buffer, encoders: Encoders[Any]): js.Tuple2[js.Array[Frame], Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrames")(buffer.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Frame], Buffer]]
  
  @scala.inline
  def serializeFrame(frame: Frame): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def serializeFrame(frame: Frame, encoders: Encoders[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFrame")(frame.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def serializeFrameWithLength(frame: Frame): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFrameWithLength")(frame.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def serializeFrameWithLength(frame: Frame, encoders: Encoders[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFrameWithLength")(frame.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def sizeOfFrame(frame: Frame): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeOfFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def sizeOfFrame(frame: Frame, encoders: Encoders[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeOfFrame")(frame.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[Double]
}
